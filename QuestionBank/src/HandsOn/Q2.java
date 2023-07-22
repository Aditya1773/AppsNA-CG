package HandsOn;

import java.awt.event.ItemListener;

public class Q2 {
    public static void main(String[] args) {
        int []a={12,4,22,3,43,42};
        sort(a);
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
        System.out.println(sum(a));
    }
    static void sort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    static int  sum(int a[]){
        int x=a[0];
        int y=a[1];
        return x+y;

    }
}
