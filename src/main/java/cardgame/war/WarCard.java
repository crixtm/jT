package cardgame.war;

import cardgame.Card;

class WarCard implements Card {
    public WarCard(String value) {
        this.value = value;
    }

    @Override
    public boolean isBigger(Card card) {

        return true;
    }

    @Override
    public String getValue() {
        return value;
    }

    private String value;

}
