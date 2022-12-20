import java.util.Scanner;
public class SumDigits {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int number=Integer.parseInt(scanner.nextLine());
            int sum=0;
            int currentNum=0;

            while (number>0){
                currentNum=number%10;
                sum+=currentNum;
                currentNum=number/10;
                number=currentNum;
            }
            System.out.println(sum);
        }
}
