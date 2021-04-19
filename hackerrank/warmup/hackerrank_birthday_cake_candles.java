import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
https://www.hackerrank.com/challenges/birthday-cake-candles/problem

You are in charge of the cake for a child's birthday. You have decided the cake will    have one candle for each year of their total age. They will only be able to blow out    the tallest of the candles. Count how many candles are tallest.

Example: candles = [4, 4, 1, 3]


The maximum height candles are 4 units high. There are 2 of them, so return 2.
*/

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCandle = Integer.MIN_VALUE;
        int tallestCandleCount = 0;
        
        for (int candle : candles) {
            if (candle > tallestCandle) {
                tallestCandle = candle;
                tallestCandleCount = 1;
            } else if (candle == tallestCandle) tallestCandleCount++;
        }
        
        return tallestCandleCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
