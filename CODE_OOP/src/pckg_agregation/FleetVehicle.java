package pckg_agregation;

import java.util.ArrayList;

public class FleetVehicle {
    private String company;
    private int compID;
    private static int cntID = 300;

    private final ArrayList<Vehicle> vehicles ; //final ovdje znaci da je referenca jedinstvena


    public FleetVehicle(String company) {
        this.company = company;
        this.compID = cntID++;
        this.vehicles = new ArrayList<Vehicle>();
    }
    public void addNewVehicle(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            System.out.println("Already exists!");
        }else {
            vehicles.add(vehicle);
            System.out.println("Added!");
        }
    }
    public void removeVehicle(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Removed!");
        }else{
            System.out.println("Not in the fleet, cannot remove!");
        }
    }
    public Vehicle getVehicle(int ind){
        Vehicle vehicle = null;
        if (ind < 0 || ind > vehicles.size()){
            System.out.println("Index out of bounds!");
        }else {
            vehicle = vehicles.get(ind);
        }
        return vehicle;
    }
    public Vehicle getVehicle(Vehicle v){
        Vehicle vehicle = null;
        if(vehicles.contains(v)){
            int pos = vehicles.indexOf(vehicle);
            v = vehicles.get(pos);

        }else{
            System.out.println("List does not contain object!");
        }
        return v;
    }

    public void listAll(){
        for (Vehicle v : vehicles){
            System.out.println(v);
        }


    }

}










