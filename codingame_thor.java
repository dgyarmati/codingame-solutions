import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            String direction = "";

            if (lightY > initialTy) {
                direction += "S";
                initialTy++;
            } else if (lightY < initialTy) {
                direction += "N";
                initialTy--;
            }

            if (lightX > initialTx) {
                direction += "E";
                initialTx++;
            } else if (lightX < initialTx) {
                direction += "W";
                initialTx--;
            }

            System.out.println(direction);
        }
    }
}