import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Race {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String digitsRegex="(?<digits>[^\\W+^[A-Za-z]])";
            String wordRegex="(?<digits>[^\\W+^\\d])";

            Pattern wordPattern=Pattern.compile(wordRegex);
            Pattern digitPattern=Pattern.compile(digitsRegex);

            Map<String,Integer> names=new LinkedHashMap<>();
            String[] nameAr=scanner.nextLine().split(", ");
            for (String item:nameAr){
                names.put(item,0);
            }

            String input= scanner.nextLine();

            while (!input.equals("end of race")){
                Matcher wordMatch= wordPattern.matcher(input);
                Matcher digitMatch= digitPattern.matcher(input);
                String currentName="";
                int points=0;
                while (wordMatch.find()){
                    currentName+=wordMatch.group();
                }


                if (names.containsKey(currentName)){
                    while (digitMatch.find()){
                        points+=Integer.parseInt(digitMatch.group());
                    }
                    names.replace(currentName, names.get(currentName)+points);
                }



                input= scanner.nextLine();
            }

            List<String> nameFirstThree=names.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(3)
                    .map(entry->entry.getKey())
                    .collect(Collectors.toList());
            System.out.println("1st place: "+nameFirstThree.get(0));
            System.out.println("2nd place: "+nameFirstThree.get(1));
            System.out.println("3rd place: "+nameFirstThree.get(2));

        }
}
