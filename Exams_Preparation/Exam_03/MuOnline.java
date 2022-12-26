import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MuOnline {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> rooms= Arrays.stream(scanner.nextLine().split("[|]"))
                    .collect(Collectors.toList());

            int health=100;
            int bitcoins=0;
            int bestRoom=0;
            int bestValue=0;
            boolean isDead=false;

            for (int index = 0; index < rooms.size(); index++) {
                String[] room=rooms.get(index).split(" ");
                int value=Integer.parseInt(room[1]);

                switch (room[0]){
                    case "potion":
                        health+=value;
                        if (health>100){
                            value=value-(health-100);
                            health=100;
                        }
                        System.out.printf("You healed for %d hp.%n",value);
                        System.out.printf("Current health: %d hp.%n",health);
                        break;
                    case "chest":
                        bitcoins+=value;
                        System.out.printf("You found %d bitcoins.%n",value);
                        break;
                    default:
                        if (health-value>0){

                            System.out.printf("You slayed %s.%n",room[0]);
                            health-=value;
                        } else {
                            if (bestValue<=value){
                                bestValue=value;
                                bestRoom=index+1;
                            }
                            System.out.printf("You died! Killed by %s.%n",room[0]);
                            System.out.printf("Best room: %d",bestRoom);
                            isDead=true;

                        }

                        break;
                }
                if (isDead){
                    break;
                }

            }
            if (!isDead){
                System.out.println("You've made it!");
                System.out.printf("Bitcoins: %d%n",bitcoins);
                System.out.printf("Health: %d%n",health);
            }
        }
}
