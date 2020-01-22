package com.thoughtworks.guessnumber.config;

import com.google.inject.AbstractModule;
import com.thoughtworks.guessnumber.ConsoleGameView;
import com.thoughtworks.guessnumber.ConsoleInputCollector;
import com.thoughtworks.guessnumber.GameView;
import com.thoughtworks.guessnumber.InputCollector;

public class GuessNumberModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(GameView.class).to(ConsoleGameView.class);
        bind(InputCollector.class).to(ConsoleInputCollector.class);
    }
}