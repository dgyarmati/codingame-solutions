import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        int k = 1; 
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n - k) {
                System.out.printf("%s", " ");
                j++;
            }
            j = 0;
            while (j < k) {
                System.out.printf("%s", "#");
                j++;
            }
            k++;
            j = 0;
            if (i < n - 1) {
                System.out.println();
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
