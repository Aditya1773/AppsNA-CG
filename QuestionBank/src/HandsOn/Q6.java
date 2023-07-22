package HandsOn;

public class Q6 {
    public static void main(String[] args) {
        String s="hgelgfgss";
        int vowelCount=0;
        int consCOunt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowelCount++;

            }
            else{
                consCOunt++;
            }

        }
        System.out.println(vowelCount);
        System.out.println(consCOunt);
    }
}
