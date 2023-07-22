package HandsOn;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
