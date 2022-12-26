import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MovingTarget {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Integer> targets= Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            String command= scanner.nextLine();

            while (!command.equals("End")){
                String[] token=command.split(" ");
                int index=Integer.parseInt(token[1]);
                int value=Integer.parseInt(token[2]);
                switch (token[0]){
                    case "Shoot":

                        if (index>=0&&index<= targets.size()-1){
                            targets.set(index, targets.get(index)-value);
                            if (targets.get(index)<=0){
                                targets.remove(index+0);
                            }
                        }

                        break;
                    case "Add":
                        if (index>=0&&index<= targets.size()-1){
                            targets.add(index,value);
                        } else {
                            System.out.println("Invalid placement!");
                        }
                        break;
                    case "Strike":
                        if (2*value+1>=targets.size()&&index<0||index>=targets.size()-1){
                            break;
                        }
                        if (index-value>=0&&index+value<= targets.size()-1){
                            targets.subList(index-value,index+value+1).clear();
                        } else {
                            System.out.println("Strike missed!");
                        }

                        break;
                    default:break;
                }

                command= scanner.nextLine();
            }
            for (int i = 0; i < targets.size()-1; i++) {
                System.out.print(targets.get(i)+"|");
            }
            System.out.println(targets.get(targets.size()-1));
        }
}
