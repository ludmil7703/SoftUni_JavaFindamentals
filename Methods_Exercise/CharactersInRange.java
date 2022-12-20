import java.util.Scanner;
public class CharactersInRange {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            char startSymbol=scanner.nextLine().charAt(0);
            char endSymbol=scanner.nextLine().charAt(0);
            charRange(startSymbol,endSymbol);

        }
        public static void charRange(char startSymbol,char endSymbol){
            if (startSymbol>endSymbol){
                for (int i = endSymbol+1; i < startSymbol; i++) {
                    System.out.printf("%c ", i);

                }
            }else {
                for (int i = startSymbol + 1; i < endSymbol; i++) {
                    System.out.printf("%c ", i);
                }
            }
        }
}
