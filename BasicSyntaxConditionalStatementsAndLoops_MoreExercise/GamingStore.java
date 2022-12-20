import java.util.Scanner;
public class GamingStore {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double balance=Double.parseDouble(scanner.nextLine());
            double price=0.0;
            double spentSum=0.0;
            boolean notFound=true;

            String gameName= scanner.nextLine();

            while (!gameName.equals("Game Time")){
                switch (gameName){
                    case "OutFall 4":
                        price=39.99;break;
                    case "CS: OG":
                        price=15.99;break;
                    case "Zplinter Zell":
                        price=19.99;break;
                    case "Honored 2":
                        price=59.99;break;
                    case "RoverWatch":
                        price=29.99;break;
                    case "RoverWatch Origins Edition":
                        price=39.99;break;
                    default:
                        notFound=false;break;
                }
                if (balance>=price&&notFound){
                    spentSum+=price;
                    balance-=price;
                    System.out.printf("Bought %s%n",gameName);
                }else if(!notFound){
                    System.out.println("Not Found");
                }
                else if(balance==0.0){
                    break;
                }
                else {
                    System.out.println("Too Expensive");
                }


                gameName= scanner.nextLine();
                notFound=true;
            }
            if (balance==0.0){
                System.out.println("Out of money!");
            } else {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spentSum,balance);
            }
        }
}
