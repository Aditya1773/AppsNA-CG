package HandsOn;

public class Q23 {
    public static void main(String[] args) {
        int a[]={1,44,4,6,7,8,5,9,88};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
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
