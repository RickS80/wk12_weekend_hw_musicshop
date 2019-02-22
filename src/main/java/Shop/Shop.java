package Shop;


import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public int getStockCount(){
        return this.stock.size();
    }


    public void addItemToStock(ISell iSellItem){
        this.stock.add(iSellItem);
    }

    public void removeItemFromStock(ISell iSellItem){
        this.stock.remove(iSellItem);
    }

    public double calculateGP(){
        double totalGP = 0;
        for (ISell iSell : this.stock){
            totalGP += iSell.calculateMarkUp();
        }
        return totalGP;
    }



}
