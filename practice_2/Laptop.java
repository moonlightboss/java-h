package practice_2;

public class Laptop {
    String brand;
    double price;

    String getBrand(){
        return this.brand;
    }
    double getPrice(){
        return this.price;
    }

    void setBrand(String brand){
        this.brand = brand;
    }
    void setPrice(double price){
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Название бренда ноутбукааа " + brand + " Цена за ноутбук " +price);
    }
}
