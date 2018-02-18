
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
public class randomDeck {
    
    ArrayList<Card> list = new ArrayList<Card>();
    
    public randomDeck() {
        addCards();
        shuffle();
    }
    
    public void shuffle() {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 24; j++)
            {
                int selectIndexOne = (int) (Math.random()*24);
                int selectIndexTwo = (int) (Math.random()*24);
                
                Card tempCard = list.get(selectIndexOne);
                
                list.set(selectIndexOne, list.get(selectIndexTwo));
                list.set(selectIndexTwo, tempCard);
                
            }
        }
    }
    
    public void addCards() {
        Deck deck = new Deck();
        list.add(deck.spades_three);
        list.add(deck.spades_two);
        list.add(deck.spades_ace);
        list.add(deck.spades_king);
        list.add(deck.spades_queen);
        list.add(deck.spades_jay);
        
        list.add(deck.hearts_three);
        list.add(deck.hearts_two);
        list.add(deck.hearts_ace);
        list.add(deck.hearts_king);
        list.add(deck.hearts_queen);
        list.add(deck.hearts_jay);
        
        list.add(deck.diamonds_three);
        list.add(deck.diamonds_two);
        list.add(deck.diamonds_ace);
        list.add(deck.diamonds_king);
        list.add(deck.diamonds_queen);
        list.add(deck.diamonds_jay);
        
        list.add(deck.clubs_three);
        list.add(deck.clubs_two);
        list.add(deck.clubs_ace);
        list.add(deck.clubs_king);
        list.add(deck.clubs_queen);
        list.add(deck.clubs_jay);
    }
    
}
