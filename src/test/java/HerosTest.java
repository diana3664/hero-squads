import org.junit.Test;
import static org.junit.Assert.*;


public class HerosTest {

    @Test
    public void newHeros_instantntiateCorrectly() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertTrue(hero instanceof Heros);

    }
}
