package com.sparta.aha.shuffler;

import com.sparta.aha.shuffler.Model.Card;
import com.sparta.aha.shuffler.Model.Shuffler;

import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Shuffler shuffler = new Shuffler();
        List<Card> pack = shuffler.CreatePack();
        for (Card card: pack){
            System.out.println(card.getValue() +  " " + card.getSuit());
        }

        Collections.shuffle(pack);
        for (Card card: pack){
            System.out.println(card.getValue() +  " " + card.getSuit());
        }
    }
}
