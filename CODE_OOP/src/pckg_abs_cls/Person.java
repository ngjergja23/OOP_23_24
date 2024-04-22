package pckg_abs_cls;

public abstract class Person {

    protected int id;
    private static int cntID = 100;
    protected String name;
    protected String surname;
    protected Person(String name, String sname){
        this.id = cntID++;
        this.name = name;
        surname = sname; //nece zasjeniti
        System.out.println("constructore: " + this.getClass().getSimpleName());
    }

    public void getInfo(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    protected abstract void getSignature(); //nema body
                                            //moras im osigurati tijelo





}
