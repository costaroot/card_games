package com.costaroot.cardsuit;

public class Rank {
    private String name;

    public Rank(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static final Rank ACE = new Rank("ACE");
    public static final Rank KING = new Rank("KING");
    public static final Rank QUEEN = new Rank("QUEEN");
    public static final Rank JACK = new Rank("JACK");
    public static final Rank TEN = new Rank("10");
    public static final Rank NINE = new Rank("9");
    public static final Rank EIGHT = new Rank("8");
    public static final Rank SEVEN = new Rank("7");
    public static final Rank SIX = new Rank("6");
    public static final Rank FIVE = new Rank("5");
    public static final Rank FOUR = new Rank("4");
    public static final Rank THREE = new Rank("3");
    public static final Rank TWO = new Rank("2");

    public static Rank [] values = {ACE,KING,QUEEN,JACK,TEN,NINE,EIGHT,SEVEN,SIX,FIVE,FOUR,THREE,TWO};

}
