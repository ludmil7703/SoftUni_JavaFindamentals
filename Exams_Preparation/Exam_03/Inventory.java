import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Inventory {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> inventory= Arrays.stream(scanner.nextLine().split(", "))
                    .collect(Collectors.toList());

            String command= scanner.nextLine();

            while (!command.equals("Craft!")){
                String[] tokens=command.split(" - ");

                switch (tokens[0]){
                    case "Collect":
                        if (!inventory.contains(tokens[1])){
                            inventory.add(tokens[1]);
                        }
                        break;
                    case "Drop":
                        if (inventory.contains(tokens[1])){
                            inventory.remove(tokens[1]);
                        }
                        break;
                    case "Combine Items":
                        String[] items=tokens[1].split(":");
                        if (inventory.contains(items[0])){
                            inventory.add(inventory.indexOf(items[0])+1,items[1]);
                        }
                        break;
                    case "Renew":
                        if (inventory.contains(tokens[1])){
                            inventory.remove(tokens[1]);
                            inventory.add(tokens[1]);
                        }
                        break;
                    default:break;
                }

                command= scanner.nextLine();
            }
            for (int index = 0; index < inventory.size()-1; index++) {
                System.out.print(inventory.get(index)+", ");
            }
            System.out.println(inventory.get(inventory.size()-1));
        }
}
