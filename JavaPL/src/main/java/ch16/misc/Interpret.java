package ch16.misc;

public class Interpret {
	private Object obj;
	
	public void interpret(String input) {
		try {
			Class<?> cls = Class.forName(input);
			obj = cls;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Object getField(String name) {
		try {
			return obj.getClass().getField(name);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void setField(String name, Object type, Object value) {
		try {
			obj.getClass().getField(name).set(type, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
