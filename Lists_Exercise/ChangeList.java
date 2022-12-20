import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ChangeList {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            String command= scanner.nextLine();

            while (!command.equals("end")){

                String[] token=command.split(" ");
                switch (token[0]){
                    case "Delete":
                        int element=Integer.parseInt(token[1]);
                        numbers.removeAll(Arrays.asList(element));
                        break;
                    case "Insert":
                        int element1=Integer.parseInt(token[1]);
                        int index=Integer.parseInt(token[2]);
                        numbers.add(index,element1);
                        break;
                }
                command= scanner.nextLine();
            }
            for (int number: numbers) {
                System.out.print(number+" ");
            }
        }
}
