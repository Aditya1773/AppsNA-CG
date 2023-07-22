package bigO;

public class BigON {
    //there are three types of time complexities
    //omega theta and Big O
    //omega is used for thebest case scenario
    //theta is for thr average case
    //big of O is for the worst case
    static void print(int n){
        for(int i=0;i<n;i++){   //this is having O(n) time complexity
            System.out.println(i);
        }
        for(int j=0;j<n;j++){   //this is also  having O(n) time complexity
            System.out.println();//So the total is ot gonna be ----O(2N)---
                                    //Constants sre dropped so its gonna be ----O(n)
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
