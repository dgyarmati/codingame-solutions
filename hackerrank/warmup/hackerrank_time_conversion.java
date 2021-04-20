import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    /*
    https://www.hackerrank.com/challenges/time-conversion/problem
     
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
	
	Solution based on this one: https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Warmup/Time%20Conversion/Solution.java
     */

    static String timeConversion(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        String meridiem = time.substring(8, 10);
        
        hour += ((meridiem.equals("PM") && hour != 12) ? 12 : 0);
        hour -= ((meridiem.equals("AM") && hour == 12) ? 12 : 0);
        
        String militaryHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        
        return militaryHour + time.substring(2, 8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
