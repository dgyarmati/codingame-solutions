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
    private static final Scanner scanner = new Scanner(System.in);

    private static void staircase(int n) {

        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j < n - i ? " " : "#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
