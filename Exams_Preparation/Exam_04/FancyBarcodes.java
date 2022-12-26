import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FancyBarcodes {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String regex="@[#]{1,}[A-Z][A-Za-z0-9]{4,}[A-Z]@[#]{1,}";
            String regexDigit="\\d";
            Pattern pattern=Pattern.compile(regex);
            Pattern pattern1=Pattern.compile(regexDigit);

            int n=Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                StringBuilder product=new StringBuilder("");

                String barcode= scanner.nextLine();
                Matcher matcher= pattern.matcher(barcode);
                if (matcher.find()){
                    String input= matcher.group();
                    Matcher matcher1= pattern1.matcher(input);

                    while (matcher1.find()) {
                        product.append(matcher1.group());
                    }
                    if(product.toString().isEmpty()) {
                        product=new StringBuilder("00");
                    }
                    System.out.println("Product group: "+product);


                } else {
                    System.out.println("Invalid barcode");
                }

            }
        }
}
