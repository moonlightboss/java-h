package practice_2;

public class Rectangle {
    int widht;
    int height;

    public Rectangle(int widht, int height){
        this.widht = widht;
        this.height = height;
    }
    int getWidht(){
        return this.widht;
    }
    int getHeight(){
        return this.height;
    }
    void setWidht(int widht){
        this.widht = widht;
    }

    public int calculateArea(){
       return widht * height;
    }
}
