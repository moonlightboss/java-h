package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String groupName){
        this.groupName = groupName;
    }
    void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }

    public void printInfo(){
        System.out.println("Название группы "+ groupName +", Количество студентов "+ studentCount);
    }
}
