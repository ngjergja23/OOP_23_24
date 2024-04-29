package pckg_polymorph_add;

public class Tiger implements Animal{

    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " is making sound!");

    }

    @Override
    public void runFast() {
        System.out.println(getClass().getSimpleName() + " is running fast!");
    }

    @Override
    public void drinkWater() {
        System.out.println(getClass().getSimpleName() + " is drinking water!");

    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + " is going to sleep!");

    }
    public void catchPray(){
        System.out.println(getClass().getSimpleName() + " is catching a pray!");

    }
}
