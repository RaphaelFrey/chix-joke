package com.chixsaw.chixjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
