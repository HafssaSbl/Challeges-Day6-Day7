package Day6.Challenge2;

public class Vehicule {
    private String make;
    private String model;
    private double price;
    private boolean rent;
    public Vehicule(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.rent=false;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
