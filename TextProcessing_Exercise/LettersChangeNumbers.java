import java.util.Scanner;
public class LettersChangeNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String [] codes = input.split("\\s+");

            double totalSum = 0;
            for (String code : codes) {

                double number = getModifiedNumber(code);

                totalSum += number;
            }

            System.out.printf("%.2f", totalSum);
        }

        private static double getModifiedNumber(String code) {

            char firstLetter = code.charAt(0); //'A'
            char secondLetter = code.charAt(code.length() - 1);

            double number = Double.parseDouble(code.replace(firstLetter, ' ')
                    .replace(secondLetter, ' ')
                    .trim());

            if (Character.isUpperCase(firstLetter)) {

                int positionUpperLetter = (int) firstLetter - 64;
                number /= positionUpperLetter;
            } else {

                int positionLowerCase = (int) firstLetter - 96;
                number *= positionLowerCase;
            }


            if (Character.isUpperCase(secondLetter)) {

                int positionUpperLetter = (int) secondLetter - 64;
                number -= positionUpperLetter;
            } else {

                int positionLowerCase = (int) secondLetter - 96;
                number += positionLowerCase;
            }

            return number;
        }
}
