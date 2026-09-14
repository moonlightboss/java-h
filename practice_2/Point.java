package practice_2;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    void setX(int x){
        this.x = x;
    }

    public void print(){
        System.out.println("Координата X = " +x+", Координата Y = " + y);
    }
}
