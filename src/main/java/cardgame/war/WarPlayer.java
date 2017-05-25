package cardgame.war;

import cardgame.Card;
import cardgame.Hand;
import cardgame.Player;

public class WarPlayer implements Player {
    WarHand hand;
    String name;
// don't you think it is a good idea to use here a Stack? releasing could be very simple...
// well all other handling (win and shuffle) could be complicated
    public WarPlayer(String name, WarHand hand) {
        this.name = name;
        this.hand = hand;
    }

    @Override
    public Card showCard() {
        return hand.getCard();
    }

    @Override
    public void win() {

    }
    public void showHand(){
        for (WarCard card: hand.getAllCard()){
            System.out.print(card.getValue() + ", ");
        }
    }
}
