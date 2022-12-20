import java.util.Scanner;
public class RepeatStrings {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String[] textArr=scanner.nextLine().split(" ");

            StringBuilder result=new StringBuilder();

            for (int i = 0; i < textArr.length; i++) {
                String currentWord=textArr[i];
                for (int j = 0; j < currentWord.length(); j++) {
                    result.append(currentWord);
                }
            }
            System.out.println(result);
        }
}
