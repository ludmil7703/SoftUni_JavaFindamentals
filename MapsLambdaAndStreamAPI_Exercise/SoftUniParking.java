import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class SoftUniParking {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Map<String,String> parkingMap=new LinkedHashMap<>();

            int n= Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <n ; i++) {
                String[] input=scanner.nextLine().split(" ");

                switch (input[0]){
                    case "register":
                        String license=input[2];
                        String name=input[1];
                        if (!parkingMap.containsKey(name)){
                            parkingMap.put(name,license);
                            System.out.printf("%s registered %s successfully%n",name,license);
                        } else {
                            System.out.printf("ERROR: already registered with plate number %s%n",license);
                        }

                        break;
                    case "unregister":
                        String nameUnregistered=input[1];
                        if(!parkingMap.containsKey(nameUnregistered)){
                            System.out.printf("ERROR: user %s not found%n",nameUnregistered);
                        } else {
                            parkingMap.remove(nameUnregistered);
                            System.out.printf("%s unregistered successfully%n",nameUnregistered);
                        }
                        break;
                    default:break;
                }
            }
            parkingMap.entrySet().forEach(entry->  System.out.printf("%s => %s%n",entry.getKey(),entry.getValue()));
        }
}
