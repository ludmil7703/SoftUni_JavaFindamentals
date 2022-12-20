import java.util.Scanner;
public class SpiceMustFlow {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int startingYield=Integer.parseInt(scanner.nextLine());
            int days=0;
            int spice=0;
            int restSpice=0;
            int yield=startingYield;
            while (yield>=100){
                spice=yield-26;
                restSpice+=spice;
                days++;
                yield-=10;
            }
            System.out.println(days);
            if (restSpice>=26){
                restSpice-=26;
            }
            System.out.println(restSpice);
        }
}
