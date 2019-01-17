package d20190116;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        String curDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int random = (int) ((Math.random() * 9 + 1) * 10000);
        System.out.println("curDate="+curDate);
        System.out.println("random="+random);
    }
}
