public class Student {
    private String name;
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Course Info: " + course);
    }
}
