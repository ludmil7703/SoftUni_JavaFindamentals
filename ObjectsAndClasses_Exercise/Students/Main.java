package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Students> studentsList=new ArrayList<>();

        int n=Integer.parseInt(scanner.nextLine());

        for (int studentCount = 1; studentCount <=n ; studentCount++) {

            String personalData= scanner.nextLine();

            String firstName=personalData.split(" ")[0];
            String lastName=personalData.split(" ")[1];
            double grade=Double.parseDouble(personalData.split(" ")[2]);

            Students student=new Students(firstName,lastName,grade);

            studentsList.add(student);
        }
        studentsList.sort(Comparator.comparingDouble(Students::getGrade).reversed());

        for(Students student:studentsList){
            System.out.println(student.toString());
        }

    }
}
