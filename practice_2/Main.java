package practice_2;

public class Main {
    public static void main(String[] args) {
        //Инициализировал перменную кар через конструктор и передал марку и год
        Car car = new Car("Mersides", 2020);
        //Вызываю метод setYear() у обьекта кар и меняю год
        car.setYear(2025);
        //Вызываю метод print()
        car.print();

        Rectangle rectangle = new Rectangle(5, 20);
        rectangle.setWidht(10);
        int S = rectangle.calculateArea();
        System.out.println("Площадь " + S);


        Book book = new Book("Name","name");
        book.setAuthor("Vladimir");
        book.setTitle("Proza O Code");
        book.printInfo();

        BankAccount bank = new BankAccount("Willyam", 400);
        bank.printBalance();
        bank.deposit(300);
        bank.printBalance();
        bank.withdraw(200);
        bank.printBalance();

        Point coordPoint = new Point(20, 30);
        coordPoint.print();
        coordPoint.setX(8);
        coordPoint.print();

        StudentGroup group = new StudentGroup("AnyName", 30);
        group.printInfo();
        group.setStudentCount(29);
        group.printInfo();

        Circle circle = new Circle(3);
        double s = circle.calculateArea(3);
        System.out.println("Первое значение " + s);
        double c = circle.calculateCircumference(8);
        System.out.println("Второе " + c);

        Teacher teacher = new Teacher("Yana","English");
        teacher.printInfo();
        teacher.setName("Willyam");
        teacher.setSubject("Math");
        teacher.printInfo();

        Product product = new Product(200, "Lays");
        product.printInfo();
        product.setPrice(100);
        product.applyDiscount(50);
        product.printInfo();

        Laptop laptop = new Laptop();
        laptop.setPrice(1000);
        laptop.printInfo();
    }

}
