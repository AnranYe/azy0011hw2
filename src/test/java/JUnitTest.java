import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest {
    @Test
    public void test_MaxValid() {
        int[] array = {2,4,3,5,1,7};
        assertEquals(new Integer(7), Finder.findMax(array));
    }

    @Test
    public void test_MinValid() {
        int[] array = {2,4,3,5,1,7};
        assertEquals(new Integer(1), Finder.findMin(array));
    }

    @Test
    public void test_MaxEmpty() {
        int[] array = {};
        assertEquals(null, Finder.findMax(array));
    }

    @Test
    public void test_MinEmpty() {
        int[] array = {};
        assertEquals(null, Finder.findMin(array));
    }

    @Test
    public void test_MaxNull() {
        int[] array = null;
        assertEquals(null, Finder.findMax(array));
    }

    @Test
    public void test_MinNull() {
        int[] array = null;
        assertEquals(null, Finder.findMin(array));
    }
}

