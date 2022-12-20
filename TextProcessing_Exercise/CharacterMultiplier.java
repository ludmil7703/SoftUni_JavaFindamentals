import java.util.Scanner;
public class CharacterMultiplier {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String[] str= scanner.nextLine().split(" ");
            String str1=str[0];
            String str2=str[1];

            long sum=calculateSum(str1,str2);
            System.out.println(sum);


        }

        private static long calculateSum(String str1, String str2) {
            char[] firstArr=str1.toCharArray();
            char[] secondArr=str2.toCharArray();
            long sum=0;

            int minLength=Math.min(firstArr.length, secondArr.length);
            int maxLength=Math.max(firstArr.length, secondArr.length);

            for (int i = 0; i < minLength; i++) {
                sum+=firstArr[i]*secondArr[i];
            }
            if(maxLength==firstArr.length){
                for (int i = minLength; i < maxLength; i++) {
                    sum+=firstArr[i];
                }
            }else {
                for (int i = minLength; i < maxLength; i++) {
                    sum+=secondArr[i];
                }
            }
            return sum;
        }
}
