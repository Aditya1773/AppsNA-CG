package HandsOn;
//Perfect number = addition of the divisors
public class Q29 {
    public static void main(String[] args) {
        int n=28;
        if(isPerfect(n)){
            System.out.println("Perfect");
        }
        else {
            System.out.println("Non Perfect");
        }
    }
    public static boolean isPerfect(int n){
        int sum=0;
        if(n<=0){
            return false;
        }
        for(int i=1;i<= n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}
