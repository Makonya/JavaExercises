package com.training.string.b;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String text;
    private static List<Word> words = new ArrayList<>();

    public Word(String text) {
        this.text = text;
        words.add(this);
    }

    public void print() {
        System.out.print(this.text + " ");
    }

    public String getText() {
        return text;
    }

    public static List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "Word{" +
                "text='" + text + '\'' +
                '}';
    }
}
