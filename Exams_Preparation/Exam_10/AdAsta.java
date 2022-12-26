import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AdAsta {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String text= scanner.nextLine();

            String regex="([#\\|])(?<food>[A-Za-z\\s*]+)\\1(?<date>[0-9]{2}+(\\/)+[0-9]{2}+\\4+[0-9]{2}+)\\1(?<calories>[1]?[0-9]{1,4}+)\\1";

            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(text);
            int sumCalories=0;

            List<String> foodList=new ArrayList<>();



            while (matcher.find()){
                String food= matcher.group("food");
                String date= matcher.group("date");
                String calories=matcher.group("calories");
                foodList.add(food+"&"+date+"&"+calories);
                int caloriesInt=Integer.parseInt(matcher.group("calories"));
                sumCalories+=caloriesInt;

            }
            int days=sumCalories/2000;
            if(days>0) {
                System.out.printf("You have food to last you for: %d days!%n", days);

                for (int index = 0; index < foodList.size(); index++) {
                    String[] currentFood = foodList.get(index).split("&");
                    System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", currentFood[0], currentFood[1], currentFood[2]);


                }
            }else {
                System.out.printf("You have food to last you for: %d days!%n", days);
            }

        }
}
