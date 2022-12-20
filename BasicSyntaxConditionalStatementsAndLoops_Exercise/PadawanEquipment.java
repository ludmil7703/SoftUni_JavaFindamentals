import java.util.Scanner;
public class PadawanEquipment {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double amount=Double.parseDouble(scanner.nextLine());
            int students=Integer.parseInt(scanner.nextLine());
            double lightsabers=Double.parseDouble(scanner.nextLine());
            double robes=Double.parseDouble(scanner.nextLine());
            double belts=Double.parseDouble(scanner.nextLine());
            double price=lightsabers*(Math.ceil(students*1.1))+robes*students+belts*(students-(students/6));

            if (amount>=price){
                System.out.printf("The money is enough - it would cost %.2flv.",price);
            } else {
                System.out.printf("George Lucas will need %.2flv more.",price-amount);
            }
        }
}
