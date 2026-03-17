package semester2.Lab10_1;

public abstract class BasePerson implements Person {
    protected String name;

    public BasePerson(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " " + getEmployment();
    }
}
