package cardgame.war;

import cardgame.Card;
import cardgame.Hand;

import java.util.ArrayList;
import java.util.List;

public class WarHand implements Hand {
    private List<WarCard> cards = new ArrayList<>();
    public Card getCard() {
        return cards.remove(cards.size());
    }

    public void addCard(WarCard card) {
        cards.add(card);
    }

    public List<WarCard> getAllCard() {
        return cards;
    }
}
