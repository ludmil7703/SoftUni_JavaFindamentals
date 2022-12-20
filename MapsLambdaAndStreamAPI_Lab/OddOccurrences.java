import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class OddOccurrences {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String[] words=scanner.nextLine().split(" ");
            LinkedHashMap<String, Integer> counts=new LinkedHashMap<>();

            for (String word: words) {
                String wordInLowerCAse=word.toLowerCase();
                if(counts.containsKey(wordInLowerCAse)){
                    counts.put(wordInLowerCAse,counts.get(wordInLowerCAse)+1);
                } else {
                    counts.put(wordInLowerCAse, 1);
                }
            }
            ArrayList<String> odds=new ArrayList<>();
            for (var entry: counts.entrySet()){
                if (entry.getValue()%2==1){
                    odds.add(entry.getKey());
                }
            }

            for (int i = 0; i < odds.size(); i++) {
                System.out.print(odds.get(i));
                if (i<odds.size()-1){
                    System.out.print(", ");
                }
            }
        }
}
