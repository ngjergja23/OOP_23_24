package pckg_polymorph;

public class RubbberTiger extends Animal{
    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " squeak");
    }
}
