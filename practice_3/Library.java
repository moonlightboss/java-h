package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle(){
        return this.bookTitle;
    }
    protected String getAuthor(){
        return this.author;
    }
    int getYear(){
        return this.year;
    }
    public String getCategory(){
        return this.category;
    }
    void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    protected void setAuthor(String author){
        this.author = author;
    }
    void setYear(int year){
        this.year = year;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
