import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractEmails {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String regex="[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";

            Pattern patternEmail=Pattern.compile(regex);
            String input= scanner.nextLine();
            Matcher matcherEmail= patternEmail.matcher(input);

            while (matcherEmail.find()){
                System.out.println(matcherEmail.group());
            }
        }
}
