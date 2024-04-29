package pckg_polymorph_add2;

public class TV extends Device{
    public TV() {
        System.out.println("TV constructor called for " + getClass().getCanonicalName());
    }

    @Override
    public void turnOn() {
        System.out.println("turning on using remote control");
    }

    public void changeProgram(){
        System.out.println("changing programs using remote control");
    }

}
