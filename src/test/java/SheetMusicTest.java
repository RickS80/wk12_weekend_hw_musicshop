import OtherSellableItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("sheet music", 5, 8, "Mozart");
    }

    @Test
    public void canGetType(){
        assertEquals("sheet music", sheetMusic.getType());
    }

    @Test
    public void canGetitemCost(){
        assertEquals(5, sheetMusic.getItemCost(), 0.1);
    }

    @Test
    public void canGetSalesPrice(){
        assertEquals(8, sheetMusic.getSalesPrice(),0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(3, sheetMusic.calculateMarkUp(),0.1);
    }

    @Test
    public void canGetComposer(){
        assertEquals("Mozart", sheetMusic.getComposer());
    }

}
