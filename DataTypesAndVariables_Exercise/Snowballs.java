import java.util.Scanner;
public class Snowballs {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int N=Integer.parseInt(scanner.nextLine());
            double maxValue=0;
            int currentSnow=0;
            int currentTime=0;
            int currentQuality=0;


            for (int i = 0; i < N; i++) {

                int snowballSnow=Integer.parseInt(scanner.nextLine());
                int snowballTime=Integer.parseInt(scanner.nextLine());
                int snowballQuality=Integer.parseInt(scanner.nextLine());
                double snowballValue=Math.pow((int)(snowballSnow/snowballTime),snowballQuality);
                if (maxValue<snowballValue){
                    maxValue=snowballValue;
                    currentSnow=snowballSnow;
                    currentTime=snowballTime;
                    currentQuality=snowballQuality;
                }
            }
            System.out.printf("%d : %d = %.0f (%d)",currentSnow,currentTime,maxValue,currentQuality);
        }
}
