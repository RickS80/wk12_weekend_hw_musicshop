package Instruments;

public class Drums extends Instrument {

    private int numberOfpieces;

    public Drums(String type, String family, String brand, double sellingPrice, double cost, int numberOfpieces) {
        super(type, family, brand, sellingPrice, cost);
        this.numberOfpieces = numberOfpieces;
    }

    public int getNumberOfpieces() {
        return numberOfpieces;
    }

    @Override
    public String play() {
        return "Bash bash bash";
    }

    @Override
    public double calculateMarkUp() {
        return this.getPrice() - this.getCost();
    }
}
