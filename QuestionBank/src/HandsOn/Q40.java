package HandsOn;

public class Q40 {
    public static void main(String[] args) {
        int []a={12,234,5,53,2,3,4};
        for( int i=0;i<a.length-1;i++){
            for(int j=0;j< a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(a[a.length-1]+" "+a[a.length-2]);
    }
}
