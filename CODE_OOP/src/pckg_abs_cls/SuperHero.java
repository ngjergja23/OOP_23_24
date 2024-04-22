package pckg_abs_cls;

public class SuperHero extends Person implements FlyAbility, Strength {

    protected String superheroName;
    protected SuperHero(String name, String sname, String superName) {
        super(name, sname);
        this.superheroName = superName;
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + "supername: " + this.superheroName);
    }

    @Override
    public void haveEnormous(int level) {

    }

    @Override
    public void flyAround() {

    }
}
