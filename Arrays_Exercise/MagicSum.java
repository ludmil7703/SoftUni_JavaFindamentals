import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int [] array= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e-> Integer.parseInt(e))
                    .toArray();
            int sum=Integer.parseInt(scanner.nextLine());

            for (int index = 0; index <= array.length-1; index++) {
                int firsNumber=array[index];

                for (int sumIndex = index+1; sumIndex <= array.length-1 ; sumIndex++) {
                    int secondNumber=array[sumIndex];
                    if (firsNumber+secondNumber==sum){
                        System.out.println(firsNumber+" "+secondNumber);
                    }

                }
            }
        }
}
