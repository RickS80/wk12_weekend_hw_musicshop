package OtherSellableItems;

import Interfaces.ISell;

public abstract class OtherSellableAbstract implements ISell {

    private String type;
    private double itemCost;
    private double salesPrice;

    public OtherSellableAbstract(String type, double itemCost, double salesPrice) {
        this.type = type;
        this.itemCost = itemCost;
        this.salesPrice = salesPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
}
