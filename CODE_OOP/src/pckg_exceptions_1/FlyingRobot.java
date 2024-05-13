package pckg_exceptions_1;

public class FlyingRobot extends Robot{

    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    public void charge() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void changeState() {
        System.out.println("changing state for " + this);
    }

    @Override
    public String toString() {
        return "FlyingRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
