import java.util.Scanner;
public class BonusScoringSystem {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double maxBonus=0.0;
            int attendanceStudent=0;

            int students=Integer.parseInt(scanner.nextLine());
            int lectures=Integer.parseInt(scanner.nextLine());
            int bonusAdd=Integer.parseInt(scanner.nextLine());


            for (int student = 1; student <=students ; student++) {
                int attendance=Integer.parseInt(scanner.nextLine());

                double bonus=attendance*1.0/lectures*(5+bonusAdd);
                if (bonus>=maxBonus){
                    maxBonus=bonus;
                    attendanceStudent=attendance;

                }
            }
            System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
            System.out.printf("The student has attended %d lectures.",attendanceStudent);
        }
}
