package HandsOn;

public class Q20and33 {
    public static void main(String[] args) {
        int []a={12,3,24,5,7,97,5,4};
        sort(a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }
    static void sort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
