package d20190123;

import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        int number1 = new Random().nextInt(10) + 1;
        Random random = new Random(10);
        System.out.println(random.nextInt(10));
    }
}
