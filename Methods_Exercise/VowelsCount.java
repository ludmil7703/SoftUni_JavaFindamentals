import java.util.Scanner;
public class VowelsCount {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input= scanner.nextLine();
            System.out.println(vowels(input));

        }
        public static int vowels(String input){
            int sum=0;
            for (int i = 0; i < input.length(); i++) {
                char currentChar=input.charAt(i);
                switch (currentChar){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    case 'y':
                    case 'Y':
                        sum+=1;break;
                    default:break;


                }
            }
            return sum;
        }

}
