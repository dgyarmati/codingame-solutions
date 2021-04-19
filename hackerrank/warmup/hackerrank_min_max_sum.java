import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
	https://www.hackerrank.com/challenges/mini-max-sum/problem
	
	Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
	Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/

public class Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        
        long max = 0;
        long min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) max += arr[i];
            if (i < arr.length - 1) min += arr[i];
        }
        
        System.out.printf("%s %s", min, max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
