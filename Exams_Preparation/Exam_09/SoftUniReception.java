import java.util.Scanner;
public class SoftUniReception {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int firstEmployeeEfficiency=Integer.parseInt(scanner.nextLine());
            int secondEmployeeEfficiency=Integer.parseInt(scanner.nextLine());
            int thirdEmployeeEfficiency=Integer.parseInt(scanner.nextLine());
            int studentCount=Integer.parseInt(scanner.nextLine());
            int sumHour=0;
            int allEfficiency=firstEmployeeEfficiency+secondEmployeeEfficiency+thirdEmployeeEfficiency;


            while (studentCount>0){
                if (studentCount>allEfficiency){
                    studentCount-=allEfficiency;
                    sumHour++;
                }
                if (sumHour%4==0){
                    sumHour++;
                }

                if (studentCount>0&&studentCount<=allEfficiency){
                    sumHour++;
                    if (sumHour%4==0){
                        sumHour++;
                    }
                    break;
                }


            }
            System.out.printf("Time needed: %dh.",sumHour);

        }
}
