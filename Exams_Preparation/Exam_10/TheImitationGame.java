import java.util.Scanner;
public class TheImitationGame {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            StringBuilder text=new StringBuilder(scanner.nextLine());

            String command= scanner.nextLine();

            while (!command.equals("Decode")){
                String[] token=command.split("\\|");
                switch (token[0]){
                    case "ChangeAll":
                        String symbolToChange=token[1];
                        char symbolNew=token[2].charAt(0);
                        while (text.toString().contains(symbolToChange)) {
                            text.setCharAt(text.indexOf(symbolToChange), symbolNew);

                        }

                        break;
                    case "Insert":
                        int index=Integer.parseInt(token[1]);
                        String Insert=token[2];
                        text.insert(index,Insert);


                        break;
                    case "Move":
                        int move=Integer.parseInt(token[1]);
                        String a= text.substring(move);
                        String b= text.substring(0,move);
                        text.replace(0,text.length(),a+b);

                        break;
                    default:break;
                }

                command= scanner.nextLine();
            }
            System.out.println("The decrypted message is: "+text);
        }
}
