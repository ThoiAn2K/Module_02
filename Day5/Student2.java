public class Student2 {
    public String name;
    public String classes;

    public Student2() {
        this.name = "John";
        this.classes = "C02";
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display() {
        System.out.println("name: " + name + " " + "class: " + classes);
    }
}
