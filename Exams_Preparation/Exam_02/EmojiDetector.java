import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmojiDetector {
           public static  void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String regex="([:*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
            String digit="\\d";
            Pattern emojiPattern=Pattern.compile(regex);
            Pattern digitPattern=Pattern.compile(digit);

            List<String> emojiList=new ArrayList<>();
            BigInteger multiplyDigit=new BigInteger("1");
            int sumEmoji=0;
            int validCount=0;

            String text= scanner.nextLine();

            Matcher matcherDigit= digitPattern.matcher(text);

            while (matcherDigit.find()){

                multiplyDigit=multiplyDigit.multiply(BigInteger.valueOf(Integer.parseInt(matcherDigit.group())));
            }

            Matcher matcherEmoji=emojiPattern.matcher(text);

            while (matcherEmoji.find()){
                validCount++;
                String emoji=matcherEmoji.group("emoji");
                for (int index = 0; index < emoji.length(); index++) {
                    sumEmoji+=(int) emoji.charAt(index);
                }
                if (BigInteger.valueOf(sumEmoji).compareTo(multiplyDigit)>0){
                    emojiList.add(matcherEmoji.group());
                }
                sumEmoji=0;
            }
            System.out.println("Cool threshold: "+multiplyDigit);
            System.out.print(validCount+" emojis found in the text.");
            System.out.println(" The cool ones are:");
            if (!emojiList.isEmpty()) {
                for (String s : emojiList) {
                    System.out.println(s);
                }
            }

        }
}
