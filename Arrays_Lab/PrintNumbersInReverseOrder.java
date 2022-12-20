import java.util.Scanner;
public class PrintNumbersInReverseOrder {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            int number[]=new int[n];

            for (int i = 0; i <= number.length-1; i++) {
                number[i]=Integer.parseInt(scanner.nextLine());
            }
            for (int i = number.length-1; i >= 0; i--) {
                System.out.printf("%d ",number[i]);
            }
        }
}
