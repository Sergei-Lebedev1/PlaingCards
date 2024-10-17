public class PlayingCard {
    private Suit suit;
    private Rank rank;

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
