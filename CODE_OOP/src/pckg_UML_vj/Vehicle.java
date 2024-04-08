package pckg_UML_vj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Date dateProduction;
    private int id;
    private static int cnt = 20;
    private static final String DatePattern = "dd.MM.yyyy";

    public Vehicle(){
        this.id = cnt++;
    }
    public Vehicle(String brand){
        this.brand = brand;
        this.id = cnt++;
    }
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.id = cnt++;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateProduction=" + dateProduction +
                ", id=" + id +
                '}';
    }

    public Vehicle(String brand, String model, String date) throws ParseException {
        this(brand, model);
        setDate(date);

    }


    private void setDate (String dateAsText) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DatePattern);
        this.dateProduction = sdf.parse(dateAsText);
    }


    public void info(){
        System.out.println(this);
    }
    public void start(){
        System.out.println(getClass().getSimpleName() + "starting...");
    }
    public void stop(){
        System.out.println(getClass().getSimpleName() + "engine stopped...");
    }


}
