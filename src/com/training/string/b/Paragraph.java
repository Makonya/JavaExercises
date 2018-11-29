package com.training.string.b;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {
    private static List<Paragraph> paragraphs = new ArrayList<>();
    private String text;
    private List<Sentence> sentences = new ArrayList<>();
    private static final Pattern patternRegexSentence = Pattern.compile("[^.!?]*[.!?]");

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
        paragraphs.add(this);
    }

    public static List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public static void printAllParagraphs() {
        for (Paragraph paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }

    public void SplitParagraphToSentences() {
        Matcher matcher = patternRegexSentence.matcher(this.text);
        while (matcher.find()) {
            this.sentences.add(new Sentence(matcher.group()));
        }
    }

    public void print() {

        for (Sentence sentence : this.sentences) {
            sentence.print();
        }
        System.out.printf("\n");
    }

//    public static void SplitToSentences(){
//        for (Paragraph paragraph : paragraphs) {
//            for (String sentenceText : paragraph.text.split("[.!?]\\s*")) {
//                new Sentence(sentenceText);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}
