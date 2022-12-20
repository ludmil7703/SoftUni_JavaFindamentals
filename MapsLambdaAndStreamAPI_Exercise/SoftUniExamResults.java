import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class SoftUniExamResults {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Map<String,Integer> softUni=new LinkedHashMap<>();
            ArrayList<String> banList=new ArrayList<>();
            Map<String,Integer> submissionMap=new LinkedHashMap<>();

            String input= scanner.nextLine();

            while (!input.equals("exam finished")){
                String[] command=input.split("-");
                String userName=command[0];
                if (command[1].equals("banned")){

                    banList.add(userName);
                } else {
                    int points = Integer.parseInt(command[2]);
                    String language = command[1];
                    if (!softUni.containsKey(userName)){
                        softUni.put(userName,points);
                    }

                    if(points>softUni.get(userName)){
                        softUni.put(userName, points);
                    }
                    if (!submissionMap.containsKey(language)){
                        submissionMap.put(language,1);
                    } else {
                        submissionMap.replace(language,submissionMap.get(language)+1);
                    }
                }
                input= scanner.nextLine();
            }
            System.out.println("Results:");
            for (Map.Entry<String,Integer> entry:softUni.entrySet()){
                if (!banList.contains(entry.getKey())){
                    System.out.printf("%s | %d%n",entry.getKey(),entry.getValue());
                }

            }
            System.out.println("Submissions:");
            for (Map.Entry<String,Integer> entry:submissionMap.entrySet()){
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
        }
}
