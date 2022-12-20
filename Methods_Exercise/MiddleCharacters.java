import java.util.Scanner;
public class MiddleCharacters {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String str= scanner.nextLine();
            middleStr(str);

        }
        public static void middleStr(String str){

            if (str.length()%2==0){
                char first=str.charAt(str.length()/2-1);
                char second=str.charAt(str.length()/2);
                System.out.printf("%c%c",first,second);
            } else {
                char first=str.charAt(str.length()/2);
                System.out.printf("%c",first);
            }
        }
}
