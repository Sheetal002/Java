public class MoreOnString {
    public static void main(String[] args){
        char[] names = {'S', 'h', 'e', 'e', 't', 'a', 'l'};
        String s = new String(names);
        String names1 = "Sheetal";
        System.out.println(s+ " "+ names1);
        System.out.println(s.hashCode() + " " +names1.hashCode());

        String s1 = new String("Anudip");
        String s2 = new String("Anudip");
        System.out.println(s1 + " " +s2);

        String s3 = "Anudip";
        System.out.println(s3);
        System.out.println(s1.hashCode() + " " +s2.hashCode() +" "+ s3.hashCode());
    }
}
