package com.springbootex.sbex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springbootex.sbex1.entity.StockSymbol;

@Repository
public interface StockSymbolRepository extends JpaRepository<StockSymbol, Long> {

}