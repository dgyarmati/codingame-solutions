import java.util.*;
import java.io.*;
import java.math.*;

/**
https://www.codingame.com/ide/puzzle/horse-racing-duals

Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate in the race. 
In order for the race to be interesting, it is necessary to try to select two horses with similar strength.

Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (≥ 0).
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] horseStrengths = new int[N];

        for (int i = 0; i < N; i++) {
            horseStrengths[i] = in.nextInt();
        }
		
		in.close();

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int diff = Math.abs(horseStrengths[i] - horseStrengths[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                }
				if (minDiff == 0 || minDiff == 1) break;
            }
        }

        System.out.println(minDiff);
    }
}