package sample;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class SampleTest {

//	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void classStringTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// not working
		
		Object obj = Class.forName("java.lang.Boolean").getDeclaredConstructor().newInstance();
//		obj = true;
		System.out.println(obj);
		Boolean b;
	}
}
