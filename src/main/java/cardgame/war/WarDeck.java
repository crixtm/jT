package cardgame.war;

import cardgame.Card;
import cardgame.Deck;
import cardgame.Hand;

import java.util.*;

class WarDeck implements Deck {
    private static final int NUMBER_OF_COLORS = 4;
    final String[] cardNumbers = {"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
    List<WarCard> initialDeck = new ArrayList<>();
    //List<WarCard> shuffledDeck = new ArrayList<>();
    List<WarHand> hands = new ArrayList<>();

    public WarDeck(int playersNumber) {
        prepareDeck();
        shuffleDeck();
        prepareHands(playersNumber);
    }

    private void prepareHands(int playersNumber) {
        for (int i = 0; i<playersNumber; i++){
            hands.add(new WarHand());
        }
        do {
            for (int i = 0; i<playersNumber; i++){
                hands.get(i).addCard(initialDeck.remove(0));
                if (!initialDeck.iterator().hasNext()){
                    break;
                }
            }
        } while (initialDeck.iterator().hasNext());
    }

    @Override
    public Card dealOneCard() {
        return null;
    }

    @Override
    public void shuffleDeck() {
        //initialDeck.addAll(shuffledDeck);
        Collections.shuffle(initialDeck);
    }

    @Override
    public void prepareDeck() {

        for (int i = 0; i<NUMBER_OF_COLORS; i++){
            for (String value : cardNumbers){
                initialDeck.add(new WarCard(value));
            }
        }
    }

    @Override
    public boolean isDeckEmpty() {
        return false;
    }

    @Override
    public WarHand getHand(int thisplayer) {
        return hands.get(thisplayer);
    }
}
