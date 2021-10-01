import java.lang.*;

public class book {
    private int size;
    private String author;
    private String name;

    public book(String author, int size){
        this.author=author;
        this.size=size;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Author name: " + this.author);
        System.out.println("The book: "+this.name);
        System.out.println("This book has " + size + " pages");
    }
}
