package HandsOn;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int sum=0;
        for(int i=1;i<=a;i++){
            int x=sc.nextInt();
            sum+=x;
        }
        float avg=sum/a;
        System.out.println(avg);





    }
}
