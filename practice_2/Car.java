package practice_2;

public class Car {
    //Для хранения данных создал переменные
    String brand;
    int year;
    //Конструктор
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    //Геттер
    String getBrand (){
        return this.brand;
    }

    int getYear() {
        return this.year;
    }
    //Сеттеры
    void setBrand(String brand){
        this.brand = brand;
    }
    void setYear(int year){
        this.year = year;
    }
    //Реализую метод print()
    public void print(){
        System.out.println("Марка автомобиля " + brand + ", " + "Год выпуска " + year);
    }

}
