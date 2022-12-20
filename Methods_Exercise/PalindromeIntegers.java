import java.util.Scanner;
public class PalindromeIntegers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String command= scanner.nextLine();
            while (!command.equals("END")){
                System.out.println(palindrome(command));
                command= scanner.nextLine();
            }


        }
        public static boolean palindrome(String str) {
            boolean isValid = false;
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            if (str.equals(reverse)) {
                isValid = true;
            }
            return isValid;

        }
}
