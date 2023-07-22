package HandsOn;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    //Anagram
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(check(a,b));
    }
    static boolean check(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char []c=a.toCharArray();
        char []d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
    }
}
