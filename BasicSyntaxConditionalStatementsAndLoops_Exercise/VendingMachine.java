import java.util.Scanner;
public class VendingMachine {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double sum=0.0;
            String input = scanner.nextLine();


            while (!input.equals("Start")) {
                double coin=Double.parseDouble(input);
                if (coin==0.1||coin==0.2||coin==0.5||coin==1||coin==2){
                    sum+=coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n",coin);
                }
                input= scanner.nextLine();
            }
            String product= scanner.nextLine();

            while (!product.equals("End")){
                if (product.equals("Nuts")){

                    if (sum<2){
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Nuts");
                        sum-=2.0;
                    }
                } else if (product.equals("Water")) {
                    if (sum<0.7){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Water");
                        sum-=0.7;
                    }
                } else if (product.equals("Crisps")) {
                    if (sum<1.5){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Crisps");
                        sum-=1.5;
                    }
                } else if (product.equals("Soda")) {

                    if (sum<0.8){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Soda");
                        sum-=0.8;
                    }
                } else if (product.equals("Coke")) {

                    if (sum<1.0){
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Coke");
                        sum-=1.0;
                    }
                } else {
                    System.out.println("Invalid product");
                }

                product= scanner.nextLine();
            }
            System.out.printf("Change: %.2f",sum);
        }
}
