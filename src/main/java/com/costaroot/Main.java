package com.costaroot;

import com.costaroot.cardsuit.Card;
import com.costaroot.cardsuit.Rank;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nike!");
        Card card = new Card(Rank.values[0]);
        System.out.println(card.getRank().getName());
    }
}
