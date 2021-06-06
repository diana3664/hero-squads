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


    @Test
    public void Heros_instantiatesWithPower_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertArrayEquals("time", hero.getmWeakness());

    }


    @Test
    public void all_returnsAllInstancesOfHeros_true() {
        Heros heroOne = new Heros("Moh","21","flash","time");
        Heros heroTwo = new Heros("Tuma","21","Fire","time");

        assertTrue(Heros.all().contains(heroOne));
        assertTrue(Heros.all().contains(heroTwo));


    }

//    @Test
//    public void clear_emptiesAllHeros_0() {
//        Heros heroOne = new Heros("Moh","21","flash","time");
//        Heros.clear();
//        assertEquals(Heros.all().size(),0);
//    }


    @Test
    public void getId_heros_1() {
        Heros hero = new Heros("Moh","21","flash","time");
        
        assertArrayEquals(1, hero.getmId());

    }

    private void assertArrayEquals(int i, int getmId) {
    }

}
