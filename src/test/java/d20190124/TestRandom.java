package d20190124;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand1 = new Random(System.currentTimeMillis());
        Random rand2 = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            System.out.print(rand1.nextInt(10) + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(rand2.nextInt(10) + " ");
        }
    }
}
