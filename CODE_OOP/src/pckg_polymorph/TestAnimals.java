package pckg_polymorph;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Tiger tig = new Tiger();
        tig.makeSound();
        RubbberTiger rtig = new RubbberTiger();
        rtig.makeSound();
        //-------------------------------------------
        System.out.println("-------------------------");
        Animal tig2 = new Tiger();                       //ali ne moze Tiger t = new Animal();
        tig2.makeSound();

    }
}
