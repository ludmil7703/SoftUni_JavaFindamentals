import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Furniture {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String regex=">>(?<furniture>[A-Z,a-z]+)<<(?<price>[\\d.]+)[!](?<quantity>[\\d]+)";

            Pattern pattern=Pattern.compile(regex);
            double allPrice=0;

            String input= scanner.nextLine();
            System.out.println("Bought furniture:");

            while (!input.equals("Purchase")){
                Matcher furnitureMatcher= pattern.matcher(input);
                if (furnitureMatcher.find()) {
                    String furnitureName = furnitureMatcher.group("furniture");
                    Double price = Double.parseDouble(furnitureMatcher.group("price"));
                    Integer quantity = Integer.parseInt(furnitureMatcher.group("quantity"));
                    System.out.println(furnitureName);
                    allPrice += (price * quantity);
                }

                input= scanner.nextLine();
            }
            System.out.printf("Total money spend: %.2f",allPrice);
        }
}
