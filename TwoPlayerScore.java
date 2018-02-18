
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class TwoPlayerScore {
    
    ArrayList<Card> cardsWon = new ArrayList<Card>();
    int score;
    
    public void doMath() {
        checkScore();
        printResult();
    }
    
    public void checkScore() {
        int count = 0;
        for (Card e: cardsWon) {
            if (e.suit.equals("Ace"))
                score++;
            else {
                count++;
                if (count == 3) {
                    score++;
                    count = 0;
                }
            }
        }
    }
    
    public void printResult() {
        if (score == 5)
            System.out.println("The result is a draw.");
        else {
            System.out.println("The score is " + score + "—" + (10-score) + ".");
            if (score > 5)
                System.out.println("The winner is player one!");
            else
                System.out.println("The winner is player one!");
        }
    }
    
}
