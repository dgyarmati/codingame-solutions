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
     */
	 
    static String timeConversion(String s) {
        boolean isPM = s.substring(8, s.length()).equals("PM") ? true : false;
        boolean isTwelve = s.substring(0, 2).equals("12") ? true : false;
        String militaryTime = "";
        
        if (!isPM && isTwelve) {
            militaryTime = s.replaceFirst("12", "00");
        } else if (isPM && !s.substring(0, 2).startsWith("0")) {
            militaryTime = s.replace("PM", "");
        } else if (isPM) {
            int hour = Integer.parseInt(s.substring(1, 2));
            String militaryHour = String.valueOf(hour + 12);
            militaryTime = militaryHour + s.substring(2, 8);
        }
        
        return militaryTime;
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
