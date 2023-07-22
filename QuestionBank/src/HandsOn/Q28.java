package HandsOn;
//Strong number sum of the factorial of each digit is equal to that number
public class Q28 {
    public static void main(String[] args) {
        int a=146;
        if(isStrong(a)){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Non strong number");
        }
    }
    public static boolean isStrong(int a )
    {
        int o=a;
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum+=factorial(digit);
            a=a/10;

        }

        return sum==o;
    }
    static int factorial(int x){
        if(x==0|| x==1){
            return 1;

        }
        int result=1;
        for(int i=2;i<=x;i++){
            result*=i;
        }
        return result;
    }

}
