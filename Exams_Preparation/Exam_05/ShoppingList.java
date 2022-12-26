import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ShoppingList {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> shoppingList= Arrays.stream(scanner.nextLine().split("!"))
                    .collect(Collectors.toList());

            String command= scanner.nextLine();

            while (!command.equals("Go Shopping!")){
                String[] tokens=command.split(" ");
                switch (tokens[0]){
                    case "Urgent":
                        if (!shoppingList.contains(tokens[1])){
                            shoppingList.add(0,tokens[1]);
                        }
                        break;
                    case "Unnecessary":
                        if (shoppingList.contains(tokens[1])){
                            shoppingList.remove(tokens[1]);
                        }
                        break;
                    case "Correct":
                        if (shoppingList.contains(tokens[1])){
                            shoppingList.set(shoppingList.indexOf(tokens[1]),tokens[2]);
                        }
                        break;
                    case "Rearrange":
                        if (shoppingList.contains(tokens[1])){
                            shoppingList.remove(tokens[1]);
                            shoppingList.add(tokens[1]);
                        }
                        break;
                    default:break;
                }

                command= scanner.nextLine();
            }
            for (int index = 0; index < shoppingList.size()-1; index++) {
                System.out.printf("%s, ",shoppingList.get(index));
            }
            System.out.println(shoppingList.get(shoppingList.size()-1));

        }
}
