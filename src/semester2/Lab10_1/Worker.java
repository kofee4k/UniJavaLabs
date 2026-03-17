package semester2.Lab10_1;

public class Worker extends BasePerson {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "works";
    }
}
