import java.util.Scanner;
public class WaterOverflow {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            int tank=255;
            int sum=0;

            for (int i = 0; i < n; i++) {
                int liters=Integer.parseInt(scanner.nextLine());
                sum+=liters;
                if (sum>tank){
                    System.out.println("Insufficient capacity!");
                    sum-=liters;
                }
            }
            System.out.println(sum);
        }
}
