package Practice;

public class Main {
    public static void main(String[] args) {
     Linkedlist l=new Linkedlist(1);
     l.append(2);
     l.print();
//   System.out.println(l.removeLast().value);
//   System.out.println(l.removeLast().value);
     l.prePend(0);
     l.print();
     System.out.println(l.removeFirst().value);
        System.out.println(l.get(1).value);

    }
}
