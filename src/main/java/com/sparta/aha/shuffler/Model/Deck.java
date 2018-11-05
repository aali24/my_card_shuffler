package com.sparta.aha.shuffler.Model;

import java.util.List;

public class Deck {

    private final List<Card> Cards;

    public Deck(List<Card> cards) {

        Cards = cards;
    }

    public List<Card> getCards() {

        return Cards;
    }
}
