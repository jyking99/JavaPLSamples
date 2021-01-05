package ch01.misc;

import java.io.IOException;

/**
 * ���K���1.16
 */
public class BadDataSetException extends Exception {
	public String datasetName;
	public IOException ioe;
}
