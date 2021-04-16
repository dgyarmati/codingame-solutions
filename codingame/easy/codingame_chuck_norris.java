import java.util.*;
import java.io.*;
import java.math.*;

/**
	https://www.codingame.com/ide/puzzle/chuck-norris

	Binary with 0 and 1 is good, but binary with only 0, or almost, is even better! 
	Originally, this is a concept designed by Chuck Norris to send so called unary messages.

	Write a program that takes an incoming message as input and displays as output the message encoded using Chuck Norris’ method.

		Rules
	Here is the encoding principle:

	The input message consists of ASCII characters (7-bit)
	The encoded output message consists of blocks of 0
	A block is separated from another block by a space
	Two consecutive blocks are used to produce a series of same value bits (only 1 or 0 values):
	- First block: it is always 0 or 00. If it is 0, then the series contains 1, if not, it contains 0
	- Second block: the number of 0 in this block is the number of bits in the series.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
		
		String unaryResult = "";
		int blockIdx = 0;
		
        for (int i = 0; i < message.length(); i++) {
			String digitAsBinary = Integer.toBinaryString(message.charAt(i));
            if (digitAsBinary.length() < 7) {
                String paddingZeroes = "";
                for (int k = 0; k < 7 - digitAsBinary.length(); k++) {
                    paddingZeroes += "0";
                }
                digitAsBinary = paddingZeroes + digitAsBinary;
            }
			for (int j = 0; j < digitAsBinary.length(); j++) {
				String digit = Character.toString(digitAsBinary.charAt(j));
				
				if (j > 0 && !digit.equals(Character.toString(digitAsBinary.charAt(j - 1)))) {
					blockIdx = 0;
					if (j < digitAsBinary.length() - 1) {
						unaryResult += " ";
					}
				}
				
				if (digit.equals("1") && blockIdx == 0) {
					unaryResult += "0 ";
				} else if (digit.equals("0") && blockIdx == 0) {
					unaryResult += "00 ";
				}
				
				unaryResult += "0";
				blockIdx++;
			}
        }

        System.out.println(unaryResult);
    }
}
