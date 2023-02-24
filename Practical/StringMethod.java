public class StringMethod {
    public static void main(String[] args) {
        String a = "Chocolate Milkshake";
        
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.startsWith("Choco"));
        System.out.println(a.endsWith("shake"));
        System.out.println(a.charAt(10));
        System.out.println(a.length());
        System.out.println();
        System.out.println(a.replace("Chocolate", "Strawberry"));
        System.out.println(a);


        int num = 55;
        String b = String.valueOf(num);
        System.out.println(b+55);


    }
}
