package bigO;

import java.util.HashMap;
import java.util.Map;

public class Mapl {
    public static void main(String[] args) {
        Map<Integer,String > a=new HashMap<>();
        Map<Integer,String > b=new HashMap<>();
        Map<Integer,String > c=new HashMap<>();
        a.put(1,"Adi");
        b=a;
        a.put(2,"Verma");
        c=b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
