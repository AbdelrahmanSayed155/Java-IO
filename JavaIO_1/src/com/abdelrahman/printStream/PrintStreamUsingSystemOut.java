/**
 * 
 */
package com.abdelrahman.printStream;

import java.io.PrintStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 21, 2018
 */
public class PrintStreamUsingSystemOut {


	public static void main(String[] args) {
		PrintStream printStream = new PrintStream(System.out);
		printStream.println("Abdelrahman Sayed");
        printStream.append("A");
        printStream.append("B");
        printStream.append("C");
        ///  CharSequence interface can  set sring stringBuilder or StringBuffer
        CharSequence charss = "   Sayed Basha";
      /// flush must use for conferming for transfer your data  
        printStream.append(charss);
        printStream.flush();
        printStream.close();
	}

}
