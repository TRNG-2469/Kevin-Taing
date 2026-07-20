public class PrimitivePractice {
    void main() {
        // Step 1
        byte varByte = 1;
        short varShort = 2;
        int varInt = 3;
        long varLong = 4L;
        float varFloat = 5.6f;
        double varDouble = 7.8;
        char varChar = 'a';
        boolean varBoolean = true;

        System.out.println("Byte: " + varByte);
        System.out.println("Short: " + varShort);
        System.out.println("Int: " + varInt);
        System.out.println("Long: " + varLong);
        System.out.println("Float: " + varFloat);
        System.out.println("Double: " + varDouble);
        System.out.println("Char: " + varChar);
        System.out.println("Boolean: " + varBoolean);

        // Step 2
        byte smallVal = 50;
        int largeVal = smallVal;

        System.out.println("smallVal: " + smallVal);
        System.out.println("largeVal: " + largeVal);

        double decimalVal = 99.99;
        int truncatedVal = (int) decimalVal;

        System.out.println("decimalVal: " + decimalVal);
        System.out.println("truncatedVal: " + truncatedVal); // This value truncated the trailing decimal digits

        // Step 3
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int[] firstArray = new int[]{10, 20, 30};
        int[] secondArray = firstArray;
        secondArray[0] = 999;

        System.out.println("firstArray[0]: " + firstArray[0]);
        System.out.println("secondArray[0]: " + secondArray[0]);
        // This synchronized changed because it wasn't a shallow/literal copy, but instead a deep copy that mirrors the
        // address in memory.
    }
}
