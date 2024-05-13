package pckg_exceptions_1;

public class IndustrialRobot extends Robot{

    protected IndustrialRobot(String name) {
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
        return "IndustrialRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
