import java.util.*;
public class SortNumbers {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Integer> numberArr=new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int num=Integer.parseInt(scanner.nextLine());
                numberArr.add(num);
            }
            numberArr.sort(Comparator.reverseOrder());
            for (int i = 0; i < 3; i++) {

                System.out.println(numberArr.get(i));
            }
        }
}
