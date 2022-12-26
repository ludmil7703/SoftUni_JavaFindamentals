import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class HeartDelivery {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Integer> neighborhood= Arrays.stream(scanner.nextLine().split("@"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int currentIndex=0;
            int countCupids=0;

            String[] input= scanner.nextLine().split(" ");


            while (!input[0].equals("Love!")) {
                int jumpIndex = Integer.parseInt(input[1]);
                if (input[0].equals("Jump")) {

                    if (currentIndex + jumpIndex > neighborhood.size() - 1) {
                        currentIndex = 0;
                    } else {
                        currentIndex = currentIndex + jumpIndex;
                    }

                    if (neighborhood.get(currentIndex) == 0) {
                        System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                    } else {
                        neighborhood.set(currentIndex, neighborhood.get(currentIndex) - 2);
                        if (neighborhood.get(currentIndex) == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                            countCupids++;
                        }
                    }
                }
                input = scanner.nextLine().split(" ");
            }
            System.out.printf("Cupid's last position was %d.%n",currentIndex);
            if (countCupids==neighborhood.size()){
                System.out.println("Mission was successful.");
            } else {
                System.out.printf("Cupid has failed %d places.%n",neighborhood.size()-countCupids);
            }

        }
}
