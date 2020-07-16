package com.costaroot.cardsuit;

import java.util.LinkedList;
import java.util.List;

public class Derk {
    private LinkedList<Card> derk;

    public Derk(){
        derk = new LinkedList<>();
        for (Suit su:Suit.values) {
            for (Rank rnk:Rank.values) {
                derk.push(new Card(rnk,su));
            }
        }
    }

    public Card getCard() {
        return derk.pop();
    }

}
