import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="@(?<planetName>[A-Za-z]+)[^@,\\-!>:]*:(?<population>\\d+)[^@,\\-!:>]*!(?<attackType>[AD])![^@,\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern pattern=Pattern.compile(regex);
        ArrayList<String> attackedList=new ArrayList<>();
        int attackSum=0;
        ArrayList<String> destroyList=new ArrayList<>();
        int destroySum=0;

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {


            StringBuilder input = new StringBuilder(scanner.nextLine());

            int sum = 0;


            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 's' || input.charAt(j) == 't' || input.charAt(j) == 'a'
                        || input.charAt(j) == 'r'||input.charAt(j) == 'T' || input.charAt(j) == 'S' || input.charAt(j) == 'A'
                        || input.charAt(j) == 'R') {
                    sum++;
                }

            }
            StringBuilder enigma=new StringBuilder();
            for (int k = 0; k < input.length(); k++) {
                enigma.append(Character.toString(input.charAt(k)-sum));
            }
            Matcher matcher= pattern.matcher(enigma);
            while (matcher.find()){
                String planeName=matcher.group("planetName");
                int population=Integer.parseInt(matcher.group("population"));
                String attackType= matcher.group("attackType");
                int soldierCount=Integer.parseInt(matcher.group("soldierCount"));
                if(attackType.equals("A")){
                    attackedList.add(planeName);
                    attackSum++;
                } else {
                    destroyList.add(planeName);
                    destroySum++;
                }

            }

        }
        System.out.println("Attacked planets: "+attackSum);
        Collections.sort(attackedList);
        attackedList.forEach(planet-> System.out.println("-> "+planet));
        System.out.println("Destroyed planets: "+destroySum);
        Collections.sort(destroyList);
        destroyList.forEach(planet-> System.out.println("-> "+planet));


    }
}
