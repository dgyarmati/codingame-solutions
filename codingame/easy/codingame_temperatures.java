import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;

/*
https://www.codingame.com/ide/puzzle/temperatures

Write a program that prints the temperature closest to 0 among input data. 
If two numbers are equally close to zero, positive integer has to be considered closest to zero 
(for instance, if the temperatures are -5 and 5, then display 5).
 */
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N == 0) {
			System.out.println("0");	
		} else {
            int temperature;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                temperature = in.nextInt();
				// the first condition simply checks for the lowest temperature. 
				// the second runs on all values that are larger than the current min, filtering out cases when the two abs values are the same, choosing the positive. 
                if (Math.abs(temperature) < Math.abs(min) || (temperature == -min && temperature > 0))
                    min = temperature;
            }

            System.out.println(min);
        }
		
		in.close();
    }
}