package by.itstep.gulik.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private int[] array;

//    @BeforeClass
//    public static void initGlobal() {
//        System.out.println("@BeforeClass");
//        array = new int[] {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
//    }
//
//    @AfterClass
//    public static void destroyGlobal() {
//        System.out.println("@AfterClass");
//        array = null;
//    }

    @Before
    public void init() {
        System.out.println("Before method");
        array = new int[] {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
    }

    @After
    public void destroy() {
        System.out.println("After method");
        array = null;
    }


    @Test
    public void testBubbleSortAsc() {
        init();
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);

        assertArrayEquals(expected, array);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//            }
//        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortAscWithNull() {
        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortAscWithEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);
    }

    @Test
    public void testBubbleSortDesc() {
        init();
        int[] expected = {7, 6, 5, 5, 4, 4, 3, 3, 2, 1};

        ArraySorter.bubbleSortDesc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortDescWithNull() {
        ArraySorter.bubbleSortDesc(null);
    }

    @Test
    public void testBubbleSortDescWithEmptyObject() {
        ArraySorter.bubbleSortDesc(new int[0]);
    }

    @Test
    public void testSelectedSortAsc() {
        init();
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.selectedSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortAscWithNull() {
        ArraySorter.selectedSortAsc(null);
    }

    @Test
    public void testSelectedSortAscWithEmptyObject() {
        ArraySorter.selectedSortAsc(new int[0]);
    }

    @Test
    public void testSelectedSortDesc() {
        init();
        int[] expected = {7, 6, 5, 5, 4, 4, 3, 3, 2, 1};

        ArraySorter.selectedSortDecs(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortDescWithNull() {
        ArraySorter.selectedSortDecs(null);
    }

    @Test
    public void testSelectedSortDescWithEmptyObject() {
        ArraySorter.selectedSortDecs(new int[0]);

    }
}
