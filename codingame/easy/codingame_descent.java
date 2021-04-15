import java.util.*;
import java.util.stream.IntStream;

/*
https://www.codingame.com/ide/puzzle/the-descent

At the start of each game turn, you are given the height of the 8 mountains from left to right.
By the end of the game turn, you must fire on the highest mountain by outputting its index (from 0 to 7).

Firing on a mountain will only destroy part of it, reducing its height. Your ship descends after each pass.  
 */
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] mountainHeights = new int[8];

        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                mountainHeights[i] = mountainH;
            }

            int maxHeight = mountainHeights[0];
            int maxHeightIdx = 0;
            for (int i = 1; i < mountainHeights.length; i++) {
                if (mountainHeights[i] > maxHeight) {
                    maxHeight = mountainHeights[i];
                    maxHeightIdx = i;
                }
            }

            System.out.println(maxHeightIdx);
        }
    }
}