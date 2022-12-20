import java.util.Scanner;
public class ExtractFile {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String path= scanner.nextLine();

            String[] file=path.split("\\\\");

            String[] fileArr=file[file.length-1].split("\\.");
            String fileName=fileArr[0];
            String extension=fileArr[1];
            System.out.println("File name: "+fileName);
            System.out.println("File extension: "+extension);
        }
}
