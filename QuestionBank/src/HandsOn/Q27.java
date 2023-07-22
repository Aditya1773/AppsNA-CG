package HandsOn;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        prime(s,e);
    }
    public static void prime(int s,int e){
        for(int num=s;num<=e;num++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int num){
        if(num==1|| num==0){
            return false;
        }

        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
