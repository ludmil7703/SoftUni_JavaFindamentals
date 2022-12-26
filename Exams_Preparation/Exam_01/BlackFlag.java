import java.util.Scanner;
public class BlackFlag {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int days=Integer.parseInt(scanner.nextLine());
            int dailyPlunder=Integer.parseInt(scanner.nextLine());
            double expectedPlunder=Double.parseDouble(scanner.nextLine());

            double plunder=0.0;

            for (int day = 1; day <=days ; day++) {
                plunder+=dailyPlunder;
                if (day%3==0){
                    plunder+=dailyPlunder*0.5;
                }
                if (day%5==0){
                    plunder-=plunder*0.3;
                }
            }
            if (plunder>=expectedPlunder){
                System.out.printf("Ahoy! %.2f plunder gained.",plunder);
            } else {
                double percent= plunder /expectedPlunder*100;
                System.out.printf("Collected only %.2f%% of the plunder.",percent);
            }
        }
}
