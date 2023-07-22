package HandsOn;

public class Q22 {
    public static void main(String[] args) {
        int []a={23,42,2,432,321,2,5,5,7776};
        sort(a);
        System.out.println(a[a.length-2]);
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
