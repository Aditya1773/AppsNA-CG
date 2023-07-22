package HandsOn;

import java.util.HashMap;
import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        String s="adeedereadsn";
        HashSet<Character>h=new HashSet();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        System.out.println(h.size());
    }
}
