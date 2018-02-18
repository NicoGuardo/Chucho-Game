/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class Card {
    String suit;
    String type;
    int value;
    
    public Card() {
    }
    
    public Card(String s) {
        suit = s;
    }
    
    public Card(String a, String b, int c) {
        suit = a;
        type = b;
        value = c;
    }
    
    @Override
    public String toString()
    {
        return type + " of " + suit;
    }
}
