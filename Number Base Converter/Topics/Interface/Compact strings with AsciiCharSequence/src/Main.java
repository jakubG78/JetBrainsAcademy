import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] asciiCharArray;

    AsciiCharSequence(byte[] arr) {
        this.asciiCharArray = arr.clone();
    }

    @Override
    public int length() {
        return asciiCharArray.length;
    }

    @Override
    public char charAt(int index) {
        return index < asciiCharArray.length && index >= 0 ? (char) asciiCharArray[index] : '\000';
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] resultArray = new byte[end - start];
        for (int i = 0; i < end - start; i++) {
            resultArray[i] = asciiCharArray[start + i];
        }
        return new AsciiCharSequence(resultArray);
    }

    @Override
    public String toString() {
        return new String(asciiCharArray);
    }
}