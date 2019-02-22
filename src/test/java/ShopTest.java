import Instruments.Guitar;
import OtherSellableItems.Amplifier;
import OtherSellableItems.SheetMusic;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Amplifier amplifier;
    private SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("guitar", "strings", "fender", 500, 300, 5, "electric");
        amplifier = new Amplifier("amplifier", 70, 100, 1000);
        sheetMusic = new SheetMusic("sheet music", 5, 8, "Mozart");
    }

    @Test
    public void shopStartsWithEmptyStock(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddStock(){
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(amplifier);
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(amplifier);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canGetTotalPotentialGrossProfit(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(amplifier);
        shop.addItemToStock(guitar);
        shop.addItemToStock(sheetMusic);
        assertEquals(433, shop.calculateGP(), 0.1);
    }
}
