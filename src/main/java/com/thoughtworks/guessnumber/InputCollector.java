package com.thoughtworks.guessnumber;

import com.thoughtworks.guessnumber.exceptions.AnswerIllegalException;

public interface InputCollector {
    Answer input() throws AnswerIllegalException;
}
