import java.util.Scanner;
public class Train {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=Integer.parseInt(scanner.nextLine());
            int[] peopleInWagon=new int[n];
            int sum=0;

            for (int index = 0; index <= peopleInWagon.length-1; index++) {
                peopleInWagon[index]=Integer.parseInt(scanner.nextLine());
                sum+=peopleInWagon[index];
            }
            for (int index = 0; index <= peopleInWagon.length-1; index++) {
                System.out.print(peopleInWagon[index]+" ");
            }
            System.out.println();
            System.out.println(sum);

        }
}
