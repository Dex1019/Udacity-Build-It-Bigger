package com.dex.letsjoke.app;

import com.dex.letsjoke.javajokeslib.model.Joke;

public interface JokeListener {
    void jokeReceived(Joke joke);
}
