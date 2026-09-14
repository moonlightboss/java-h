package practice_2;

public class Product {
    double price;
    String name;

    public Product(double price, String name){
        this.price = price;
        this.name = name;
    }

    double getPrice(){
        return this.price;
    }
    String getName(){
        return this.name;
    }
    void setPrice(double price){
        this.price = price;
    }
    public void applyDiscount(double discount){
        price = price * (1 - discount / 100);
    }
    public void printInfo(){
        System.out.println("Название товара " + name + " Цена после скидки " + price);
    }
}
