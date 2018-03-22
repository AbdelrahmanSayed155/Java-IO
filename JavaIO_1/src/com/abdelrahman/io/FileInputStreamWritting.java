/**
 * 
 */
package com.abdelrahman.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 20, 2018
 */
public class FileInputStreamWritting {
	public static void main(String[] args) throws IOException {
	  //// for reading 
		FileInputStream inputStream = new FileInputStream("colar.txt");
		int cha;
		String fullWord="";
		while((cha=inputStream.read())!=-1){
			System.out.println(((char)cha));
			fullWord +=((char)cha);
		}
		inputStream.close();
		System.out.println("file have {"+fullWord+"}");
	}
}
