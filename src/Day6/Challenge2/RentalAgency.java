package Day6.Challenge2;

import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Vehicule> vehicules = new ArrayList<>();

    public ArrayList<Vehicule> getVehicles() {
        return vehicules;
    }

    public void setVehicles(ArrayList<Vehicule> vehicles) {
        this.vehicules = vehicles;
    }

    public RentalAgency() {
        this.vehicules = new ArrayList<>();
    }
    public void addVehicule(Vehicule vehicule){
        vehicules.add(vehicule);
    }

    public void rentedVehicule(Vehicule vehicule){
        if (!vehicule.isRent()){
            vehicule.setRent(true);
            System.out.println("Vehicle rented: " + vehicule.getMake() + " " + vehicule.getModel());
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    public void displayVehicules(){
        System.out.println("Vehicule in the Agency:");
        for (Vehicule vehicule : vehicules){
            if (!vehicule.isRent()){
                System.out.println("Make: " + vehicule.getMake());
                System.out.println("Model: " + vehicule.getModel());
                System.out.println("Price: " + vehicule.getPrice());
                System.out.println("-----------------------");
            }
        }
    }
}
