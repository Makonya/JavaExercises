package com.training.string.b;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private static List<Sentence> sentences = new ArrayList<>();
    private String text;
    private List<Word> words = new ArrayList<>();

    public Sentence(String text) {
        this.text = text;
        sentences.add(this);
    }

    public List<Word> getWords() {
        return words;
    }

    public static List<Sentence> getSentences() {
        return sentences;
    }

    public static void printAllSentences() {
        System.out.println("Sentences:");
        for (Sentence sentence : sentences) {
            System.out.println(sentence);
        }
    }

    public void splitToWords() {
        for (String word : this.text.split(" ")) {
            this.words.add(new Word(word));
        }
    }

    public void print() {
        for (Word word : this.words) {
            word.print();
        }
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "text='" + text + '\'' +
                '}';
    }
}
