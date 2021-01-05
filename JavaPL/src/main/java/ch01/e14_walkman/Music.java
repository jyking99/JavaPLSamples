package ch01.e14_walkman;

public class Music {
	public String title;
	public String artist;
	
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist; 
	}
	
	public String toString() {
		return title + " (" + artist + ")";
	}
}
