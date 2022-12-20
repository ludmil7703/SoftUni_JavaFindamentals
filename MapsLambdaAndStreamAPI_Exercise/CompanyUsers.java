import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CompanyUsers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            Map<String, ArrayList<String>> companiesMap=new LinkedHashMap<>();

            String input= scanner.nextLine();

            while (!input.equals("End")){
                String companyName=input.split(" -> ")[0];
                String id=input.split(" -> ")[1];
                if (!companiesMap.containsKey(companyName)){
                    companiesMap.put(companyName,new ArrayList<>());
                    companiesMap.get(companyName).add(id);
                } else {
                    if (!companiesMap.get(companyName).contains(id)){
                        companiesMap.get(companyName).add(id);
                    }
                }

                input=scanner.nextLine();
            }
            for (Map.Entry<String,ArrayList<String>> entry:companiesMap.entrySet()) {
                System.out.println(entry.getKey());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println("-- "+entry.getValue().get(i));
                }
            }
        }
}
