package semester2;

public class Cylinder{
    private int diameter;
    private int height;
    private int radius;
    public Cylinder(int diameter, int height){
        this.diameter = Math.abs(diameter);
        this.height = Math.abs(height);
        this.radius = Math.abs(diameter)/2;
    }


    public int getArea(){
        return (int) Math.round(2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height);
    }

    public int getVolume(){
        return (int) Math.round(Math.PI * Math.pow(radius, 2) * height);
    }

    public boolean isEqualAreas(Cylinder other) {
        return this.getArea() == other.getArea();
    }

    public boolean isEqualVolumes(Cylinder other) {
        return this.getVolume() == other.getVolume();
    }
}

