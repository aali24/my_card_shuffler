package com.sparta.aha.shuffler.Model;


    public enum Suits
    {
        HEARTS
                {
                    public String getSymbol()
                    {

                        return "Heart symbol";
                    }
                },
        DIAMONDS
                {
                    public String getSymbol()
                    {

                        return "Diamond symbol";
                    }
                },
        CLUBS
                {
                    public String getSymbol()
                    {

                        return "Clubs symbol";
                    }
                },
        SPADES
                {
                    public String getSymbol()
                    {

                        return "Spades symbol";
                    }
                };

        public abstract String getSymbol();

    }
