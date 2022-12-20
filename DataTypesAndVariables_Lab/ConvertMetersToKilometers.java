import java.util.Scanner;
public class ConvertMetersToKilometers {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int distance=Integer.parseInt(scanner.nextLine());
            double kilometers=distance/1000.0;
            System.out.printf("%.2f",kilometers);
        }
}
