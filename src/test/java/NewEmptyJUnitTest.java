
import htl.neuabuer.firstmavenproject.Anlage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testJahresAfa() {
        Anlage a = new Anlage(2000.0, 10);
        assertEquals(200.0, a.jahresAfa(), 0.01);
    }

    public void testBuchwert1() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(5);
        assertEquals(100.0, a.getBuchwert(), 0.01);
    }

    public void testBuchwert2() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(12);
        assertEquals(1.0, a.getBuchwert(), 0.01);
    }
}
