import java.util.*;
import java.io.*;
import java.math.*;

/*
https://www.codingame.com/ide/puzzle/power-of-thor-episode-1

Thor moves on a map which is 40 wide by 18 high. Note that the coordinates (X and Y) start at the top left! This means the most top left cell has the coordinates "X=0,Y=0" and the most bottom right one has the coordinates "X=39,Y=17".

Once the program starts you are given:
the variable lightX: the X position of the light of power that Thor must reach.
the variable lightY: the Y position of the light of power that Thor must reach.
the variable initialTX: the starting X position of Thor.
the variable initialTY: the starting Y position of Thor.
At the end of the game turn, you must output the direction in which you want Thor to go among N, NE, E, SE, S, SW, W, NW.
 */
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        while (true) {
            int remainingTurns = in.nextInt();
            
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
		
		in.close();
    }
}