import java.util.Scanner;
public class Vacation {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int people=Integer.parseInt(scanner.nextLine());
            String typeOfPeople= scanner.nextLine();
            String day= scanner.nextLine();

            double price=0.0;
            double discount=0.0;

            switch (typeOfPeople) {
                case "Students":
                    if (day.equals("Friday")) {
                        price=8.45;
                    }else if (day.equals("Saturday")) {
                        price=9.80;
                    } else if (day.equals("Sunday")) {
                        price=10.46;
                    }
                    if (people>=30) {
                        discount=0.15;
                    }break;
                case "Business":
                    if (day.equals("Friday")) {
                        price=10.90;
                    }else if (day.equals("Saturday")) {
                        price=15.60;
                    } else if (day.equals("Sunday")) {
                        price=16;
                    }
                    if (people>=100) {
                        people-=10;
                    }break;
                case "Regular":
                    if (day.equals("Friday")) {
                        price=15;
                    }else if (day.equals("Saturday")) {
                        price=20;
                    } else if (day.equals("Sunday")) {
                        price=22.50;
                    }
                    if (people>=10&&people<=20) {
                        discount=0.05;
                    }break;
            }
            double totalPrice=people*price-people*price*discount;
            System.out.printf("Total price: %.2f",totalPrice);
        }
}
