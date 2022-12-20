package articles;

public class Articles {
    //harakteristiki->poleta
    private  String title;
    private String content;
    private String author;
    //konstruktor->sazdavame obekti
    public Articles(String title, String content,String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
    //funkkcionalnosti->metodi
    public void edit(String newContent){
        this.content=newContent;

    }
    public void changeAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public void rename(String newTitle){
        this.title=newTitle;
    }
    @Override

    public String toString(){
        return this.title+" - "+this.content+": "+this.author;
    }

}
