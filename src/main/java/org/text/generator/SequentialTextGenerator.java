package org.text.generator;

public class SequentialTextGenerator implements TextGenerator {

    private final int length;
    private final StringBuilder stringBuilder;

    public SequentialTextGenerator(int length) {
        if( length <= 0) {
            throw new RuntimeException("Illegal Length:" + length);
        }
        this.length = length;
        this.stringBuilder = new StringBuilder();
        for(int i=0; i<length; i++) {
            stringBuilder.append('a');
        }
    }

    private void incrementText() {
        for(int i=length-1; i>=0; i--) {
            if(stringBuilder.charAt(i) == 'z') {
                // we are only assuming char set a-z for now
                // this implementation could be refined further if needed
                stringBuilder.setCharAt(i, 'a');
            } else {
                stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i) + 1));
                break;
            }
        }
    }

    @Override
    public String getText() {
        String originalValue = stringBuilder.toString();
        incrementText();
        return originalValue;
    }
}
