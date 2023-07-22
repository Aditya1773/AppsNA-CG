package HandsOn;

public class Q10 {
    public static void main(String[] args) {
        String a="Aditya";
        String b="Aditya";
        System.out.println(a==b);

        String name1=new String("Aditya");
        String name2=new String ("Aditya");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
