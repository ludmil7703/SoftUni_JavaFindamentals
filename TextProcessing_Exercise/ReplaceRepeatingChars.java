import java.util.Scanner;
public class ReplaceRepeatingChars {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String input= scanner.nextLine();

            String rest="";

            char firstOccur=input.charAt(0);
            rest+=firstOccur;

            for (int i = 0; i < input.length(); i++) {
                char currentLetter=input.charAt(i);
                if(firstOccur!=currentLetter){
                    firstOccur=currentLetter;
                    rest+=firstOccur;
                }
            }
            System.out.println(rest);
        }
}
