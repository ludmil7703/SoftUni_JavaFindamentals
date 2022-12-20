import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class MinerTask {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Map<String,Integer> minerMap=new LinkedHashMap<>();

            String resource= scanner.nextLine();

            while (!resource.equals("stop")){
                int quantity=Integer.parseInt(scanner.nextLine());

                if (!minerMap.containsKey(resource)){
                    minerMap.put(resource,quantity);
                } else {
                    minerMap.put(resource,minerMap.get(resource)+quantity);
                }
                resource= scanner.nextLine();

            }
            minerMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
        }
}
