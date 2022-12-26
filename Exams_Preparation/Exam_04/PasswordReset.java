import java.util.Scanner;
public class PasswordReset {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String password= scanner.nextLine();

            String input= scanner.nextLine();
            while (!input.equals("Done")){
                String command=input.split(" ")[0];

                switch (command){
                    case "TakeOdd":
                        StringBuilder replace=new StringBuilder();
                        for (int i = 1; i < password.length(); i+=2) {
                            replace.append(password.charAt(i));
                        }
                        password=replace.toString();
                        System.out.println(password);
                        break;
                    case "Cut":
                        int index=Integer.parseInt(input.split(" ")[1]);
                        int length=Integer.parseInt(input.split(" ")[2]);
                        StringBuilder cut=new StringBuilder(password);
                        cut.delete(index,index+length);
                        password=cut.toString();
                        System.out.println(password);

                        break;
                    case "Substitute":
                        String substring=input.split(" ")[1];
                        String substitute=input.split(" ")[2];
                        StringBuilder temp=new StringBuilder(password);
                        if (password.contains(substring)){
                            while (password.contains(substring)) {
                                int startIndex = password.indexOf(substring);
                                int endIndex = password.indexOf(substring) + substring.length();
                                temp.replace(startIndex, endIndex, substitute);
                                password = temp.toString();
                            }
                            System.out.println(password);
                        } else {
                            System.out.println("Nothing to replace!");
                        }

                        break;
                    default:break;
                }

                input= scanner.nextLine();
            }
            System.out.println("Your password is: "+password);
        }
}
