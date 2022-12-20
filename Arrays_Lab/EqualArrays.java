import java.util.Arrays;
import java.util.Scanner;
public class EqualArrays {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int maxLenght=0;
            int sum=0;
            boolean areNotIdentical=false;

            int [] firsArr= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int [] secondArr=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (firsArr.length>=secondArr.length){
                maxLenght= firsArr.length;
            } else {
                maxLenght= secondArr.length;
            }
            for (int i = 0; i < maxLenght; i++) {
                sum+=firsArr[i];
                if (firsArr[i]!=secondArr[i]){
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    areNotIdentical=true;
                    break;
                }
            }
            if(!areNotIdentical){
                System.out.printf("Arrays are identical. Sum: %d",sum);
            }

        }
}
