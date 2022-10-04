package by.itstep.gulik.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testBubbleSortAsc() {
        int[] array = {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortAscWithNull() {
        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortAscWithEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);
    }
}
