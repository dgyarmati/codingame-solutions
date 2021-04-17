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
        /* 
            Note to self:
            In Java, you can control the precision of floating-point numbers in numerous             
			ways. One would with printf; the other, cleaner solution is to have the                  
			dividend as float (6-7 digits of precision) or as double (15-16 digits of                
			precision).
        */
        float noOfNegatives = 0;
        float noOfPositives = 0;
        float noOfZeroes = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                noOfNegatives++; 
            } else if (arr[i] > 0) {
                noOfPositives++; 
            } else {
                noOfZeroes++; 
            }
        }
        
        System.out.println(noOfPositives / arr.length);
        System.out.println(noOfNegatives / arr.length);
        System.out.println(noOfZeroes / arr.length);
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
