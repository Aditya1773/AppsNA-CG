package HandsOn;

import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        String s="sdkhfs";
        Map<Character,Integer> alphabetCount=count(s);
        System.out.println(alphabetCount);


    }
    static Map<Character,Integer>count(String s){
        Map<Character,Integer>alphabetCount=new HashMap<>();
        char c[]=s.toCharArray();
        for(char x:c){
            alphabetCount.put(x,alphabetCount.getOrDefault(x,0)+1);
        }
        return alphabetCount;

    }
}
