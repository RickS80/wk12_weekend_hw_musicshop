package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String guitarType;

    public Guitar(String type, String family, String brand, double sellingPrice, double cost, int numberOfStrings, String guitarType) {
        super(type, family, brand, sellingPrice, cost);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    @Override
    public String play() {
        return "Strum Strum Strum, I'm Jimi Hendrix";
    }

    @Override
    public double calculateMarkUp() {
        return this.getPrice() - this.getCost();
    }
}
