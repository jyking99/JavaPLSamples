package ch06.misc;

interface Verbose {
	enum Level {SILENT, TERSE, NORMAL, VERBOSE};
	
	void setVerbosity(Level l);
	int getVerbosity();
}
