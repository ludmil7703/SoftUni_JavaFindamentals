import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Courses {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            Map<String, ArrayList<String>> courseMap=new LinkedHashMap<>();

            String input= scanner.nextLine();

            while (!input.equals("end")){
                String courseName=input.split(" : ")[0];
                String studentName=input.split(" : ")[1];

                if (!courseMap.containsKey(courseName)){
                    courseMap.put(courseName,new ArrayList<>());
                    courseMap.get(courseName).add(studentName);
                } else {
                    courseMap.get(courseName).add(studentName);
                }
                input= scanner.nextLine();
            }
            for (Map.Entry<String,ArrayList<String>> course:courseMap.entrySet()) {
                System.out.printf("%s: %d%n",course.getKey(),course.getValue().size());
                for (int j = 0; j < course.getValue().size(); j++) {
                    System.out.printf("-- %s%n",course.getValue().get(j));

                }
            }
        }
}
