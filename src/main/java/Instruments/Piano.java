package Instruments;

public class Piano extends Instrument {

    private String pianoType;

    public Piano(String type, String family, String brand, double sellingPrice, double cost, String pianoType) {
        super(type, family, brand, sellingPrice, cost);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "Tinkle the ivories";
    }

    @Override
    public double calculateMarkUp() {
        return this.getPrice() - this.getCost();
    }
}
