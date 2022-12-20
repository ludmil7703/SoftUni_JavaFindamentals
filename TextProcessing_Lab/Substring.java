import java.util.Scanner;
public class Substring {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String bannedWord= scanner.nextLine();
            String text= scanner.nextLine();
            int index=text.indexOf(bannedWord);

            while (index>=0){
                text=text.replace(bannedWord,"");
                index=text.indexOf(bannedWord);

            }
            System.out.println(text);
        }
}
