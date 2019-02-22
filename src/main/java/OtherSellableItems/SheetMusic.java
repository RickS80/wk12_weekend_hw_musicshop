package OtherSellableItems;

public class SheetMusic extends OtherSellableAbstract {

    private String composer;

    public SheetMusic(String type, double itemCost, double salesPrice, String composer) {
        super(type, itemCost, salesPrice);
        this.composer = composer;

    }

    public String getComposer() {
        return composer;
    }

    @Override
    public double calculateMarkUp() {
        return getSalesPrice() - getItemCost();
    }
}
