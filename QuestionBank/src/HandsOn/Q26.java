package HandsOn;

public class Q26 {
    public static void main(String[] args) {
        int n=60;
       for(int i=2;i<=n;i++){
           while(n%i==0){
               System.out.println(i);
               n/=i;
           }
       }

    }
}
