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

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char[] message = in.nextLine().toCharArray();
		
		StringBuilder binary = new StringBuilder();
		for (char c : message) {
			String charAsBinaryStr = Integer.toBinaryString(c);
			
			// padding with leading zeroes if needed (for non-letters)
			while (charAsBinaryStr.length() < 7) charAsBinaryStr = '0' + charAsBinaryStr;
			
			binary.append(charAsBinaryStr);
		}
		
		int i = 0;
		char currentChar;
		while (i < binary.length()) {
			if(binary.charAt(i) == '0') {
				System.out.print("00 ");
				currentChar = '0';
			} else {
				System.out.print("0 ");
				currentChar = '1';
			}
			
			while (binary.charAt(i) == currentChar) {
				System.out.print("0");
				i++;
				if (i >= binary.length()) break;
			}
			
			if (i < binary.length()) System.out.print(" ");
		}
		
		in.close();
	}

}
