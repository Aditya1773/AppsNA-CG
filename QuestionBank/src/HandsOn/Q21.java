package HandsOn;

import java.util.HashMap;
import java.util.Map;

public class Q21 {
    public static void main(String[] args) {
        int []a={123,32,2,2,2,2,7,7,8,9,65,4};
        Map<Integer,Integer> b=new HashMap<>();
        for(int i:a){
            b.put(i,b.getOrDefault(i,0)+1);
        }
        for(int i:a){
            if(b.get(i)==1){
                System.out.println(i);
            }
        }
        System.out.println(b);
    }
}
