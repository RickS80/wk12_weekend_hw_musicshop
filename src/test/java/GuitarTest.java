import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    private Guitar guitar;

    @Before

    public void before (){
        guitar = new Guitar("guitar", "strings", "fender", 500, 300, 5, "acoustic");
    }

    @Test
    public void canGetType(){
        assertEquals("guitar", guitar.getType());
    }

    @Test
    public void canGetFamily(){
        assertEquals("strings", guitar.getFamily());
    }

    @Test
    public void canGetBrand(){
        assertEquals("fender", guitar.getBrand());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(500, guitar.getPrice(), 0.1);
    }

    @Test
    public void canGetCost(){
        assertEquals(300, guitar.getCost(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(200, guitar.calculateMarkUp(), 0.1);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals("acoustic", guitar.getGuitarType());
    }

    @Test
    public void canPlay(){
        assertEquals("Strum Strum Strum, I'm Jimi Hendrix", guitar.play());
    }
}
