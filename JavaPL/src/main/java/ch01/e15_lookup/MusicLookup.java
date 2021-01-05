package ch01.e15_lookup;

import java.util.ArrayList;

import ch01.e14_walkman.Music;

class MusicLookup implements BetterLookup {
	ArrayList<Music> list = new ArrayList<Music>();

	public Music find(String title) {
		for (int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if (m.title == title) {
				return m; 
			}
		}
		return null;
	}

	public void add(Object o) {
		Music m = (Music) o;
		list.add(m);
	}

	public void remove(Object o) {
		list.remove((Music) o);
	}
	
	public static void main(String[] args) {
		MusicLookup ml = new MusicLookup();
		ml.add(new Music("It's my life", "Bon Jovi"));
		ml.add(new Music("Always", "Bon Jovi"));
		ml.add(new Music("Livin' on a prayer", "Bon Jovi"));
		System.out.println(ml.find("Livin' on a prayer"));
	}
}
