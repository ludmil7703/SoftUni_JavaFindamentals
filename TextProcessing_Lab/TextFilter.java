import java.util.Scanner;
public class TextFilter {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String[] bannedWords= scanner.nextLine().split(", ");
            String text= scanner.nextLine();

            for (int i = 0; i < bannedWords.length; i++) {
                String bannedWord=bannedWords[i];
                String replaceWord="";
                for (int j = 0; j < bannedWord.length(); j++) {
                    replaceWord+="*";
                }
                if (text.contains(bannedWord)) {
                    text=text.replace(bannedWord, replaceWord);
                }
            }
            System.out.println(text);
        }
}
