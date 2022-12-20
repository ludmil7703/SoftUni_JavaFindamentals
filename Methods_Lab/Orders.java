import java.util.Scanner;
public class Orders {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String product= scanner.nextLine();
            double quantity=Double.parseDouble(scanner.nextLine());
            totalPrice(product,quantity);

        }
        public static void totalPrice(String product,double quantity){
            double price=0.0;
            switch (product){
                case "coffee":
                    price=1.50;break;
                case "water":
                    price=1.0;break;
                case "coke":
                    price=1.40;break;
                case "snacks":
                    price=2.00;break;
                default:break;
            }
            System.out.printf("%.2f",price*quantity);
        }
}
