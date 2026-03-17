package semester2.Lab10_1;

public class Student extends BasePerson {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "study";
    }
}
