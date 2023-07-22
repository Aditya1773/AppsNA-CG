package HandsOn;

import java.util.Arrays;

public class Q44 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={1,4,3,2,5};
        if(a.length!=b.length){
            System.out.println("No");
        }
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));
    }
}
