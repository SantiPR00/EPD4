import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestInteger {

    @Test
    public void testSum() {
        int result = 2 + 3;
        assertEquals(result, 5, "La suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testResta() {
        int result = 5 - 3;
        assertEquals(result, 2, "La resta de 5 y 3 debe ser 2");
    }

    @Test
    public void testMultiplicacion() {
        int result = 2 * 4;
        assertEquals(result, 8, "La multiplicación de 2 y 4 debe ser 8");
    }

    @Test
    public void testDivision() {
        int result = 8 / 2;
        assertEquals(result, 4, "La división de 8 entre 2 debe ser 4");
    }
}
