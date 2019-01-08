package d20190102;

public class test1 {
    public static void main(String[] args) {
        String str3 = "hello runoob，I am from runoob。";
        boolean flag2 = str3.matches("\\ru\\noo\\b");
        System.out.println(flag2);


//        String Str = new String("www.runoob.com");
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.matches("(.*)runoob(.*)"));
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.matches("(.*)google(.*)"));
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.matches("www(.*)"));
    }
}
