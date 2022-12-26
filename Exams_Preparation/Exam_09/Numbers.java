import java.util.*;
import java.util.stream.Collectors;
public class Numbers {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int sum=0;

            for (int index = 0; index < numbers.size(); index++) {
                sum+= numbers.get(index);
            }
            double average=sum*1.00/numbers.size();

            List<Integer> newNumbers=new ArrayList<>();
            Collections.sort(numbers);



            for (int index = numbers.size()-1; index >=0; index--) {

                if (numbers.get(index) > average) {
                    newNumbers.add(numbers.get(index));
                }
                if(newNumbers.size()==5){
                    break;
                }
            }
            Collections.sort(newNumbers);
            if (newNumbers.size()==0) {
                System.out.println("No");

            } else {
                for (int i = newNumbers.size()-1; i >=0; i--) {
                    System.out.print(newNumbers.get(i)+" ");
                }
            }

        }
}
