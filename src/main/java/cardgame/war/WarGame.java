package cardgame.war;

import cardgame.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        List<WarPlayer> players= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("WarGame!");
        System.out.println("Number of players?");
        int playersNumber= sc.nextInt();
        sc.nextLine();
        WarDeck deck = new WarDeck(playersNumber);
        for (int i = 0; i < playersNumber; i++){
            System.out.println("Player " + i + ". name?");
            players.add(new WarPlayer(sc.nextLine(),deck.getHand(i)));
            players.get(i).showHand();
        }

        do {

        } while (1<players.size());
        System.out.println("And the winner is: " + players.get(0) + "!");
    }
}
