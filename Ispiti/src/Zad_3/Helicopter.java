package Zad_3;

public class Helicopter implements Fly{

    private static String direction = "South";
    private static float distance;
    private float flyingSpeed;
    private String name;
    private int id;

    public Helicopter(String name, int id, float flyingSpeed) {
        this.name = name;
        this.id = id;
        this.flyingSpeed = flyingSpeed;
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
        return "Helicopter{" +
                "flyingSpeed=" + flyingSpeed +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
