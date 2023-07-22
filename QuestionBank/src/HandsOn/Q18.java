package HandsOn;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="akfdkaaf";
        int count =0;

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'|| s.charAt(i)=='A'){
                    count++;
                }
            }
        System.out.println(count);
    }

}
