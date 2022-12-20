import java.util.Scanner;
public class ReverseStrings {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String input= scanner.nextLine();

            while (!input.equals("end")){
                String currenText=input;
                String reversedText="";
                char[] letterArr= input.toCharArray();
                for (int i = letterArr.length-1; i >=0; i--) {
                    char letter=letterArr[i];
                    reversedText+=letter;
                }
                System.out.println(currenText+" = "+reversedText);


                input= scanner.nextLine();
            }
        }
}
