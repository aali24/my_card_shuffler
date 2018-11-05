package com.sparta.aha.shuffler.Model;

import java.util.ArrayList;
import java.util.List;

public class Shuffler {

    private List<Card> pack = new ArrayList<>();

    public List<Card> CreatePack() {
        for (Suits suit : Suits.values()) {
            for (CardValues value : CardValues.values()) {
                pack.add(new Card(suit.getSymbol(), value.getValue()));
            }
        }
        return pack;
    }
}

