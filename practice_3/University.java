package practice_3;

public class University {
    static String universityName = "NameOFUniversity";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    static public void changeUniversityName(String newName){
        universityName = newName;
    }
    String getStudentName(){
        return this.studentName;
    }
    public void printStudentInfo(){
        System.out.println("Имя студента " + studentName + " ID: " + studentID + " Название университета: " + universityName);
    }
}
