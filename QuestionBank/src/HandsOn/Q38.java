package HandsOn;

public class Q38 {
    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(s)){
            System.out.println("PAlindrome");
        }
        else {
            System.out.println("NP");
        }

    }
}
