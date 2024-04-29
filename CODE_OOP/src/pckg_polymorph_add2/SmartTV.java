package pckg_polymorph_add2;

public class SmartTV extends TV{
    public SmartTV() {
        System.out.println("Smart TV constructor called for " + getClass().getSimpleName());
    }


    @Override
    public void turnOn() {
        System.out.println("turning on using smart phone");
    }

    @Override
    public void changeProgram() {
        System.out.println("changing programs using smart phone");
    }

    public void connectToInternet(){
        System.out.println(getClass().getSimpleName() + "can establish net connection");
    }


}
