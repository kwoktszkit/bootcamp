package com.springbootex.sbex1.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.springbootex.sbex1.entity.Stock;
import com.springbootex.sbex1.entity.StockPrice;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.CompanyProfile;
import com.springbootex.sbex1.model.Quote;
import com.springbootex.sbex1.model.Symbol;
import com.springbootex.sbex1.model.mapper.FinnhubMapper;
import com.springbootex.sbex1.repository.StockPriceRepository;
import com.springbootex.sbex1.repository.StockRepository;
import com.springbootex.sbex1.service.CompanyService;
import com.springbootex.sbex1.service.StockPriceService;
import com.springbootex.sbex1.service.StockSymbolService;

@Profile("!test")
@Component
public class AppStartRunner implements CommandLineRunner {

  // The company list that you want to support (Database)
  public static final List<String> stockInventory = List.of("AAPL", "MSFT", "TSLA");

  public static List<String> availableStockList = new ArrayList<>();

  @Autowired
  private StockSymbolService stockSymbolService;

  @Autowired
  private StockPriceService stockPriceService;

  @Autowired
  private CompanyService companyService;

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private StockPriceRepository stockPriceRepository;

  @Autowired
  private FinnhubMapper finnhubMapper;

  @Override
  public void run(String... args) throws AppException {

    // Before Server Start:
    // 0. Get all symbols (US) from the below API.
    // https://finnhub.io/api/v1/stock/symbol?exchange=US&token=?
    // 0. Create one more Entity StockSymbol
    // Clear the tables
    stockPriceRepository.deleteAll();
    companyService.deleteAll();
    stockSymbolService.deleteAll();

    // Call API to get all symbols
    List<Symbol> symbols = stockSymbolService.getAllSymbols().stream()
        .filter(symbol -> stockInventory.contains(symbol.getSymbol()))
        .collect(Collectors.toList());
    System.out
        .println("All Symbols are inserted. No. of Symbols=" + symbols.size());
    // 1. Save all symbols
    stockSymbolService.save(symbols).stream() //
        // .limit(10L) // limit 10 stocks
        .forEach(symbol -> {
          try {
            // 2. Get Compnay Profile 2 and insert into database
            CompanyProfile companyProfile = companyService.getCompanyProfile(symbol.getSymbol());
            Stock stock = finnhubMapper.map(companyProfile);
            stock.setStockSymbol(symbol);
            Stock storedStock = stockRepository.save(stock);
            System.out.println("completed symbol=" + symbol.getSymbol());

            // 3. Get Stock price and insert into database
            Quote quote = stockPriceService.getQuote(symbol.getSymbol());
            StockPrice stockPrice = finnhubMapper.map(quote);
            stockPrice.setStock(storedStock);
            stockPriceRepository.save(stockPrice);
            System.out.println("completed symbol=" + symbol.getSymbol());
            // 4. Get Symbol
            availableStockList.add(symbol.getSymbol());

          } catch (AppException e) {
            System.out
                .println("RestClientException: Symbol" + symbol.getSymbol());
          }
        });
    System.out.println("Stocks in Inventory are inserted.");
    System.out.println("CommandLineRunner Completed");
    // System.setProperty("enableScheduling", "true");
    SchedulerTaskConfig.start = true;
  }

}