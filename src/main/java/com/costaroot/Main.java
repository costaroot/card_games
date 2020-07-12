package com.costaroot;

import com.costaroot.cardsuit.Card;
import com.costaroot.cardsuit.Derk;
import com.costaroot.cardsuit.Rank;
import com.costaroot.cardsuit.Suit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nike!");
        //Card card = new Card(Rank.values[0], Suit.values[0]);
        //System.out.println(card.getRank().getName());

        Derk derk = new Derk();
        System.out.println(derk.getDerk());
    }
}
