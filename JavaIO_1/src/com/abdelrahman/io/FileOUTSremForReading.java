/**
 * 
 */
package com.abdelrahman.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 20, 2018
 */
public class FileOUTSremForReading {

	public static void main(String []args) throws IOException{
		/// for writting
		FileOutputStream outputStream = new FileOutputStream("colar.txt");
		String info ="abdelrahamn Sayed Mohamed";
		byte[] infoByte = info.getBytes();
		outputStream.write(infoByte);
		outputStream.close();
		System.out.println("Writing done");
	}
}
