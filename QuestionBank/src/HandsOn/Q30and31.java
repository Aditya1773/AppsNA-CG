package HandsOn;

public class Q30and31 {
    public static void main(String[] args) {

//        if(isArm(153)){
//            System.out.println("Armstrong number");
//        }
//        else{
//            System.out.println("Non Armstrong number");
//        }
        for(int i=0;i<1000;i++){
            if(isArm(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArm(int a){
        int o=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem*rem*rem;
            a=a/10;
        }
        return sum==o;
    }
}
