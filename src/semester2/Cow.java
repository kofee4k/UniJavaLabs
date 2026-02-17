package semester2;

public class Cow{
    private String name;
    private String gender;
    private int age;

    public Cow(String name, String gender, int age){
        if(name.length() < 3 || name.isBlank()) throw new Error("Invalid name");
        this.name = name;
        if(!gender.equalsIgnoreCase("female")) throw new Error("Invalid gender");
        this.gender = gender;
        if(age < 0) throw new Error("Invalid age");
        this.age = age;
    }

    public int getProductivity(){
        if(this.age > 15) return 10;
        else if(this.age < 2) return 0;
        else return 20;
    }

    public void addAge(){
        this.age += 1;
    }

    public String getInfo(){
        return "Cow " + this.name + " gives " + this.getProductivity() + " liters of milk per day";
    }
}
