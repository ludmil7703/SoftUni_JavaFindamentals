import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class TreasureHunt {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> treasure= Arrays.stream(scanner.nextLine().split("[|]"))
                    .collect(Collectors.toList());

            String command= scanner.nextLine();

            while (!command.equals("Yohoho!")){
                String[] tokens=command.split(" ");
                switch (tokens[0]){
                    case "Loot":
                        for (int loot = 1; loot <=tokens.length-1 ; loot++) {
                            if (!treasure.contains(tokens[loot])){
                                treasure.add(0,tokens[loot]);
                            }
                        }
                        break;
                    case "Drop":
                        int dropIndex=Integer.parseInt(tokens[1]);
                        if (dropIndex>=0&&dropIndex<=treasure.size()-1){
                            String tempElement=treasure.get(dropIndex);
                            treasure.remove(dropIndex);
                            treasure.add(tempElement);
                        }
                        break;
                    case "Steal":
                        int count=Integer.parseInt(tokens[1]);
                        if (count>treasure.size()){
                            count=treasure.size();
                        }
                        for (int i = treasure.size()-count; i <treasure.size()-1 ; i++) {

                            System.out.print(treasure.get(i)+", ");
                        }
                        System.out.println(treasure.get(treasure.size()-1));
                        treasure.subList(treasure.size()-count,treasure.size()).clear();
                        break;
                    default:break;
                }
                command= scanner.nextLine();
            }
            if (treasure.size()==0){
                System.out.println("Failed treasure hunt.");
            } else {
                int sumLetter = 0;
                for (int index = 0; index < treasure.size(); index++) {
                    sumLetter += treasure.get(index).length();
                }
                double average = sumLetter * 1.0 / treasure.size();
                System.out.printf("Average treasure gain: %.2f pirate credits.", average);
            }
        }
}
