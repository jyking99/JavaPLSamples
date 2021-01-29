package ch13.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
	public int occurences(String input, char c) {
		int startPos = 0;
		int count = 0;
		while (input.indexOf(c, startPos) != -1) {
			count ++;
			startPos = input.indexOf(c, startPos) + 1;
		}
		
		return count;
	}
	
	public int occurences(String from, String pattern) {
		int startPos = 0;
		int count = 0;
		while (from.indexOf(pattern, startPos) != -1) {
			count ++;
			startPos = from.indexOf(pattern, startPos) + pattern.length();
		}
		
		return count;
	}
	
	public String[] delimitedString(String from, char start, char end) {
		List<String> returnme = new ArrayList<String>();
		
		while (true) {
			int startPos = from.indexOf(start);
			int endPos = from.indexOf(end);
			
			if (startPos == -1) { // start char not found
				break;
			} else if (endPos == -1) { // end char not found
				returnme.add(from.substring(startPos));
				break;
			} else if (startPos > endPos) { // end char occuring before start char
				from = from.substring(startPos);
			} else {
				returnme.add(from.substring(startPos, endPos+1));
				from = from.substring(startPos +1);
			}
		}
		
		return returnme.toArray(new String[0]);
	}
	
//	public List<Object> interpret(String from) {
//		String[] lines = from.split("\\s+");
//		List<Object> returnme = new ArrayList<Object>();
//		
//		for (int i=0; i<lines.length; i+=2) {
//			
//		}
//	}
	
	public String putComma(String input, int interval) {
		StringBuilder sb = new StringBuilder("");
		int count = 0;
		for (int i=input.length()-1; i>=0; i--) {
			sb.insert(0, input.charAt(i));
			count ++;
			if (count == interval && i != 0) {
				sb.insert(0, ',');
				count = 0;
			}
		}
		return sb.toString();
	}
}
