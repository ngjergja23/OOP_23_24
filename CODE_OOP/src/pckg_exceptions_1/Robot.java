package pckg_exceptions_1;

public abstract class Robot {
    protected String name;
    protected int id;
    private static int cntID = 10;

    //ako vec koristim konstruktor u abstraktnoj klasi minimalno je da ima protected

    protected Robot(String name){
        this.name = name;
        this.id = cntID;
    }

    public void turnOn(){
        System.out.println("On");
    }
    public void turnOff(){
        System.out.println("Off");
    }

    public abstract void charge();

    public abstract void changeState();





}
