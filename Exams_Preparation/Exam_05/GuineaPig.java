import java.util.Scanner;
public class GuineaPig {
          public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double food=Double.parseDouble(scanner.nextLine());
            double hay=Double.parseDouble(scanner.nextLine());
            double cover=Double.parseDouble(scanner.nextLine());
            double weightGuinea=Double.parseDouble(scanner.nextLine());
            food=food*1000;hay=hay*1000;cover=cover*1000;weightGuinea=weightGuinea*1000;
            boolean isEnough=true;

            for (int days = 1; days <=30 ; days++) {

                food-=300;
                if (days%2==0){
                    hay=hay-food*0.05;
                }
                if (days%3==0){
                    cover=cover-weightGuinea/3;
                }
                if (food<0||hay<0||cover<0){
                    isEnough=false;
                    break;
                }
            }
            food/=1000;hay/=1000;cover/=1000;weightGuinea/=1000;
            if (isEnough){
                System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                        food,hay,cover);
            } else {
                System.out.println("Merry must go to the pet store!");
            }


        }
}
