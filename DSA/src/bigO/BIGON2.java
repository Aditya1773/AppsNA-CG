package bigO;

public class BIGON2 {

    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+" "+j);//here the for loop ran O(n*n)==o(n^2)
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(i);  //out of o(n^2 & n)======O(n^2)
                                    //Drop Non-constants
        }

    }

    public static void main(String[] args) {
        print(10);
        printTwo(10,20);
    }
    static void printTwo(int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){

            System.out.println(i+""+j);
        }


        }
    }
}
