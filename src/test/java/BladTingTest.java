import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.TestCase;

public class BladTingTest
{
    BladTing x = new BladTing("Ting");

    @Test
    public void testingATestTest() {
        assertEquals("Ting", x.getName());
        x.setName("Rawr");
        assertEquals("Rawr", x.getName());
    }

    @Test
    public void testingFactorialNotation() {
        assertEquals(120, x.factorial(5));
    }

    @Test
    public void testingFactorialWithNegativeIntegerExpectedFailureToReturnNegativeOne() {
        assertEquals(-1, x.factorial(-5));
    }

    @Test
    public void testStringAndCountOccurancesOfCharacterA() {

        assertEquals(10, x.returnSpecificCharacterCount("AABBCCAABBCCAABBCCAABBCCAA", 'A'));
    }

    @Test
    public void testingStringToChar() {
        assertEquals("{65}{66}{67}", x.convertStringToASCIICode("ABC"));
    }

    @Test
    public void testingConvertASCIICodeToString() {
        assertEquals('A', x.convertASCIICodeToString(65));
    }

    @Test
    public void testingConvertASCIICodeToString2() {
        int[] gahhhh = new int[] {65,66,67};
        assertEquals("ABC", x.convertASCIICodeToString2(gahhhh));
    }

    @Test
    public void testingThatAnArrayOfCharsCanBeSortedByASCCIICodeAndReturnedAsAString() {

        assertEquals("039DRd", x.sortStringByASCCIICode("D0dR93"));
    }

}