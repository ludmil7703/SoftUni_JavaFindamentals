import java.util.Scanner;
public class Login {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String username= scanner.nextLine();
            StringBuilder password= new StringBuilder();
            for (int position=username.length()-1;position>=0;position--) {
                char currentSymbol=username.charAt(position);
                password.append(currentSymbol);
            }
            int countFailed=0;
            String enteredPassword= scanner.nextLine();
            while (!enteredPassword.equals(password.toString())) {
                countFailed++;
                if (countFailed==4){
                    System.out.printf("User %s blocked!",username);
                    break;
                }

                System.out.println("Incorrect password. Try again.");
                enteredPassword= scanner.nextLine();
            }
            if (enteredPassword.equals(password.toString())) {
                System.out.printf("User %s logged in.", username);
            }
        }
}
