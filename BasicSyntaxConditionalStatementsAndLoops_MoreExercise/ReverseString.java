import java.util.Scanner;
public class ReverseString {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String text= scanner.nextLine();
            String temp="";

            for (int i = text.length()-1; i >=0 ; i--) {
                temp+=text.charAt(i);
            }
            System.out.println(temp);
        }
}
