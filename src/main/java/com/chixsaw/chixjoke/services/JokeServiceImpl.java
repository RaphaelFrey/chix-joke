package com.chixsaw.chixjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
