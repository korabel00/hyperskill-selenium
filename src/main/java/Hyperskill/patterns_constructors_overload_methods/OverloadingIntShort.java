package Hyperskill.patterns_constructors_overload_methods;

public class OverloadingIntShort {
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }
    // write a method here
    // public static ...
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    public static short getMaxMinusCurrent(short val) {
/*      We need cast here because that the result of binary operations as +, -, *, /, % between two or more numbers
        (which are not float or double) will
        be always an int type if no bigger type is involved
        byte + short => int
        short + short => int
        byte + long => long*/
        return (short) (Short.MAX_VALUE - val);
    }

}
