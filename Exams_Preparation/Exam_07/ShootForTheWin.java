import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ShootForTheWin {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int count=0;

            int[] targets=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            String command= scanner.nextLine();

            while (!command.equals("End")){
                int shoot=Integer.parseInt(command);

                if (shoot>=0&&shoot<=targets.length-1){
                    int currentElement=targets[shoot];
                    targets[shoot]=-1;
                    count++;
                    for (int index = 0; index < targets.length; index++) {
                        if (targets[index]!=-1){

                            if (currentElement<targets[index]){
                                targets[index]-=currentElement;

                            }else {
                                targets[index]+=currentElement;
                            }
                        }
                    }

                }

                command= scanner.nextLine();
            }
            System.out.printf("Shot targets: %d -> ",count);
            for (int index = 0; index < targets.length; index++) {
                System.out.print(targets[index]+" ");
            }

        }
}
