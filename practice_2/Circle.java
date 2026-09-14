package practice_2;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    double getCircle(){
        return this.radius;
    }
    void setSircle(double radius){
        this.radius = radius;
    }

    public double calculateArea(double radius){
        return Math.PI * Math.sqrt(radius);
    }
    public double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
