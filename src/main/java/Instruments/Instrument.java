package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String type;
    private String family;
    private String brand;
    private double sellingPrice;
    private double cost;

    public Instrument(String type, String family, String brand, double sellingPrice, double cost){
        this.type = type;
        this.family = family;
        this.brand = brand;
        this.sellingPrice = sellingPrice;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public String getFamily() {
        return family;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return sellingPrice;
    }

    public void setPrice(double price) {
        this.sellingPrice = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
