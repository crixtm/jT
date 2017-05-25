package cardgame;

public interface Deck {
    Card dealOneCard();
    void shuffleDeck();
    void prepareDeck();
    boolean isDeckEmpty();
    Hand getHand(int thisPlayer);
}
