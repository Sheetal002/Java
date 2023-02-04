// Print Alphabet Pyramid

public class Alphabet {
    static void pattern(int size){
            for (int i = 0; i < size; i++) {
      
              for (int j = 0; j < size - i; j++) {
                   System.out.print((char)(65+j));
              }
              System.out.println();
             }
    }
  public static void main(String[] args) {
    int size = 5;
    int alpha = 65;
    Alphabet obj = new Alphabet();
    obj.pattern(size);

  }
}