package demo_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDemo 
{
	@Test
	void testadd()
	{
		Demo obj = new Demo();
		assertEquals(4, obj.add(2,2));
	}
	
	@Test
	void testadd2() 
	{
		Demo obj = new Demo();
		assertEquals(19, obj.add(8,11));
	}
	
	@Test
	void testsubtract() 
	{
		Demo obj = new Demo();
		assertEquals(10, obj.subtract(80,70));
	}
	
	@Test 
	void testmultiply() 
	{
		Demo obj = new Demo();
		assertEquals(60, obj.multiply(6,10));
	}

}
