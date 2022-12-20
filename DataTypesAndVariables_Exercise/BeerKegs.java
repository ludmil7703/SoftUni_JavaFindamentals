import java.util.Scanner;
public class BeerKegs {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            double volume=0.0;
            String keg="";

            for (int i = 0; i < n; i++) {

                String currentKeg= scanner.nextLine();
                double radius=Double.parseDouble(scanner.nextLine());
                double high=Integer.parseInt(scanner.nextLine());
                double currentVolume=Math.PI*radius*radius*high;
                if (currentVolume>volume){
                    volume=currentVolume;
                    keg=currentKeg;
                }

            }
            System.out.println(keg);
        }
}
