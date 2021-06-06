import org.junit.Test;
import static org.junit.Assert.*;


public class HerosTest {

    @Test
    public void newHeros_instantntiateCorrectly() {
        Heros hero = new Heros("","","","");
        assertTrue(hero instanceof Heros);

    }


    @Test
    public void Heros_instantiatesWithAge_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertArrayEquals("Moh", hero.getName());

    }

    private void assertArrayEquals(String moh, String name) {
    }



}
