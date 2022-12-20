import java.util.Scanner;
public class AddAndSubtract {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int a=Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());
            int c=Integer.parseInt(scanner.nextLine());
            int sum1=sum(a,b);
            System.out.println(subtract(sum1,c));

        }
        public static int sum(int a,int b){
            int sum=a+b;
            return sum;
        }
        public static int subtract(int sum,int c){
            int subtract=sum-c;
            return subtract;
        }
}
