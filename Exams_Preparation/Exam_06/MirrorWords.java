import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MirrorWords {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String text= scanner.nextLine();
            String regex="(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";

            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(text);
            List<String> wordList=new ArrayList<>();
            int sum=0;
            int mirrorCount=0;

            while (matcher.find()){
                String firstword= matcher.group("firstWord");
                String secondword=matcher.group("secondWord");
                sum++;
                StringBuilder secondBuilder=new StringBuilder(secondword);
                String secondWordReversed=secondBuilder.reverse().toString();

                if (firstword.equals(secondWordReversed)){
                    wordList.add(firstword+" <=> "+secondword);

                }
            }
            if (sum==0){
                System.out.println("No word pairs found!");
            } else {
                System.out.println(sum + " word pairs found!");
            }
            if (wordList.size()==0){
                System.out.println("No mirror words!");
            } else {

                System.out.println("The mirror words are:");
                System.out.println(String.join(", ",wordList));


            }


        }
}
