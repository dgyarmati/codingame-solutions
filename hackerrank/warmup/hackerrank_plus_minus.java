import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
	https://www.hackerrank.com/challenges/plus-minus/problem
	
	Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
	Print the decimal value of each fraction on a new line with  places after the decimal.
*/
public class Solution {

    static void plusMinus(int[] arr) {
        int noOfNegatives = 0;
        int noOfPositives = 0;
        int noOfZeroes = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                noOfNegatives++; 
            } else if (arr[i] > 0) {
                noOfPositives++; 
            } else {
                noOfZeroes++; 
            }
        }
        
        System.out.printf("%.6f", ((double) noOfPositives) / arr.length);
        System.out.println();
        
        System.out.printf("%.6f", ((double) noOfNegatives) / arr.length);
        System.out.println();
        
        System.out.printf("%.6f", ((double) noOfZeroes) / arr.length);
        System.out.println();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
