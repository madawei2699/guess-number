package com.thoughtworks.guessnumber;

import java.util.Random;

public class RandomIntGenerator {
    public int nextInt() {
        return new Random().nextInt(10);
    }
}
