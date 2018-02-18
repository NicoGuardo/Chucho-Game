
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
public class twoPlayerDeck {
    
    ArrayList<Card> cardList = new ArrayList<Card>();
    
    public twoPlayerDeck(boolean t, randomDeck ranD) {
        addCards(t, ranD);
    }
    
    public void addCards(boolean t, randomDeck ranD) {
        if (t) {
            for (int i = 0; i < 12; i++) {
                cardList.add(ranD.list.get(i));
            }
        } else {
            for (int i = 12; i < 24; i++) {
                cardList.add(ranD.list.get(i));
            }
        }
    }
    
}
