package com.thoughtworks.guessnumber;

import java.util.List;

public interface GameView {
    void showCurrentResult(GuessResult guessResult);

    void showGuessHistory(List<GuessResult> guessResults);

    void showMessage(String message);
}
