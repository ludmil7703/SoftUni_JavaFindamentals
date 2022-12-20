import java.util.Scanner;
public class Orders {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int N=Integer.parseInt(scanner.nextLine());
            double totalPrice=0.0;

            for (int i = 1; i <=N ; i++) {
                double pricePerCapsule=Double.parseDouble(scanner.nextLine());
                int days=Integer.parseInt(scanner.nextLine());
                int capsules=Integer.parseInt(scanner.nextLine());
                double price=days*capsules*pricePerCapsule;
                totalPrice+=price;
                System.out.printf("The price for the coffee is: $%.2f%n",price);
            }
            System.out.printf("Total: $%.2f",totalPrice);
        }
}
