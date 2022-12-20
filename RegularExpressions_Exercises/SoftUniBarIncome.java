import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SoftUniBarIncome {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String regex="%(?<customer>[A-Z][a-z]+)%[^\\|$%.]*<(?<product>\\w+)>[^\\|$.%]*\\|(?<quantity>\\d+)\\|(?<price>\\d+[.\\d+]+)\\$";
            double totalPrice=0;
            Pattern pattern=Pattern.compile(regex);

            String input= scanner.nextLine();

            while (!input.equals("end of shift")){
                Matcher shift= pattern.matcher(input);
                if (shift.find()){
                    String customer=shift.group("customer");
                    String product= shift.group("product");
                    int quantity=Integer.parseInt(shift.group("quantity"));
                    double price=Double.parseDouble(shift.group("price"));
                    double allPrice=quantity*price;
                    totalPrice+=allPrice;
                    System.out.printf("%s: %s - %.2f%n",customer,product,allPrice);

                }


                input= scanner.nextLine();
            }
            System.out.printf("Total income: %.2f%n",totalPrice);
        }
}
