import org.junit.Test;
import static org.junit.Assert.*;


public class SquadTest {


        @Test
        public void newSquad_instantntiateCorrectly() {
            Squad squad = new Squad("","","");
            assertTrue(squad instanceof Squad);

        }
    }


