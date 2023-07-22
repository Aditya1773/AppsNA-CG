package HandsOn;

public class Q11 {
    public static void main(String[] args) {
        String a="sdfh";
        String b="f";
        String f=remove(a,b);
        System.out.println(f);
    }
    static String remove(String a,String b){
        StringBuilder r=new StringBuilder();
        for(char ch:a.toCharArray()){
            if(b.indexOf(ch)==-1){
                r.append(ch);
            }
        }
        return r.toString();
    }
}
