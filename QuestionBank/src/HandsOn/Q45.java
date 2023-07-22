package HandsOn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q45 {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(1,2,3,3,4,4,45,5,6,5);
        Collections.shuffle(l);
        System.out.println(l);
    }
}
