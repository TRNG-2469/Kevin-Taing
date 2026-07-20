import java.util.Arrays;

public class ArrayAnalyzer {
    void main() {
        // Step 1
        int[] array = new int[10];
        for(int x = 0; x < array.length; x++) {
            array[x] =  (int) (Math.random() * 100) + 1;
        }

        // Step 2
        String output = "[";
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x = 0 ; x < array.length; x++) {
            int num = array[x];

            output += num;
            if(x == array.length - 1) {
                output += "]";
            } else {
                output += ", ";
            }

            sum += num;

            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }

        // Step 3
        System.out.println(output);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double) sum) / array.length);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
