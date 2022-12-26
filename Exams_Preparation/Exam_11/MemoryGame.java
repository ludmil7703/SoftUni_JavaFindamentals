import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MemoryGame {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<String> numbers= Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            int moves=0;
            boolean isWin=false;

            String command= scanner.nextLine();

            while (!command.equals("end")){
                String[] token=command.split(" ");
                int firstIndex=Integer.parseInt(token[0]);
                int secondIndex=Integer.parseInt(token[1]);
                moves++;
                //proverka da ne sa dva ednakvi indexi
                //proverka indexite da ne sa izvan lista
                if (!isValid(firstIndex,secondIndex,numbers)){
                    String elementToAdd="-"+moves+"a";
                    numbers.add(numbers.size()/2,elementToAdd);
                    numbers.add(numbers.size()/2+1,elementToAdd);
                    System.out.println("Invalid input! Adding additional elements to the board");
                } else {
                    //ako e taka se dobavqt (-number moves)a v sredata na lista
                    //i otpe4atvame "Invalid input! Adding additional elements to the board"

                    //kogato elementite savpadat iztrivat se ot lista
                    //i otpe4atvame "Congrats! You have found matching elements - ${element}!"
                    String element1 = numbers.get(firstIndex);
                    String element2 = numbers.get(secondIndex);
                    if (element1.equals(element2)) {
                        if (firstIndex<secondIndex){
                            numbers.remove(secondIndex);
                            numbers.remove(firstIndex);
                        } else {
                            numbers.remove(firstIndex);
                            numbers.remove(secondIndex);
                        }
                        System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                    } else {
                        System.out.println("Try again!");
                    }

                    //ako sa dva razli4ni elementi otpe4atvame "Try again!"

                    //ako se poznaqt vsi4ki elementi predi "end" otpe4atvame
                    //"You have won in {number of moves until now} turns!"
                    if (numbers.size() == 0) {
                        System.out.printf("You have won in %d turns!%n", moves);
                        isWin=true;
                        break;
                    }

                    //ako se polu4i "end" predi da se poznaqt elementite
                    //"Sorry you lose :( {the current sequence's state}"


                }
                command= scanner.nextLine();
            } if (!isWin) {
                System.out.println("Sorry you lose :(");
                for (int index = 0; index < numbers.size(); index++) {
                    System.out.print(numbers.get(index) + " ");
                }
            }

        }
        public static boolean isValid(int startIndex,int secondIndex,List<String> list){
            boolean isValid=false;
            if (startIndex!=secondIndex&&!(startIndex <0)&&!(startIndex >list.size()-1)
                    && !(secondIndex <0) &&!(secondIndex >list.size()-1)){
                isValid=true;
            }
            return isValid;
        }
}
