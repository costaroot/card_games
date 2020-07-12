package com.costaroot.cardsuit;

public class Suit {
    private String suit;

    public Suit(String suit){
        this.suit = suit;
    }

    public static final Suit CLUBS = new Suit("Clubs");
    public static final Suit SPADES = new Suit("Spades");
    public static final Suit DIAMONDS = new Suit("Diamonds");
    public static final Suit HEARTS = new Suit("Hearts");

    public static final Suit [] values = {CLUBS,SPADES,DIAMONDS,HEARTS};
}
