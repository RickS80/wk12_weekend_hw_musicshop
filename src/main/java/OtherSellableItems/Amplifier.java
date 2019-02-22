package OtherSellableItems;

public class Amplifier extends OtherSellableAbstract {

    private int wattage;


    public Amplifier(String type, double itemCost, double salesPrice, int wattage) {
        super(type, itemCost, salesPrice);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    @Override
    public double calculateMarkUp() {
        return getSalesPrice() - getItemCost();
    }
}
