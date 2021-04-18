import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
	https://www.hackerrank.com/challenges/staircase/problem

	This is a staircase of size n = 4:

	   #
	  ##
	 ###
	####
	Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

	Write a program that prints a staircase of size n.
*/

public class Solution {

    static void staircase(int n) {
        int m = 1; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - m; j++){
                System.out.printf("%s", " ");
            }
            for (int k = 0; k < m; k++) {
                System.out.printf("%s", "#");
            }
            if (i < n - 1) {
                System.out.println();
            }
			m++;
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
