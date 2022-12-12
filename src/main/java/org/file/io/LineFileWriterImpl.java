package org.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineFileWriterImpl implements LineFileWriter {

    private final File file;
    private final PrintWriter printWriter;
    private int lineCount;
    private final int lineFlushCount;

    public LineFileWriterImpl(String path) throws IOException {
        this(path, 20);
    }

    public LineFileWriterImpl(String path, int lineFlushCount) throws IOException {
        this.file = new File(path);
        this.printWriter = new PrintWriter(new FileWriter(file));
        this.lineFlushCount = lineFlushCount;
        this.lineCount = 0;
    }

    @Override
    public void writeLine(String line) {
        lineCount++;
        if(lineCount != 1) {
            // Don't insert line before first line
            printWriter.println();
        }

        printWriter.print(line);
        if(lineCount % lineFlushCount == 0) {
            printWriter.flush();
        }
    }

    @Override
    public void close() {
        printWriter.flush();
        printWriter.close();
    }
}
