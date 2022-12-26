import java.util.Scanner;
public class SecretChat {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            StringBuilder message=new StringBuilder(scanner.nextLine());

            String input= scanner.nextLine();

            while (!input.equals("Reveal")){
                String[] tokens=input.split(":\\|:");
                String command=tokens[0];
                switch (command){
                    case "InsertSpace":
                        int index=Integer.parseInt(tokens[1]);
                        message.insert(index," ");
                        System.out.println(message);
                        break;
                    case "Reverse":
                        StringBuilder substring=new StringBuilder(tokens[1]);
                        if(message.toString().contains(substring.toString())){
                            int startIndex=message.toString().indexOf(substring.toString());
                            int endIndex=startIndex+substring.length();
                            message.delete(startIndex,endIndex);
                            substring.reverse();
                            message.append(substring);
                            System.out.println(message);
                        } else {
                            System.out.println("error");
                        }

                        break;
                    case "ChangeAll":
                        String subString=tokens[1];
                        String changeString=tokens[2];
                        while (message.toString().contains(subString.toString())){
                            int startIndex= message.indexOf(subString);
                            int endIndex= message.indexOf(subString.toString())+subString.length();
                            message.replace(startIndex,endIndex,changeString);
                        }
                        System.out.println(message);

                        break;
                    default:break;
                }
                input= scanner.nextLine();
            }
            System.out.println("You have a new text message: "+message);
        }
}
