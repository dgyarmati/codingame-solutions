import java.util.*;
import java.util.stream.IntStream;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] mountainHeights = new int[8];

        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                mountainHeights[i] = mountainH;
            }

            int[] sortedHeights = IntStream.of(mountainHeights).sorted().toArray();

            System.out.println(IntStream.range(0, sortedHeights.length)
                .filter(i -> sortedHeights[i] == sortedHeights[0])
                .findFirst()
                .orElse(-1));

            //System.out.println(ArrayUtils.indexOf(sortedHeights, sortedHeights[0])); // The index of the mountain to fire on.
        }
    }
}