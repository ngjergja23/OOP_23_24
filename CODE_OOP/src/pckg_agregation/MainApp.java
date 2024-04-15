package pckg_agregation;

public class MainApp {
    public static void main(String[] args) {
        FleetVehicle vehicles = new FleetVehicle("big");
        Vehicle v1 = new Vehicle("model1");
        Vehicle v2 = new Vehicle("model1");
        Vehicle v3 = new Vehicle("model2");
        vehicles.addNewVehicle(v1);
        vehicles.addNewVehicle(v1);
        vehicles.listAll();

    }
}
