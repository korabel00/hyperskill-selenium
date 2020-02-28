package Hyperskill.inteface;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{

    private byte[] array;

    public AsciiCharSequence (byte[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
    }

    @Override
    public String toString() {
        return new String(array);
    }
}

class RunAscII {
    public static void main(String[] args) {
        byte[] sample = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        AsciiCharSequence charSeq = new AsciiCharSequence(sample);
        System.out.println(charSeq.length());
        System.out.println(charSeq.charAt(4));
        System.out.println(charSeq.toString());
        System.out.println(charSeq.subSequence(2,6));
    }
}

