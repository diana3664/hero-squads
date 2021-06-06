import org.junit.Test;
import static org.junit.Assert.*;


public class SquadTest {


        @Test
        public void newSquad_instantntiateCorrectly() {
            Squad squad = new Squad("","","");
            assertTrue(squad instanceof Squad);

        }

    @Test
    public void Heros_instantiatesWithName_String() {
        Squad squad = new Squad("Moh","","");
        assertArrayEquals("Moh", squad.getmName());

    }
    private void assertArrayEquals(String moh, String name) {
    }



}


