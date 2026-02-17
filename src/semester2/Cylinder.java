package semester2;

public class Cylinder{
    private int diameter;
    private int height;
    private int radius;
    public Cylinder(int diameter, int height){
        this.diameter = Math.abs(diameter);
        this.height = Math.abs(height);
        this.radius = diameter/2;
    }


    public int getArea(){
        return (int) Math.round(2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
    }

    public int getVolume(){
        return (int) Math.round(Math.PI * radius * radius * height);
    }

    public boolean isEqualAreas(Cylinder other) {
        return this.getArea() == other.getArea();
    }

    // Сравниваем объемы
    public boolean isEqualVolumes(Cylinder other) {
        return this.getVolume() == other.getVolume();
    }
}

