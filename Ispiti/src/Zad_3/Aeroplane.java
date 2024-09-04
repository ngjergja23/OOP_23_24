package Zad_3;

public class Aeroplane implements Fly{

    private static String direction = "North";
    private static float distance;
    private float flyingSpeed;
    private String name;
    private int id;


    public Aeroplane(String name, int id, float flyingSpeed) {
        this.name = name;
        this.id = id;
        this.flyingSpeed = flyingSpeed;
    }

    public static float getDistance() {
        return distance;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly(float f, String s, float ff) {

    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "flyingSpeed=" + flyingSpeed +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
