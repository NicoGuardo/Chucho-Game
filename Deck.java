/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class Deck {
    /*
        This sets up a deck with 24 cards for the game.
    */
    
    String spades = "Spades";
    String hearts = "Hearts";
    String diamonds = "Diamonds";
    String clubs = "Clubs";
    
    // Spades
    Card spades_three = new Card(spades,"Three",6);
    Card spades_two = new Card(spades,"Two",5);
    Card spades_ace = new Card(spades,"Ace",4);
    Card spades_king = new Card(spades,"King",3);
    Card spades_queen = new Card(spades,"Queen",2);
    Card spades_jay = new Card(spades,"Jay",1);
    // Hearts
    Card hearts_three = new Card(hearts,"Three",6);
    Card hearts_two = new Card(hearts,"Two",5);
    Card hearts_ace = new Card(hearts,"Ace",4);
    Card hearts_king = new Card(hearts,"King",3);
    Card hearts_queen = new Card(hearts,"Queen",2);
    Card hearts_jay = new Card(hearts,"Jay",1);
    // Diamonds
    Card diamonds_three = new Card(diamonds,"Three",6);
    Card diamonds_two = new Card(diamonds,"Two",5);
    Card diamonds_ace = new Card(diamonds,"Ace",4);
    Card diamonds_king = new Card(diamonds,"King",3);
    Card diamonds_queen = new Card(diamonds,"Queen",2);
    Card diamonds_jay = new Card(diamonds,"Jay",1);
    // Clubs
    Card clubs_three = new Card(clubs,"Three",6);
    Card clubs_two = new Card(clubs,"Two",5);
    Card clubs_ace = new Card(clubs,"Ace",4);
    Card clubs_king = new Card(clubs,"King",3);
    Card clubs_queen = new Card(clubs,"Queen",2);
    Card clubs_jay = new Card(clubs,"Jay",1);
}
