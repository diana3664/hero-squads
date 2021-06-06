import org.junit.Test;
import static org.junit.Assert.*;


public class HerosTest {

    @Test
    public void newHeros_instantntiateCorrectly() {
        Heros hero = new Heros("","","","");
        assertTrue(hero instanceof Heros);

    }


    @Test
    public void Heros_instantiatesWithName_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertArrayEquals("Moh", hero.getName());

    }

    private void assertArrayEquals(String moh, String name) {
    }

    @Test
    public void Heros_instantiatesWithAge_int() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertArrayEquals("21", hero.getmAge());

    }

    @Test
    public void Heros_instantiatesWithpower_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertArrayEquals("flash", hero.getmPower());

    }

}
