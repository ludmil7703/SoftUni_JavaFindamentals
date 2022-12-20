import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CountCharsInAString {

        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);

            String text= scanner.nextLine();
            Map<Character, Integer> symbolCount = new LinkedHashMap<>();

            for (char symbol:text.toCharArray()) {
                if(symbol==' '){
                    continue;
                }
                if (!symbolCount.containsKey(symbol)){
                    symbolCount.put(symbol,1);
                } else {
                    symbolCount.put(symbol, symbolCount.get(symbol) + 1);
                }

            }
            symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
        }
}
