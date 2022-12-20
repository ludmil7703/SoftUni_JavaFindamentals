import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students {

        static   class Student {
            String firstName;
            String lastName;
            String age;
            String city;

            public String getCity() {
                return this.city;
            }

            public String getAge() {
                return this.age;
            }

            public String getFirstName() {
                return this.firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            public Student (String firstName, String lastName, String age, String city){
                this.firstName=firstName;
                this.lastName=lastName;
                this.age=age;
                this.city=city;
            }
        }
        public static  void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            List<Student> students=new ArrayList<>();

            String line= scanner.nextLine();

            while (!line.equals("end")){
                String[] tokens=line.split(" ");

                String firstName=tokens[0];
                String lastName=tokens[1];
                String age=tokens[2];
                String city=tokens[3];

                Student student =new Student(firstName, lastName, age, city);

                students.add(student);
                line= scanner.nextLine();
            }
            String filterCity= scanner.nextLine();

            for (Student student : students) {
                if (student.getCity().equals(filterCity)) {
                    System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),student.getAge());
                }


            }

        }
}
