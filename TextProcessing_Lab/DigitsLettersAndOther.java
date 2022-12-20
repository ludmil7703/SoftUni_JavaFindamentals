import java.util.Scanner;
public class DigitsLettersAndOther {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String text= scanner.nextLine();
            StringBuilder letters=new StringBuilder();
            StringBuilder digits=new StringBuilder();
            StringBuilder others=new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                if(Character.isLetter(text.charAt(i))){
                    letters.append(text.charAt(i));
                } else if (Character.isDigit(text.charAt(i))) {
                    digits.append(text.charAt(i));
                } else {
                    others.append(text.charAt(i));
                }
            }
            System.out.println(digits);
            System.out.println(letters);
            System.out.println(others);
        }
}
