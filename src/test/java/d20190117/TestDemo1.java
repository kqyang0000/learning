package d20190117;

import java.util.HashMap;
import java.util.Map;

public class TestDemo1 {

    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("key11", "value11");
        map1.put("key13", "value12");
        map1.put("key12", "value13");
        map1.put("key14", "value14");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("key21", "value21");
        map2.put("key23", "value22");
        map2.put("key22", "value23");
        map2.put("key24", "value24");
        redirect(map1, map2);
    }

    public static void redirect(Map<String, Object>... parament) {
        if (null != parament && parament.length > 0) {
            System.out.println(parament[1]);
            System.out.println(parament.length);
        }
    }
}
