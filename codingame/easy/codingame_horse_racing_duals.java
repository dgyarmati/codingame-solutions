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
        SortedSet<Integer> horseStrengths = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            horseStrengths.add(in.nextInt());
        }
		
		in.close();

        int minDiff = Integer.MAX_VALUE;
        Iterator<Integer> iterator = horseStrengths.iterator();
        int strength1 = iterator.next();

        while (iterator.hasNext()) {
            int strength2 = iterator.next();
            int diff = Math.abs(strength2 - strength1);
            if (diff < minDiff) {
                minDiff = diff;
            }
            if (minDiff == 0) break;
            strength1 = strength2;
        }

        System.out.println(minDiff);
    }
}