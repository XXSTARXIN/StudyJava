package demo2;

public class TestStudentBiz2 {
    public static void main(String[] args) {
        StudentBiz studentBiz=new StudentBiz();
        Student student=new Student();
        student.name="孙悟空";
        student.age=1000;
        student.score=99;


        Student student1=new Student();
        student1.name="猪八戒";
        student1.age=700;
        student1.score=88;

        studentBiz.addStus(student);
        studentBiz.addStus(student1);
        studentBiz.showStus();

    }
}
