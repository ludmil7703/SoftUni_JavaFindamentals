import java.util.*;
public class Pirates {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            Map<String, List<Integer>> piratesMap=new LinkedHashMap<>();

            String input= scanner.nextLine();

            while (!input.equals("Sail")){
                String[] command=input.split("\\|\\|");
                String city=command[0];
                int population=Integer.parseInt(command[1]);
                int gold=Integer.parseInt(command[2]);
                piratesMap.putIfAbsent(city,new ArrayList<>());
                if (piratesMap.containsKey(city)){
                    if (piratesMap.get(city).isEmpty()){
                        piratesMap.get(city).add(0,population);
                        piratesMap.get(city).add(1,gold);
                    } else {
                        piratesMap.get(city).set(0,piratesMap.get(city).get(0)+population);
                        piratesMap.get(city).set(1,piratesMap.get(city).get(1)+gold);
                    }
                }

                input= scanner.nextLine();
            }

            String events= scanner.nextLine();

            while (!events.equals("End")){
                String event=events.split("=>")[0];
                String town=events.split("=>")[1];

                switch (event){
                    case "Plunder":
                        int people=Integer.parseInt(events.split("=>")[2]);
                        int gold=Integer.parseInt(events.split("=>")[3]);
                        int peoples=piratesMap.get(town).get(0);
                        int golds=piratesMap.get(town).get(1);
                        if (peoples-people<=0||golds-gold<=0){
                            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                            System.out.printf("%s has been wiped off the map!%n",town);
                            piratesMap.remove(town);

                        } else {
                            piratesMap.get(town).set(0,peoples-people);
                            piratesMap.get(town).set(1,golds-gold);
                            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);

                        }

                        break;
                    case "Prosper":
                        int goldAdd=Integer.parseInt(events.split("=>")[2]);
                        int goldCurrent=piratesMap.get(town).get(1);
                        if (goldAdd>=0){
                            piratesMap.get(town).set(1,goldCurrent+goldAdd);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldAdd,town,goldCurrent+goldAdd);
                        } else {
                            System.out.println("Gold added cannot be a negative number!");
                        }
                        break;
                    default:break;
                }
                events= scanner.nextLine();
            }
            if(!piratesMap.isEmpty()){
                System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",piratesMap.size());
                for (Map.Entry<String,List<Integer>> item:piratesMap.entrySet()) {
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",item.getKey(),item.getValue().get(0),
                            item.getValue().get(1));
                }
            } else {
                System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
            }
        }
}
