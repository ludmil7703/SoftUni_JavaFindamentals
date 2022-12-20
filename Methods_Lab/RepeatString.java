import java.util.Scanner;
public class RepeatString {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String str= scanner.nextLine();
            int count=Integer.parseInt(scanner.nextLine());
            String res=repString(str,count);
            System.out.println(res);


        }
        private static String repString(String str, int count) {

            String result="";
            for (int i = 0; i < count; i++) {
                System.out.print(str);
            }
            return result;
        }
}
