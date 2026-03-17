package semester2.Lab10_1;

public class Lab10_1st {
    public static void main(String[] args) {
        Person[] mock = new Person[3];
        mock[0] = new Worker("Petr");
        mock[1] = new Student("Gleb");
        mock[2] = new Pensioner("Ivan Kuzmich");
        for (Person p : mock) {
            System.out.println(p.toString());
        }
    }
}

