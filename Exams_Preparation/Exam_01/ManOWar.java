import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ManOWar {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            boolean isWarshipSunken=false;
            boolean isPiratSunken=false;

            List<Integer> pirateShip= Arrays.stream(scanner.nextLine().split(">"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> warship= Arrays.stream(scanner.nextLine().split(">"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int maxHealth=Integer.parseInt(scanner.nextLine());

            String command= scanner.nextLine();

            while (!command.equals("Retire")){
                String[] tokens=command.split(" ");

                switch (tokens[0]){
                    case "Fire":
                        int index=Integer.parseInt(tokens[1]);
                        int damage=Integer.parseInt(tokens[2]);
                        if (index>=0&&index<=warship.size()-1){
                            if (warship.get(index)-damage<=0){
                                isWarshipSunken=true;
                            }
                            warship.set(index, warship.get(index)-damage);
                        }
                        break;
                    case "Defend":
                        int startIndex=Integer.parseInt(tokens[1]);
                        int endIndex=Integer.parseInt(tokens[2]);
                        int damage1=Integer.parseInt(tokens[3]);
                        if ((startIndex>=0&&startIndex<=pirateShip.size()-1)&&(endIndex>=0&&endIndex<=pirateShip.size()-1)){
                            for (int piratIndex = startIndex; piratIndex <=endIndex ; piratIndex++) {
                                if (pirateShip.get(piratIndex)-damage1<=0){
                                    isPiratSunken=true;
                                }
                                pirateShip.set(piratIndex,pirateShip.get(piratIndex)-damage1);
                            }
                        }
                        break;
                    case "Repair":
                        int repairIndex=Integer.parseInt(tokens[1]);
                        int health=Integer.parseInt(tokens[2]);
                        if (repairIndex>=0&&repairIndex<=pirateShip.size()-1){
                            if (pirateShip.get(repairIndex)<maxHealth){
                                pirateShip.set(repairIndex,pirateShip.get(repairIndex)+health);
                                if (pirateShip.get(repairIndex)>maxHealth){
                                    pirateShip.set(repairIndex,maxHealth);
                                }
                            }
                        }
                        break;
                    case "Status":
                        int count=0;
                        for (int statusIndex = 0; statusIndex <=pirateShip.size()-1 ; statusIndex++) {
                            if (pirateShip.get(statusIndex)<maxHealth*0.2){
                                count++;
                            }
                        }
                        System.out.printf("%d sections need repair.%n",count);
                        break;
                    default:break;
                }
                if (isWarshipSunken&&isPiratSunken){
                    break;
                }
                command= scanner.nextLine();
            }
            if (isWarshipSunken){
                System.out.println("You won! The enemy ship has sunken.");
            }
            if (isPiratSunken) {
                System.out.println("You lost! The pirate ship has sunken.");
            }
            if (!isPiratSunken&&!isWarshipSunken){
                int sumPirat=0;
                int sumWarship=0;
                for (int i = 0; i < pirateShip.size(); i++) {
                    sumPirat+=pirateShip.get(i);
                }
                for (int j = 0; j < warship.size(); j++) {
                    sumWarship+=warship.get(j);
                }
                System.out.printf("Pirate ship status: %d%n",sumPirat);
                System.out.printf("Warship status: %d%n",sumWarship);
            }

        }
}
