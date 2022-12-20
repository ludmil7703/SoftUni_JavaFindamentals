import java.util.Scanner;
public class Messages {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=Integer.parseInt(scanner.nextLine());
            StringBuilder message =new StringBuilder();



            String input;
            for (int i = 0; i < n; i++) {
                input= scanner.nextLine();

                int digit = Integer.parseInt(String.valueOf(input.charAt(0)));
                int offset = (digit - 2) * 3;
                switch (digit) {
                    case 8:
                    case 9:
                        offset++;
                        break;
                    default:
                        break;

                }
                int letterIndex = offset + input.length() - 1 + 97;
                char letter= (char) (letterIndex);
                if (digit==0){
                    letter=(char) (32);
                }

                message.append(letter);

            }
            System.out.println(message);
        }
}
