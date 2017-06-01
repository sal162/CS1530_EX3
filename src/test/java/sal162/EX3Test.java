import org.junit.Test;
import static org.junit.Assert.*;

import sal162.EX3;

public class EX3Test {

    @Test
    public void testTri0() {
		assertEquals(EX3.tri(0), 0);
    }

    @Test
    public void testTri1() {
		assertEquals(EX3.tri(1), 1);
    }

    @Test
    public void testTri4() {
		assertEquals(EX3.tri(4), 10);
    }

    @Test
    public void testLazy0() {
		assertEquals(EX3.lazy(0), 1);
    }

    @Test
    public void testLazy1() {
		assertEquals(EX3.lazy(1), 2);
    }

    @Test
    public void testLazy4() {
		assertEquals(EX3.lazy(4), 11);
    }
}