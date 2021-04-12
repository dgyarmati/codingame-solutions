import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temps[i] = t;
        }

        int min = 0;

        if (temps.length > 0) {
            min = Math.abs(temps[0]);
            for (int i = 1; i < temps.length; i++) {
                if (Math.abs(temps[i]) < min) {
                    min = temps[i];
                }
            }

            //System.err.println(-min);
            for (int i = 0; i < temps.length; i++) {
                if (temps[i] == -min) {
                    min = temps[i];
                    break;
                }
            }

        }

        System.out.println(min);
    }
}