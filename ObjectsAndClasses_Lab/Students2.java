import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students2 {
           static   class Student {
            String firstName;
            String lastName;
            String age;
            String city;

            public String getCity() {
                return this.city;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public void setCity(String city) {
                this.city = city;
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

                if (isStudentExisting(students, firstName, lastName)) {
                    Student currentStudent = getStudent(students, firstName, lastName);
                    currentStudent.setFirstName(firstName);
                    currentStudent.setLastName(lastName);
                    currentStudent.setAge(age);
                    currentStudent.setCity(city);

                } else {
                    Student currentStudent = new Student(firstName, lastName, age, city);
                    students.add(currentStudent);
                }

                line= scanner.nextLine();
            }
            String filterCity= scanner.nextLine();

            for (Student student : students) {
                if (student.getCity().equals(filterCity)) {
                    System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),student.getAge());
                }


            }

        }
        public static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
            for (Student item : students) {
                if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                    return true;
                }

            }
            return false;
        }

        public static Student getStudent(List<Student> students, String firstName, String lastName) {
            Student existingStudent = null;

            for (Student item : students) {
                if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                    existingStudent = item;
                }
            }
            return existingStudent;
        }
}
