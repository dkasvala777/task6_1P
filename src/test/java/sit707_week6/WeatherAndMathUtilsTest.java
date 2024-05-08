package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValues() {
        // Test weather advice with negative wind speed
        WeatherAndMathUtils.weatherAdvice(-10.0, 0.0);
    }

    @Test
    public void testCancelWeatherAdvice() {
        // Test cancel weather advice for wind speed slightly above maximum threshold
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        // Test warning weather advice for wind speed slightly above concerning threshold
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        // Test all clear weather advice for normal conditions
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 0.0));
    }

    @Test
    public void testHighPrecipitationWeatherAdvice() {
        // Test weather advice for high precipitation only
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(30.0, 6.1));
    }

    @Test
    public void testHighWindSpeedWeatherAdvice() {
        // Test weather advice for high wind speed only
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 0.0));
    }

    @Test
    public void testHighWindAndPrecipitationWeatherAdvice() {
        // Test weather advice for high wind speed and precipitation
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 6.1));
    }

    @Test
    public void testIsEven() {
        // Test even number
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
        // Test odd number
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrime() {
        // Test prime number
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
        // Test non-prime number
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }
    
    @Test
    public void testSumUpToN() {
        // Test sum up to 5
        Assert.assertEquals(15, ConditionalLoops.sumUpToN(5));
        // Test sum up to 10
        Assert.assertEquals(55, ConditionalLoops.sumUpToN(10));
        // Test sum up to 0
        Assert.assertEquals(0, ConditionalLoops.sumUpToN(0));
        // Test sum up to a negative number (should return 0)
        Assert.assertEquals(0, ConditionalLoops.sumUpToN(-5));
        // Test sum up to a large number
        Assert.assertEquals(5050, ConditionalLoops.sumUpToN(100));
    }

    @Test
    public void testContainsNumber() {
        // Test contains number in an array with the target number
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(ConditionalLoops.containsNumber(numbers, 3));
        
        // Test contains number in an array without the target number
        Assert.assertFalse(ConditionalLoops.containsNumber(numbers, 6));
        
        // Test contains number in an empty array
        int[] emptyArray = {};
        Assert.assertFalse(ConditionalLoops.containsNumber(emptyArray, 1));
    }
}
