import java.util.Scanner;
public class WorldTour {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            StringBuilder text=new StringBuilder(scanner.nextLine());

            String command=scanner.nextLine();

            while(!command.equals("Travel")){
                String[] tokens=command.split(":");
                switch (tokens[0]) {
                    case "Add Stop":
                        int index = Integer.parseInt(tokens[1]);
                        String str = tokens[2];
                        if (index >= 0 && index <= text.length()-1) {

                            text.insert(index, str);

                        }
                        break;
                    case "Remove Stop":
                        int startIndex = Integer.parseInt(tokens[1]);
                        int endIndex = Integer.parseInt(tokens[2]);
                        if (startIndex >= 0 && startIndex < text.length()&&endIndex>=0&&endIndex<text.length()){
                            text.delete(startIndex, endIndex+1);

                        }

                        break;
                    case "Switch":
                        String oldStr=tokens[1];
                        String newStr=tokens[2];
                        if (text.toString().contains(oldStr)){
                            String update=text.toString().replace(oldStr,newStr);
                            text=new StringBuilder(update);
                        }

                        break;
                    default:break;
                }
                System.out.println(text);

                command= scanner.nextLine();
            }
            System.out.println("Ready for world tour! Planned stops: "+text);
        }
}
