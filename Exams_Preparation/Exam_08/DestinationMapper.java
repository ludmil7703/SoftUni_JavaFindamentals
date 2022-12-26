import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DestinationMapper {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String places= scanner.nextLine();
            String regex="([=\\/])(?<place>[A-Z][A-Za-z]{2,})\\1";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(places);
            int sum=0;
            List<String> placeList=new ArrayList<>();

            while (matcher.find()){
                String currentPlace= matcher.group("place");
                sum+=currentPlace.length();
                placeList.add(currentPlace);

            }

            if(!placeList.isEmpty()) {

                System.out.println("Destinations: " + String.join(", ", placeList));
            } else {
                System.out.println("Destinations:");
            }

            System.out.println("Travel Points: "+sum);


        }
}
