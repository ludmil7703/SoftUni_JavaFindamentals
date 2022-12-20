import java.util.Scanner;
public class GreaterOfTwoValues {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String command= scanner.nextLine();
            switch (command){
                case "int":
                    int firstNum=Integer.parseInt(scanner.nextLine());
                    int secondNum=Integer.parseInt(scanner.nextLine());
                    System.out.println(getMax(firstNum,secondNum));
                    break;
                case "char":
                    char first=scanner.next().charAt(0);
                    char second=scanner.next().charAt(0);
                    System.out.println(getMax(first,second));
                    break;
                case "string":
                    String firstStr= scanner.nextLine();
                    String secondStr= scanner.nextLine();
                    System.out.println(getMax(firstStr,secondStr));
                    break;
                default:break;
            }

        }
        static int getMax(int firstNum, int secondNum) {
            if (firstNum>secondNum){
                return firstNum;
            }
            return secondNum;
        }
        static char getMax(char first, char second) {
            if (first>second){
                return first;
            }
            return second;
        }
        static String getMax(String firstStr, String secondStr) {
            if (firstStr.compareTo(secondStr) >=0) {
                return firstStr;
            }
            return secondStr;
        }
}
