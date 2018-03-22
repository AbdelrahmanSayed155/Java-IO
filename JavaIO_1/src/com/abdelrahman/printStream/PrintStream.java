/**
 * 
 */
package com.abdelrahman.printStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 21, 2018
 */
public class PrintStream {



	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("abdo.txt");
		java.io.PrintStream printStream = new java.io.PrintStream(fileOutputStream);
	    printStream.println(100000);
	    printStream.print("abdelrahman Sayed");
	    printStream.println("Yami");
		printStream.close();
		fileOutputStream.close();
		System.out.println("Task Complete .....");
		
	}

}
