package ch16.misc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

public class ClassContents {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName(args[0]);
			System.out.println(c);
			printAll(c);
		}catch (ClassNotFoundException e) {
			System.out.println("unknown class: " + args[0]);
		}
	}
	
	private static void printAll(Class<?> c) {
		printMembers(c.getFields());
		printMembers(c.getConstructors());
		printMembers(c.getMethods());
		for (Annotation anno : c.getAnnotations()) {
			System.out.println(anno);
		}
		
	}
	
	private static void printMembers(Member[] mems) {
		for (Member m : mems) {
			if (m.getDeclaringClass() == Object.class)
				continue;
			String decl = m.toString();
			System.out.print(" ");
			System.out.println(strip(decl, "java.lang."));
		}
	}
		
	private static String strip(String orig, String str) {
		return orig.replace(str, "");
	}
}
