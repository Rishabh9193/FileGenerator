package org.text.generator;

import static org.junit.jupiter.api.Assertions.*;

class SequentialTextGeneratorTest {

    @org.junit.jupiter.api.Test
    void testSequence() {
        TextGenerator textGenerator = new SequentialTextGenerator(2);
        assertEquals(textGenerator.getText(), "aa");
        assertEquals(textGenerator.getText(), "ab");
        assertEquals(textGenerator.getText(), "ac");
        assertEquals(textGenerator.getText(), "ad");
        assertEquals(textGenerator.getText(), "ae");
        assertEquals(textGenerator.getText(), "af");
        assertEquals(textGenerator.getText(), "ag");
        assertEquals(textGenerator.getText(), "ah");
        assertEquals(textGenerator.getText(), "ai");
        assertEquals(textGenerator.getText(), "aj");
        assertEquals(textGenerator.getText(), "ak");
        assertEquals(textGenerator.getText(), "al");
        assertEquals(textGenerator.getText(), "am");
        assertEquals(textGenerator.getText(), "an");
        assertEquals(textGenerator.getText(), "ao");
        assertEquals(textGenerator.getText(), "ap");
        assertEquals(textGenerator.getText(), "aq");
        assertEquals(textGenerator.getText(), "ar");
        assertEquals(textGenerator.getText(), "as");
        assertEquals(textGenerator.getText(), "at");
        assertEquals(textGenerator.getText(), "au");
        assertEquals(textGenerator.getText(), "av");
        assertEquals(textGenerator.getText(), "aw");
        assertEquals(textGenerator.getText(), "ax");
        assertEquals(textGenerator.getText(), "ay");
        assertEquals(textGenerator.getText(), "az");
        assertEquals(textGenerator.getText(), "ba");
        assertEquals(textGenerator.getText(), "bb");
        assertEquals(textGenerator.getText(), "bc");
        assertEquals(textGenerator.getText(), "bd");
    }

    @org.junit.jupiter.api.Test
    void testCycle() {
        TextGenerator textGenerator = new SequentialTextGenerator(1);
        assertEquals(textGenerator.getText(), "a");
        assertEquals(textGenerator.getText(), "b");
        assertEquals(textGenerator.getText(), "c");
        assertEquals(textGenerator.getText(), "d");
        assertEquals(textGenerator.getText(), "e");
        assertEquals(textGenerator.getText(), "f");
        assertEquals(textGenerator.getText(), "g");
        assertEquals(textGenerator.getText(), "h");
        assertEquals(textGenerator.getText(), "i");
        assertEquals(textGenerator.getText(), "j");
        assertEquals(textGenerator.getText(), "k");
        assertEquals(textGenerator.getText(), "l");
        assertEquals(textGenerator.getText(), "m");
        assertEquals(textGenerator.getText(), "n");
        assertEquals(textGenerator.getText(), "o");
        assertEquals(textGenerator.getText(), "p");
        assertEquals(textGenerator.getText(), "q");
        assertEquals(textGenerator.getText(), "r");
        assertEquals(textGenerator.getText(), "s");
        assertEquals(textGenerator.getText(), "t");
        assertEquals(textGenerator.getText(), "u");
        assertEquals(textGenerator.getText(), "v");
        assertEquals(textGenerator.getText(), "w");
        assertEquals(textGenerator.getText(), "x");
        assertEquals(textGenerator.getText(), "y");
        assertEquals(textGenerator.getText(), "z");
        assertEquals(textGenerator.getText(), "a");

    }
}