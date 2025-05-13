package RandomFunction;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        int si = 10; // starting index
        int ei = 100; // ending index
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(ei - si + 1); // gives a number between 0 to (ei-si+1);
            System.out.println(x + si);
        }
    }
}
