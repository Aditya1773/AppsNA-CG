package HandsOn;

public class Q24and34 {
    public static void main(String[] args) {
        int []a={12,34,4,55,64,2,2};
        int e=0,o=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e+=a[i];
            }
            else {
                o+=a[i];
            }
        }
        System.out.println(e);
        System.out.println(o);
    }
}
