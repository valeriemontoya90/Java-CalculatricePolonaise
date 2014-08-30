import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CalculetteTest {

    protected Calculette myCalculator;

    @Before
    public void setUp() throws Exception {
        myCalculator = new Calculette();
    }

    @Test
    public void testAlwaysTrue() {
        assertEquals(2, 2);
    }

    @Test
    public void testEmpile_1() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(0.333);
        myCalculator.empile(0.333);
        assertEquals(answer, myCalculator.Pile);
    }

    @Test
    public void testEmpile_2() {
        // Meme test que le précédent, juste pour illustrer la différence entre
        // @Before et @BeforeClass
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(0.333);
        myCalculator.empile(0.333);
        assertEquals(answer, myCalculator.Pile);
    }

    @Test
    public void testPlus_1() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(6.0);
        myCalculator.empile(4);
        myCalculator.empile(2);
        myCalculator.plus();
        assertEquals(answer, myCalculator.Pile);
    }

    @Test
    public void testMoins_1() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(6.0);
        myCalculator.empile(4);
        myCalculator.empile(2);
        myCalculator.moins();
        assertFalse(answer == myCalculator.Pile);

    }

    @Test
    public void testMoins_2() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(2.0);
        myCalculator.empile(4.0);
        myCalculator.empile(2.0);
        myCalculator.moins();
        assertEquals(answer, myCalculator.Pile);
    }

    @Test
    public void testMult_1() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(6.0);
        myCalculator.empile(4);
        myCalculator.empile(2);
        myCalculator.mult();
        assertFalse(answer == myCalculator.Pile);
    }

    @Test
    public void testDiv_1() {
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(2.5);
        myCalculator.empile(5.0);
        myCalculator.empile(2.0);
        myCalculator.div();
        assertEquals(answer, myCalculator.Pile);
    }

    @Test
    public void testResultat_1() {
        myCalculator.empile(9);
        myCalculator.empile(12);
        assertTrue(12 == myCalculator.resultat());
    }
}