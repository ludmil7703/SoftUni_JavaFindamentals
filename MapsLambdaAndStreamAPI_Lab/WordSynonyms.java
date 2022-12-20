import java.util.*;
public class WordSynonyms {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            Map<String, List<String>> mapWords = new LinkedHashMap<>();

            for (int i = 1; i <= n; i++) {

                String word = scanner.nextLine();
                String synonym = scanner.nextLine();

                if (!mapWords.containsKey(word)) {
                    mapWords.put(word, new ArrayList<>());
                    mapWords.get(word).add(synonym);
                } else {
                    mapWords.get(word).add(synonym);
                }

            }
            for (Map.Entry<String, List<String>> entry : mapWords.entrySet()){
                System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
            }
        }
}
