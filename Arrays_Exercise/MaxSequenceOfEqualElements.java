import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceOfEqualElements {
           public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            int count=0;
            int longestSequence=0;
            int tempIndex=0;

            for (int index = 0; index < array.length - 1; index++) {
                int currenElement = array[index];//obhojdame elementite
                int rightElement = array[index+1];

                if (currenElement == rightElement) {
                    count++;
                } else {
                    count=0;
                }
                if (count>longestSequence){
                    longestSequence=count;
                    tempIndex=index;
                }

            }
            for (int i = 0; i < longestSequence+1; i++) {
                System.out.print(array[tempIndex]+" ");
            }
        }
}
