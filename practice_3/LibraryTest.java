package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.category = "Детектив";
        System.out.println(lib.category);

        lib.author = "Max";
        System.out.println(lib.author);

        lib.year = 2020;
        System.out.println(lib.year);

        // lib.bookTitle нет доступа
        lib.setBookTitle("Война и мир");
        System.out.println(lib.getBookTitle());
    }
}
