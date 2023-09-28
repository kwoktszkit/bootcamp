
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Super
public class Address {
  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  @NonNull
  private Country country;

  public Address(Country country) {
    if (country == null) {

    }
  }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK);
    Address a2 = Address.builder()
        .addrLine1("")
        .addrLine2("")
        .addrLine3("")
        .country(Country.US)
        .build();
  }
}
