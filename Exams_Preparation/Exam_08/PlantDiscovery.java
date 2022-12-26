import java.util.*;
public class PlantDiscovery {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());

            Map<String, List<Double>> plantsMap=new LinkedHashMap<>();

            for (int index = 0; index < n; index++) {
                String[] info=scanner.nextLine().split("<->");
                String plant=info[0];
                double rarity=Double.parseDouble(info[1]);
                plantsMap.putIfAbsent(plant,new ArrayList<>());
                if (plantsMap.get(plant).isEmpty()){
                    plantsMap.get(plant).add(0,rarity);
                    plantsMap.get(plant).add(1,0.0);
                    plantsMap.get(plant).add(2,0.0);
                } else {
                    plantsMap.get(plant).set(0,rarity);
                }
            }
            String input= scanner.nextLine();

            while (!input.equals("Exhibition")){
                String[] command=input.split(": ");
                String event=command[0];
                String plant=command[1].split(" - ")[0];
                if (!plantsMap.containsKey(plant)){
                    System.out.println("error");
                } else {
                    switch (event) {
                        case "Rate":
                            double rating = Double.parseDouble(command[1].split(" - ")[1]);
                            double ratingSum = plantsMap.get(plant).get(1) + rating;
                            double ratingNumber = plantsMap.get(plant).get(2) + 1;
                            plantsMap.get(plant).set(1, ratingSum);
                            plantsMap.get(plant).set(2, ratingNumber);

                            break;
                        case "Update":
                            double rarity = Double.parseDouble(command[1].split(" - ")[1]);
                            plantsMap.get(plant).set(0, rarity);

                            break;
                        case "Reset":
                            plantsMap.get(plant).set(1, 0.0);
                            plantsMap.get(plant).set(2, 0.0);

                            break;
                        default:
                            break;

                    }
                }

                input= scanner.nextLine();
            }
            System.out.println("Plants for the exhibition:");
            for(Map.Entry<String, List<Double>> item:plantsMap.entrySet()){
                double averageRating;
                if (item.getValue().get(1)==0.0){
                    averageRating=0.00;
                } else {
                    averageRating=item.getValue().get(1)/item.getValue().get(2);
                }

                System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",item.getKey(),item.getValue().get(0),averageRating);
            }
        }
}
