import java.util.Scanner;
public class PrintPartOfASCIITable {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int first=Integer.parseInt(scanner.nextLine());
            int last=Integer.parseInt(scanner.nextLine());

            for (int code = first; code <= last; code++) {
                char symbol=(char) code;
                System.out.print(symbol+" ");
            }
        }
}
