import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListManipulationAdvanced {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            List<Integer> list= (List<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> tempList=new ArrayList<>();

            while (true){
                String line= scanner.nextLine();
                if (line.equals("end")){
                    break;
                }
                String[] token=line.split(" ");


                switch (token[0]){

                    case "Contains":
                        boolean isContain=list.contains(Integer.valueOf(token[1]));
                        if (isContain){
                            System.out.println("Yes");
                        } else {
                            System.out.println("No such number");
                        }
                        break;
                    case "Print":
                        if (token[1].equals("even")){
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(Integer.valueOf(i))%2==0){
                                    tempList.add(list.get(Integer.valueOf(i)));
                                }
                            }
                            System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                            tempList.clear();

                        }
                        if (token[1].equals("odd")){
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(Integer.valueOf(i))%2==1){
                                    tempList.add(list.get(Integer.valueOf(i)));
                                }
                            }
                            System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                            tempList.clear();

                        }
                        break;
                    case "Get":
                        if (token[1].equals("sum")){
                            int sum=0;
                            for (int i=0;i<list.size();i++) {
                                sum+= list.get(Integer.valueOf(i));
                            }
                            System.out.println(sum);

                        }
                        break;
                    case "Filter":
                        int number= Integer.parseInt(token[2]);
                        switch (token[1]){
                            case "<":
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(Integer.valueOf(i))<number){
                                        tempList.add(list.get(i));
                                    }
                                }
                                System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                                tempList.clear();
                                break;
                            case ">":
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(Integer.valueOf(i))>number){
                                        tempList.add(list.get(i));
                                    }
                                }
                                System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                                tempList.clear();
                                break;
                            case ">=":
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(Integer.valueOf(i))>=number){
                                        tempList.add(list.get(i));
                                    }
                                }
                                System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                                tempList.clear();
                                break;
                            case "<=":
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(Integer.valueOf(i))<=number){
                                        tempList.add(list.get(i));
                                    }
                                }
                                System.out.println(tempList.toString().replaceAll("[\\[\\],]",""));
                                tempList.clear();
                                break;
                        }
                }
            }
        }
}
