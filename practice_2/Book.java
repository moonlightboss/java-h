package practice_2;

public class Book {
    String author;
    String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    String getAuthor(){
        return this.author;
    }
    String getTitle(){
        return this.title;
    }

    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Название книги " + title + ", Автор книги " + author);
    }
}
