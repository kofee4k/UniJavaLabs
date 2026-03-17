package semester2.Lab10_1;

public class Pensioner extends BasePerson {
    public Pensioner(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "is resting";
    }
}
