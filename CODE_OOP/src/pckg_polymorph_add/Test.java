package pckg_polymorph_add;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(new Penguin());
        lista.add(new Tiger());
        lista.add(new Tiger());
        lista.add(new Penguin());

        for (Animal a : lista){
            a.drinkWater();
        }

    }
}
