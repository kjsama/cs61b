package IntList;

import static org.junit.Assert.*;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(1, 3, 5, 7, 9);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 9 -> 25 -> 49 -> 9", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple3() {
        IntList lst = IntList.of(12, 4, 6, 8, 10);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("12 -> 4 -> 6 -> 8 -> 10", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesMedium() {
        IntList lst = IntList.of(11, 13, 12, 19, 23);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("121 -> 169 -> 12 -> 361 -> 529", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesHard() {
        IntList lst = IntList.of(71, 79, 83, 89, 97);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("5041 -> 6241 -> 6889 -> 7921 -> 9409", lst.toString());
        assertTrue(changed);
    }
}

