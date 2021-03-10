package ecolicounts;

import static sbcc.Core.*;

import java.io.*;

import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

/**
 * 
 * Cody Cole
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		final long STARTTIME = System.nanoTime();
		int aCount = 0, cCount = 0, gCount = 0, tCount = 0;
		var StringFile = readFile(readLine());// Vast difference in time when I input the filename instead of user input
		for (int i = 0; i < StringFile.length(); i++) {
			// if (StringFile.charAt(i) == ('A')) {
			// aCount++;
			// } else if (StringFile.charAt(i) == ('C')) {
			// cCount++;
			// } else if (StringFile.charAt(i) == ('G')) {
			// gCount++;
			// } else if (StringFile.charAt(i) == ('T')) {
			// tCount++;
			// }
			switch (StringFile.charAt(i)) {
			case 'A': {
				aCount++;
				break;
			}
			case 'C': {
				cCount++;
				break;
			}
			case 'G': {
				gCount++;
				break;
			}
			case 'T': {
				tCount++;
				break;
			}
			}
		}
		println("#A = " + aCount);
		println("#C = " + cCount);
		println("#G = " + gCount);
		println("#T = " + tCount);
		final long ENDTIME = System.nanoTime();
		// println((ENDTIME - STARTTIME) / 1000000);
	}
}
