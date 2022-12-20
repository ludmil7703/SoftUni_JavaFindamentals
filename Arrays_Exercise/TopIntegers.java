import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int[] array= Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int index = 0; index < array.length-1 ; index++) {
                int currenElement=array[index];
                int sum=0;

                for (int righIndex = index+1; righIndex <= array.length-1; righIndex++) {
                    int rightElement=array[righIndex];

                    if (currenElement>rightElement){
                        sum+=1;
                    }
                    if (sum == array.length-1-index){
                        System.out.print(currenElement+" ");
                    }
                }

            }
            System.out.print(array[array.length-1]);

        }
}
