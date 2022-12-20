import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentAcademy {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            Map<String, ArrayList<Double>> studentMap=new LinkedHashMap<>();

            for (int i = 1; i <= n; i++) {
                String studentName= scanner.nextLine();
                Double grade=Double.parseDouble(scanner.nextLine());
                if (!studentMap.containsKey(studentName)){
                    studentMap.put(studentName,new ArrayList<>());
                    studentMap.get(studentName).add(grade);
                } else {
                    studentMap.get(studentName).add(grade);
                }

            }
            for (Map.Entry<String,ArrayList<Double>> student:studentMap.entrySet()){
                double sum=0;
                for (int i = 0; i < student.getValue().size(); i++) {
                    sum+=student.getValue().get(i);
                }
                double averageGrade=sum/student.getValue().size();
                if(averageGrade>=4.5) {
                    System.out.printf("%s -> %.2f%n", student.getKey(), averageGrade);
                }
            }
        }
}
