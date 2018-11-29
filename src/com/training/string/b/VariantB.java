package com.training.string.b;

import static com.training.string.File.*;

public class VariantB {
    private static void parseText(String text) {
        for (String paragraphText : text.split("\n")) {
            new Paragraph(paragraphText);
        }
        for (Paragraph paragraph : Paragraph.getParagraphs()) {
            paragraph.SplitParagraphToSentences();
        }
        for (Sentence sentence : Sentence.getSentences()) {
            sentence.splitToWords();
        }
    }

    private static String folder = "src/com/training/string/b/";

    public static void main(String[] args) {
        String text = readFile(folder + "THE PURSUIT OF HAPPINESS.txt");
        parseText(text);
        for (Paragraph paragraph : Paragraph.getParagraphs()) {
            paragraph.print();
        }
        System.out.println("Task #5(B)");

        for (Sentence sentence : Sentence.getSentences()) {
            Word tempContainerForFirstWord = sentence.getWords().get(0);
            Word tempContainerForSecondWord = sentence.getWords().get(sentence.getWords().size()-1);
            sentence.getWords().remove(0);
            sentence.getWords().remove(sentence.getWords().size()-1);
            sentence.getWords().add(0, tempContainerForSecondWord);
            sentence.getWords().add(tempContainerForFirstWord);

        }
        for (Paragraph paragraph : Paragraph.getParagraphs()) {
            paragraph.print();
        }
    }
}
