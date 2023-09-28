public class Card {
  private Suit suit;
  private Rank rank;

  private Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public static Card of(Rank rank, Suit suit) {
    return new Card(rank, suit);
  }

  public int compare() {
    return;

  }

  // public static Jocker Jocker() {
  // return Jocker.JOCKER;
  // }
}
