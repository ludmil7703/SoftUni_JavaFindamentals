import java.util.*;
public class NeedForSpeedIII {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            Map<String, List<Integer>> carsInfo=new LinkedHashMap<>();

            for (int cars = 1; cars <= n; cars++) {
                String[] info=scanner.nextLine().split("\\|");
                String car=info[0];
                int mileage=Integer.parseInt(info[1]);
                int fuel=Integer.parseInt(info[2]);
                carsInfo.putIfAbsent(car,new ArrayList<>());
                carsInfo.get(car).add(mileage);
                carsInfo.get(car).add(fuel);

            }
            String input= scanner.nextLine();

            while (!input.equals("Stop")){
                String command=input.split(" : ")[0];
                String car=input.split(" : ")[1];
                int mileage=carsInfo.get(car).get(0);
                int fuel=carsInfo.get(car).get(1);

                switch (command){
                    case "Drive":
                        int distance=Integer.parseInt(input.split(" : ")[2]);
                        int neededFuel=Integer.parseInt(input.split(" : ")[3]);
                        if (fuel-neededFuel<0){
                            System.out.println("Not enough fuel to make that ride");
                        } else {
                            mileage+=distance;
                            fuel-=neededFuel;
                            carsInfo.get(car).set(0,mileage);
                            carsInfo.get(car).set(1,fuel);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,neededFuel);
                        }
                        if (mileage>=100000){
                            carsInfo.remove(car);
                            System.out.println("Time to sell the "+car+"!");
                        }


                        break;
                    case "Refuel":
                        int refuel=Integer.parseInt(input.split(" : ")[2]);
                        if (fuel+refuel>75){
                            refuel=75-fuel;
                            fuel+=refuel;
                            carsInfo.get(car).set(1,fuel);
                            System.out.printf("%s refueled with %d liters%n",car,refuel);
                        } else {
                            fuel+=refuel;
                            carsInfo.get(car).set(1,fuel);
                            System.out.printf("%s refueled with %d liters%n",car,refuel);

                        }

                        break;
                    case "Revert":
                        int kilometers=Integer.parseInt(input.split(" : ")[2]);
                        mileage-=kilometers;
                        if (mileage<10000){
                            mileage=10000;
                            carsInfo.get(car).set(0,mileage);
                        } else {
                            carsInfo.get(car).set(0,mileage);
                            System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                        }

                        break;
                    default:break;
                }

                input= scanner.nextLine();
            }
            for(Map.Entry<String, List<Integer>> car:carsInfo.entrySet()){
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",car.getKey(),
                        car.getValue().get(0),car.getValue().get(1));
            }
        }
}
