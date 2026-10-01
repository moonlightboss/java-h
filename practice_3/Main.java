package practice_3;


public class Main {
    public static void main(String[] args) {
        Company.printCompanyName();
        Company.companyName = "StringCorp";
        Company.printCompanyName();
        Company empl1 = new Company(112, "Ilya");
        Company empl2 = new Company(115, "Dasha");
        System.out.println(empl1.employeeID + " " + empl1.getEmployeeName() + " " + Company.companyName);
        System.out.println(empl2.employeeID + " " + empl2.getEmployeeName());
        Company.companyName = "ShareCorp";
        Company.printCompanyName();
        System.out.println(empl1.employeeID + " " + empl1.getEmployeeName());
        System.out.println(empl2.employeeID + " " + empl2.getEmployeeName());


        double r1 = 5.9;
        double r2 = 9.7;

        System.out.println(MathConstants.calculateCircleArea(r1));
        System.out.println(MathConstants.calculateCircleArea(r2));
        System.out.println(MathConstants.calculateCircumference(r1));
        System.out.println(MathConstants.calculateCircumference(r2));
        System.out.println(MathConstants.calculateExponentialGrowth(5.0,3,60.2));

        University s1 = new University(112, "Valera");
        University s2 = new University(113, "Vasya");
        University s3 = new University(114, "Zheka");

        System.out.println(University.universityName);
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        University.changeUniversityName("NewName");
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();

        GameSettings g1 = new GameSettings(30, 10);
        GameSettings g2 = new GameSettings(30, 5);
        g1.printGameStatus();
        g2.printGameStatus();
        g1.addPlayer();
        g1.printGameStatus();
        g1.addPlayer();
        g1.printGameStatus();
        GameSettings.setMaxPlayers(40);

        g1.printGameStatus();
        g2.printGameStatus();


        Person p1 = new Person("Ivan", "Ivanov", "123-456-7890");
        Person p2 = new Person("Max", "Kyznetcov", "098-765-4321");
        p1.printPersonInfo();
        p2.printPersonInfo();
        p1.setFirstName("Nullek");
        p1.printPersonInfo();
    }
}
