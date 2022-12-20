package articles;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String articleData= scanner.nextLine();
        String[] tokens=articleData.split(", ");
        String title= tokens[0];
        String content=tokens[1];
        String author=tokens[2];

        Articles article=new Articles(title,content,author);

        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String command= scanner.nextLine();

            String commandName=command.split("\\: ")[0];
            String newValue=command.split("\\: ")[1];

            switch (commandName){
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.rename(newValue);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
