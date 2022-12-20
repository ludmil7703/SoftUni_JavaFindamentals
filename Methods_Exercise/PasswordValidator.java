import java.util.Scanner;
public class PasswordValidator {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String password= scanner.nextLine();
            boolean isValidPassword=isValid(password);
            if (isValidPassword){
                System.out.println("Password is valid");
            }



        }
        public static boolean isValid (String password) {
            boolean isValid = true;
            int sum = 0;
            for (int i = 0; i < password.length(); i++) {
                sum++;
            }
            if (sum < 6 || sum > 10) {
                System.out.println("Password must be between 6 and 10 characters");
                isValid = false;
            }
            for (int i = 0; i < password.length(); i++) {
                if (!(password.charAt(i) >= 48 && password.charAt(i) <= 57)
                        && !(password.charAt(i) >= 65 && password.charAt(i) <= 90)
                        && !(password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
                    System.out.println("Password must consist only of letters and digits");
                    isValid = false;break;
                }

            }
            int sumDigits = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    sumDigits++;
                }
            }
            if (sumDigits <2) {
                System.out.println("Password must have at least 2 digits");
                isValid = false;
            }
            return isValid;
        }
}
