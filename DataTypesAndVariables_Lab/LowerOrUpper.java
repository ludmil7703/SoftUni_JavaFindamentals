import java.util.Scanner;
public class LowerOrUpper {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            char value=scanner.nextLine().toCharArray()[0];
            boolean lowerCase=Character.isLowerCase(value);
            if (lowerCase){
                System.out.println("lower-case");
            } else {
                System.out.println("upper-case");
            }
        }
}
