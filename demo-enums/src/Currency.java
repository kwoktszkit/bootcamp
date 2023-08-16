public enum Currency {

  USD(1, "US Dollor"),
  HKD(2, "Hong Kong Dollor"),
  CNY(3, "Chinese Yuan Renminbi"),
  GBP(4, "British Pound Sterling"),
  ;

  private int id;
  private String desc;

  private Currency(int id, String desc) {
    this.id = id;
    this.desc = desc;
  }

  public String getDesc() {
    return this.desc;
  }

  public static Currency getCurrency(int id) {
    for (Currency currency : Currency.values()) {
      if (currency.id == id)
        return currency;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDesc());
  }
}
