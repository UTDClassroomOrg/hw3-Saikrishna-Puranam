import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageTest {
    @Test
    public void testAverageNormalCase() {
        Average avg = new Average();
        assertEquals(2, avg.average(3, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testAverageKGreaterThanLength() {
        Average avg = new Average();
        assertEquals(4, avg.average(6, new int[]{2, 4, 6}));
    }

    @Test
    public void testAverageEmptyList() {
        Average avg = new Average();
        assertEquals(0, avg.average(3, new int[]{}));
    }

    @Test
    public void testAverageKIsZero() {
        Average avg = new Average();
        assertEquals(0, avg.average(0, new int[]{5, 10, 15}));
    }

    @Test
    public void testAverageKIsNegative() {
        Average avg = new Average();
        assertEquals(0, avg.average(-2, new int[]{1, 2, 3}));
    }
}