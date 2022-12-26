import java.util.Scanner;
public class ComputerStore {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double totalPrice=0.0;
            double taxes=0.0;

            String command= scanner.nextLine();

            while (!command.equals("special")&&!command.equals("regular")){
                double price=Double.parseDouble(command);
                if (price<=0){
                    System.out.println("Invalid price!");
                } else {
                    totalPrice+=price;
                }

                command= scanner.nextLine();
            }
            taxes=totalPrice*0.2;
            if (totalPrice==0){
                System.out.println("Invalid order!");
            } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n",totalPrice);
                System.out.printf("Taxes: %.2f$%n",taxes);
                if (command.equals("special")){
                    totalPrice=(totalPrice+taxes)-(totalPrice+taxes)*0.1;
                } else {
                    totalPrice=totalPrice+taxes;
                }
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$",totalPrice);
            }
        }
}
