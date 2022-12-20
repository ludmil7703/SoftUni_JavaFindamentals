import java.util.Scanner;
public class SumEvenNumbers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String inputLine= scanner.nextLine();
            int sum=0;
            String[] arr= inputLine.split(" ");
            int [] numbersArr= new int[arr.length];
            for (int i = 0; i < numbersArr.length ; i++) {
                numbersArr[i] = Integer.parseInt(arr[i]);
            }
            for (int i = 0; i < numbersArr.length; i++) {
                if (numbersArr[i]%2==0){
                    sum+=numbersArr[i];
                }
            }
            System.out.println(sum);
        }
}
