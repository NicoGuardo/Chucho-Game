
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class twoPlayerGame extends TwoPlayerScore{
    
    Scanner scan = new Scanner(System.in);
    randomDeck ranD = new randomDeck();
    
    // Boolean is for player one or two when dealing the cards
    twoPlayerDeck one = new twoPlayerDeck(true, ranD);
    twoPlayerDeck two = new twoPlayerDeck(false, ranD);
    
    public twoPlayerGame() {
        System.out.println("Player one deck:");
        printCards(one);
        //System.out.println("Player two deck:");
        //printCards(two);
        while (one.cardList.size() > 0) {
            doMove();
            printCards(one);
        }
        doMath();
    }
    
    public void doMove() {
        Card a = selectCard(one);
        Card b = selectCard(two);
        System.out.println(a + " vs " + b);
        Card winner = compareCard(a, b);
        System.out.println("The " + winner + " wins!\n");
        if (winner == a) {
            cardsWon.add(a);
            cardsWon.add(b);
        }
    }
    
    // This simply prints out all cards in deck.
    public void printCards(twoPlayerDeck d) {
        for (int i = 0; i < d.cardList.size(); i++) {
            System.out.print(i+1 + ".");
            System.out.println(d.cardList.get(i));
        }
        System.out.println();
    }
    
    // This compares if two cards are equal.
    public Card compareCard (Card a, Card b) {
        if (a.suit.equals(b.suit)){
            if (a.value < b.value)
                return b;
        }
        return a;
    }
    
    // This selects a card and deletes it from the list.
    public Card selectCard(twoPlayerDeck d) {
        System.out.println("Enter your card.");
        int i = scan.nextInt() - 1;
        System.out.println();
        Card card = d.cardList.get(i);
        d.cardList.remove(card);
        return card;
    }
    
}
