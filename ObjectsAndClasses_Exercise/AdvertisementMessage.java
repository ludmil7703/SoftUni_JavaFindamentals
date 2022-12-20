import java.util.*;
public class AdvertisementMessage {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> phrases= Arrays.asList("Excellent product.", "Such a great product."
                    , "I always use that product.", "Best product of its category."
                    , "Exceptional product.", "I can’t live without this product.");
            List<String> events=Arrays.asList("Now I feel good.", "I have succeeded with this product.",
                    "Makes miracles. I am happy of the results!",
                    "I cannot believe but now I feel awesome."
                    , "Try it yourself, I am very satisfied.", "I feel great!");
            List<String> authors=Arrays.asList("Diana", "Petya", "Stella", "Elena",
                    "Katya", "Iva", "Annie", "Eva");
            List<String> cities=Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");
            Random rnd=new Random();

            int n=Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                int randomPhrase= rnd.nextInt(phrases.size());
                int randomEvents= rnd.nextInt(events.size());
                int randomAuthors= rnd.nextInt(authors.size());
                int randomCities= rnd.nextInt(cities.size());

                System.out.printf("%s %s %s - %s%n",phrases.get(randomPhrase),
                        events.get(randomEvents),authors.get(randomAuthors),
                        cities.get(randomCities));
                phrases.remove(Integer.valueOf(randomPhrase));
                events.remove(Integer.valueOf(randomEvents));
                authors.remove(Integer.valueOf(randomAuthors));
                cities.remove(Integer.valueOf(randomCities));
            }

        }
}
