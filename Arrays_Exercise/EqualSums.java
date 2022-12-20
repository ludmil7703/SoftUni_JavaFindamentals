import java.util.Arrays;
import java.util.Scanner;
public class EqualSums {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int[] array= Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(e->Integer.parseInt(e))
                    .toArray();
            boolean isFound=false;

            for (int index = 0; index <=array.length-1; index++) {
                int currentElement=array[index];
                //proverka dali sumata na elementite w lqvo==sumata v dqsno
                int leftSum=0;
                int rightSum=0;

                for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                    leftSum+=array[leftIndex];
                }
                for (int rightIndex = index+1; rightIndex <= array.length-1 ; rightIndex++) {
                    rightSum+=array[rightIndex];

                }
                if (leftSum==rightSum){
                    System.out.println(index);
                    isFound=true;
                    break;
                }
            }
            if (!isFound){
                System.out.println("no");
            }

        }
}
