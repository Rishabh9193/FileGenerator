package org.app;

import org.file.io.LineFileWriter;
import org.file.io.LineFileWriterImpl;
import org.text.generator.SequentialTextGenerator;
import org.text.generator.TextGenerator;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.err.println("Missing line count argument");
            System.exit(-1);
        }

        int x = Integer.parseInt(args[0]);
        if(x<1 || x>229) {
            System.err.println("Invalid value for x, Permitted range: [1-229]. Entered value:" + x);
        }
        int stringLength = 100;
        String filePath = "src/main/resources/abc.txt";

        TextGenerator textGenerator = new SequentialTextGenerator(stringLength);
        LineFileWriter lineFileWriter = null;
        try {
            lineFileWriter = new LineFileWriterImpl(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i=0; i<x; i++) {
            lineFileWriter.writeLine(textGenerator.getText());
        }

        lineFileWriter.close();
    }
}