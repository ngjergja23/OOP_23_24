package pckg_serial_deserial;

import java.util.ArrayList;
import java.util.List;
public class TestSpaceshipApp {
    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship("Millenium Falcon");
        Spaceship spaceship2 = new Spaceship("Enterprise");
        Spaceship spaceship3 = new Spaceship("ES-100");

//        System.out.println(spaceship1);
        AUX_CLS_SER_DESER.saveObjectToFile("space.bin", spaceship1);

        List<Spaceship> ships = new ArrayList<>();
        ships.add(spaceship1);
        ships.add(spaceship2);
        ships.add(spaceship3);

//        System.out.println(ships);

        AUX_CLS_SER_DESER.saveMultipleObjectsToFile("multiShips.bin",ships);

        Spaceship spaceShipFromFile = AUX_CLS_SER_DESER.readObjectFromFile("space.bin");
        System.out.println(spaceShipFromFile);
        boolean eg = spaceShipFromFile.equals(spaceship1);
        System.out.println(eg);
        ships.clear();
        ships = AUX_CLS_SER_DESER.readObjectsFromFile("multiShips.bin");

    }
}
