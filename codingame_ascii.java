import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static final int NO_OF_POSSIBLE_CHARACTERS = 27;
    public static final int LAST_POSSIBLE_CHARACTER_INDEX = NO_OF_POSSIBLE_CHARACTERS - 1;
    public static final char A = 'A';
    public static final char Z = 'Z';

    public static void main(String args[]) {
        /*
            Solution idea: read the given ASCII art alphabet into an array, then, by treating it as a flattened matrix,
            find the corresponding substring for each given character in each row. For that, you need the ASCII value
            of each given characters and the start idx of each rows, from which you can calculate  the rest.
        */

        Scanner in = new Scanner(System.in);

        // we can interpret the ASCII art strings input as rows and cols
        int noOfCols = in.nextInt();
        int noOfRows = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }

        String inputText = in.nextLine().toUpperCase();
        String rows = "";

        for (int i = 0; i < noOfRows; i++) {
            rows += in.nextLine();
        }

        int lengthOfFirstRow = noOfCols * NO_OF_POSSIBLE_CHARACTERS;

        StringBuilder res = new StringBuilder();
        for (int rowIdx = 0; rowIdx < noOfRows; rowIdx++) {
            for (char currentChar : inputText.toCharArray()) {
                // check if current character from input text is an unknown character (?) - if not, get its index by comparing it to the ASCII value of A
                int currentCharIdxInPossibleChars = currentChar < A || currentChar > Z ? LAST_POSSIBLE_CHARACTER_INDEX : currentChar - A;
                int startIdxInRows = (lengthOfFirstRow * rowIdx) + (currentCharIdxInPossibleChars * noOfCols);
                res.append(rows.substring(startIdxInRows, startIdxInRows + noOfCols));
            }
            res.append("\n");
        }

        System.out.println(res);
    }
}