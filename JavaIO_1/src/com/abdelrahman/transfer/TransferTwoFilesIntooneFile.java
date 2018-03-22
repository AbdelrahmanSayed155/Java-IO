/**
 * 
 */
package com.abdelrahman.transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 20, 2018
 */
public class TransferTwoFilesIntooneFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		/// to read
		FileInputStream fileInputStream = new FileInputStream("salary.txt");
		FileInputStream fileInputStream2 = new FileInputStream("sal.txt");
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream, fileInputStream2);
	   /// to write 
		FileOutputStream fileOutputStream = new FileOutputStream("sum.txt");
		
		int i;
		while((i=sequenceInputStream.read())!=-1){
			fileOutputStream.write((byte)i);
		}
		sequenceInputStream.close();
		fileInputStream.close();
		fileInputStream2.close();
		fileOutputStream.close();
		System.out.println("Task Complete .....");
		
	}

}
