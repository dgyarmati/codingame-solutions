import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;

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
                if (Math.abs(temperature) < Math.abs(min) || (temperature == -min && temperature > 0))
                    min = temperature;
            }

            System.out.println(min);
        }
		
		in.close();
    }
}