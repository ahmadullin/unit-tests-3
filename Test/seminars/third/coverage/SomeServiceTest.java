package seminars.third.coverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeServiceTest {

    @Test
    public void testFizzBuzz() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertEquals("Fizz", service.fizzBuzz(3));
        Assertions.assertEquals("Buzz", service.fizzBuzz(5));
        Assertions.assertEquals("FizzBuzz", service.fizzBuzz(15));
        Assertions.assertEquals("7", service.fizzBuzz(7));
    }

    @Test
    public void testIsStartOrEndWith6() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertTrue(service.isStartOrEndWith6(new int[]{6, 2, 4}));
        Assertions.assertTrue(service.isStartOrEndWith6(new int[]{2, 4, 6}));
        Assertions.assertFalse(service.isStartOrEndWith6(new int[]{1, 2, 3}));
        Assertions.assertFalse(service.isStartOrEndWith6(new int[]{}));
    }

    @Test
    public void testCalculateDiscount() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertEquals(100.0, service.calculateDiscount(1000.0));
        Assertions.assertEquals(0.0, service.calculateDiscount(500.0));
        Assertions.assertEquals(0.0, service.calculateDiscount(0.0));
    }

    @Test
    public void testSumWithout13() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertEquals(5, service.sumWithout13(1, 2, 3));
        Assertions.assertEquals(2, service.sumWithout13(1, 13, 2));
        Assertions.assertEquals(16, service.sumWithout13(13, 2, 1));
        Assertions.assertEquals(0, service.sumWithout13(13, 13, 13));
    }

    @Test
    public void testIsEven() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertTrue(service.isEven(2));
        Assertions.assertTrue(service.isEven(0));
        Assertions.assertTrue(service.isEven(-4));
        Assertions.assertFalse(service.isEven(1));
        Assertions.assertFalse(service.isEven(-3));
        Assertions.assertFalse(service.isEven(123));
    }

    @Test
    public void testIsInRange() {
        SomeService service = new SomeService();
// Test cases
        Assertions.assertTrue(service.isInRange(26));
        Assertions.assertTrue(service.isInRange(99));
        Assertions.assertTrue(service.isInRange(50));
        Assertions.assertFalse(service.isInRange(25));
        Assertions.assertFalse(service.isInRange(100));
        Assertions.assertFalse(service.isInRange(10));
    }
}