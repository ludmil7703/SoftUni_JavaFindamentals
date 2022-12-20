import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Train {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Integer> wagon= Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int maxPeople=Integer.parseInt(scanner.nextLine());

            String command=scanner.nextLine();

            while (!command.equals("end")){
                String[] token=command.split(" ");
                if (token[0].equals("Add")){
                    int people=Integer.parseInt(token[1]);
                    wagon.add(people);
                } else {
                    int people=Integer.parseInt(token[0]);
                    for (int i = 0; i < wagon.size(); i++) {
                        if (wagon.get(i)+people<=maxPeople){
                            wagon.set(i, wagon.get(i)+people);
                            break;
                        }
                    }
                }

                command= scanner.nextLine();
            }
            System.out.println(wagon.toString().replaceAll("[\\[\\],]",""));
        }
}
