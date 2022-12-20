import java.util.Scanner;
public class MultiplyEvensByOdds {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=Math.abs(Integer.parseInt(scanner.nextLine()));
            System.out.println(getMultipleOfEvensAndOdds(n));

        }
        public static int getMultipleOfEvensAndOdds(int n) {
            int evensSum=getSumOfEvenDigits(n);
            int oddsSum=getSumOfOddDigits(n);

            return evensSum*oddsSum;
        }

        private static int getSumOfEvenDigits(int n) {
            int evenSum=0;

            while (n>0) {
                if (n%2==0){
                    evenSum+=n%10;
                }

                n=n/10;
            }
            return evenSum;
        }
        private static int getSumOfOddDigits(int n) {
            int oddsSum = 0;

            while (n > 0) {
                if (!(n % 2 == 0)) {
                    oddsSum += n % 10;
                }

                n = n / 10;
            }
            return oddsSum;
        }
}
