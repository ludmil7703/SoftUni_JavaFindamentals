import java.util.Scanner;
public class PrintAndSum {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int sum=0;

            int num1=Integer.parseInt(scanner.nextLine());
            int num2=Integer.parseInt(scanner.nextLine());

            for (int i=num1;i<=num2;i++){
                System.out.printf("%d ",i);
                sum+=i;
            }
            System.out.println("");
            System.out.println("Sum: "+sum);
        }
}
