package pckg_agregation;

public class Vehicle {
    private String model;
    private static int id = 100;
    private String plates;

    public Vehicle(String model) {
        this.id++;
        this.model = model;
    }

    private String getRegPlate(){
        return getClass().getSimpleName() + "@" + id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", plates='" + plates + '\'' +
                '}';
    }
}


