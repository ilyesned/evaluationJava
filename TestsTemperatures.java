package temperatures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsTemperatures
{
	@Test
	void testGetValue()
	{
		assertEquals(37, new Celsius(37).getValue());
		assertEquals(50, new Farenheit(50).getValue());
	}
	
	@Test
	void testToString()
	{
		assertEquals("10.0 degrés Celsius", new Celsius(10).toString());
		assertEquals("50.0 degrés Kelvin", new Kelvin(50).toString());
		assertEquals("100.0 degrés Farenheit", new Farenheit(100).toString());
	}
	
	@Test
	void testGetCelsius()
	{
		assertEquals(37, new Celsius(37).enCelsius());
		assertEquals(27, new Kelvin(300).enCelsius());
		assertEquals(0, new Farenheit(32).enCelsius());
		assertEquals(-273, new Kelvin(0).enCelsius());
		assertEquals(37.8, new Farenheit(100).enCelsius(), 0.1);
	}
	
	@Test
	void testCompare()
	{
		assertTrue(new Celsius(37).compareTo(new Celsius(38)) < 0);
		assertTrue(new Celsius(37).compareTo(new Celsius(36)) > 0);
		assertEquals(0, new Celsius(37).compareTo(new Celsius(37)));
		assertTrue(new Kelvin(250).compareTo(new Celsius(38)) < 0);
		assertTrue(new Celsius(37).compareTo(new Kelvin(250)) > 0);
		assertEquals(0, new Kelvin(250).compareTo(new Kelvin(250)));
		assertTrue(new Farenheit(100).compareTo(new Kelvin(300)) > 0);
		assertTrue(new Kelvin(300).compareTo(new Farenheit(100)) < 0);
		assertEquals(0, new Farenheit(100).compareTo(new Farenheit(100)));
	}

	@Test
	void testConversions()
	{
		assertEquals(20, new Celsius(new Celsius(20)).getValue());
		assertEquals(373, new Kelvin(new Celsius(100)).getValue());
		assertEquals(100, new Farenheit(new Celsius(37.8)).getValue(), 0.1);
		assertEquals(50, new Farenheit(new Kelvin(283)).getValue(), 0.1);
	}

}
