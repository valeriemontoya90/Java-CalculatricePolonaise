import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalcInterpTest {

    protected CalcInterp myCalcInterp;
    FileReader f;

    @Before
    public void setUp() throws Exception {
        this.myCalcInterp = new CalcInterp();
    }

    @Test
    public void testCalcule_1() throws IOException {
        f = new FileReader("OperationsCalculette01.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 6.642857142857143;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_1bis() throws IOException {
        f = new FileReader("OperationsCalculette01bis.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 6.642857142857143;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_2() throws IOException {
        f = new FileReader("OperationsCalculette02.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 135.0;
        System.out.println("resultatOBTENU: " + resultatObtenu);
        assertEquals(resultatAttendu, resultatObtenu,
                resultatAttendu * 0.000001);
    }

    @Test
    public void testCalcule_3() throws IOException {
        f = new FileReader("OperationsCalculette19.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 34.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_4() throws IOException {
        f = new FileReader("OperationsCalculette20.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 6.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_5() throws IOException {
        f = new FileReader("OperationsCalculette21.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 50.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_6() throws IOException {
        f = new FileReader("OperationsCalculette22.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 4.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_7() throws IOException {
        f = new FileReader("OperationsCalculette23.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 23.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOneDigitPlus() throws IOException {
        f = new FileReader("OperationsCalculette03.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 24.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOneDigitMult() throws IOException {
        f = new FileReader("OperationsCalculette10.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 24.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOneDigitMoins() throws IOException {
        f = new FileReader("OperationsCalculette11.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 24.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOneDigitDiv() throws IOException {
        f = new FileReader("OperationsCalculette12.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 24.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OperandDigit() throws IOException {
        f = new FileReader("OperationsCalculette04.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 78.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OperandDigitbis() throws IOException {
        f = new FileReader("OperationsCalculette24.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 78.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_DigitEnter() throws IOException {
        f = new FileReader("OperationsCalculette17.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 42.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_onlyDigits() throws IOException {
        f = new FileReader("OperationsCalculette06.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 537505737468294.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_ExistsLetters() throws IOException {
        f = new FileReader("OperationsCalculette05.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 6030.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyLetters() throws IOException {
        f = new FileReader("OperationsCalculette08.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOperand01() throws IOException {
        f = new FileReader("OperationsCalculette07.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOperand02() throws IOException {
        f = new FileReader("OperationsCalculette14.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OnlyOperand03() throws IOException {
        f = new FileReader("OperationsCalculette15.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_EmptyFile() throws IOException {
        f = new FileReader("OperationsCalculette09.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_OperandsLetters() throws IOException {
        f = new FileReader("OperationsCalculette16.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 0.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_DigitOperand() throws IOException {
        f = new FileReader("OperationsCalculette18.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 42.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }

    @Test
    public void testCalcule_test() throws IOException {
        f = new FileReader("OperationsCalculette25.txt");
        double resultatObtenu = myCalcInterp.calcule(f);
        double resultatAttendu = 2.0;
        assertTrue(resultatAttendu == resultatObtenu);
    }
}
