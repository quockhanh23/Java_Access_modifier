package Bai5.Staticmethod;

public class Test {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "kuku" );
        Student s2 = new Student(123, "kukuku" );
        Student s3 = new Student(444, "kukukuku" );
        s1.display();
        s2.display();
        s3.display();

    }
}
