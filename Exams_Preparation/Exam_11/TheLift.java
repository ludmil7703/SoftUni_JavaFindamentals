import java.util.Arrays;
import java.util.Scanner;
public class TheLift {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int people=Integer.parseInt(scanner.nextLine());
            int[] wagon= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            boolean isEndPeople=false;
            int startPeople=people;
            boolean isLiftFull=false;
            int places=0;
            int maxPlaces=4* wagon.length;

            for (int index = 0; index < wagon.length; index++) {
                places+=wagon[index];
                if(wagon[index]<4&&people>0&&wagon[index]>=0){

                    for (int i = wagon[index]; i <4 ; i++) {
                        if (people>0){
                            people--;
                            places++;
                            wagon[index]=wagon[index]+1;
                        } else {
                            isEndPeople=true;
                        }
                    }
                }
                if (isEndPeople){
                    break;
                }
            }
            if (places==maxPlaces){
                isLiftFull=true;
            }

            if (people == 0&&!isLiftFull) {

                System.out.println("The lift has empty spots!");
            }
            if (people>0&&isLiftFull) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            }


            for (int i = 0; i < wagon.length; i++) {
                System.out.print(wagon[i]+" ");
            }
        }
}
