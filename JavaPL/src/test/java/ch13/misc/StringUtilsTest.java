package ch13.misc;

import static org.junit.Assert.*;

import org.junit.Test;

import ch13.misc.StringUtils;

public class StringUtilsTest {

//	@Test 
	public void test() { // Exercise 13.3
		StringUtils su = new StringUtils();
		
		String[] ans1 = {"<abc>", "<def>"};
		assertArrayEquals(ans1, su.delimitedString("<abc><def>", '<', '>'));
		
		String[] ans2 = {"<a<bc>", "<bc>", "<def>"};
		assertArrayEquals(ans2, su.delimitedString("<a<bc><def>", '<', '>'));
	}
	
//	@Test
	public void charOccTest() {
		StringUtils su = new StringUtils();
		
		assertEquals(4, su.occurences("acbccc", 'c'));
		assertEquals(2, su.occurences("acbcbc", 'b'));
		assertEquals(3, su.occurences("acbcaa", 'a'));
	}
	
//	@Test
	public void strOccTest() {
		StringUtils su = new StringUtils();
		
		assertEquals(1, su.occurences("acbccc", "cc"));
		assertEquals(2, su.occurences("acbcbc", "bc"));
		assertEquals(3, su.occurences("cacaca", "ca"));
	}
	
//	@Test
	public void commaTest() {
		StringUtils su = new StringUtils();
		
		assertEquals("123,456,789", su.putComma("123456789", 3));
		assertEquals("3,456,789", su.putComma("3456789", 3));
		assertEquals("1,2,3,4,5,6,7,8,9", su.putComma("123456789", 1));
	}
}
