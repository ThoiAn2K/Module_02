public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "HOANG");
        Student s2 = new Student(112, "HOA");
        Student s3 = new Student(113, "HA");

        s1.display();
        s2.display();
        s3.display();
    }
}
