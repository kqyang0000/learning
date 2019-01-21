package d20190121;

public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println("result1=" + toUnicode("测试123asdf"));

        System.out.println(125662 & 0xffff);
        System.out.println(Integer.toHexString(60126));

    }

    public static String toUnicode(String str) {
        String[] as = new String[str.length()];
        String s1 = "";
        for (int i = 0; i < str.length(); i++) {
            int v = str.charAt(i);
            if (v >= 19968 && v <= 171941) {
                as[i] = Integer.toHexString(str.charAt(i) & 0xffff);
                s1 = s1 + "\\u" + as[i];
            } else {
                s1 = s1 + str.charAt(i);
            }
        }
        return s1;
    }
}
