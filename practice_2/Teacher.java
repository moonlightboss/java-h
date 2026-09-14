package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }

    void setName(String name){
        this.name = name;
    }

    void setSubject(String subject){
        this.subject = subject;
    }

    public void printInfo(){
        System.out.println("Имя преподавателя " + name + ", Предмет который ведёт " + subject);
    }
    
}
