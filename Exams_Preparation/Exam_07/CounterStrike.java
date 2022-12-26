import java.util.Scanner;
public class CounterStrike {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int energy=Integer.parseInt(scanner.nextLine());
            int count=0;
            boolean isEnoughEnergy=true;

            String command= scanner.nextLine();

            while (!command.equals("End of battle")){
                int distance=Integer.parseInt(command);

                if (energy-distance<0){
                    isEnoughEnergy=false;
                    break;
                } else {
                    energy -= distance;
                    count++;
                    if (count%3==0){
                        energy+=count;
                    }
                }
                command= scanner.nextLine();
            }
            if (isEnoughEnergy){
                System.out.printf("Won battles: %d. Energy left: %d",count,energy);
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",count,energy);
            }
        }

}
