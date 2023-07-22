package HandsOn;

public class Q1 {
    public static void main(String[] args) {
        String a="abcd";
        String b="dcba";
        String c="";
        if(a.length()==b.length()){
            for(int i=b.length()-1;i>=0;i--){
                c+=b.charAt(i);
            }
            if(c.equals(a)){
                System.out.println("Two Strings are reverse of each other");
            }
        }
        else{
            System.out.println("Two Strings are not reverse fo each other");
        }


    }
}
