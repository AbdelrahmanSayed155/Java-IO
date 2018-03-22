/**
 * 
 */
package com.abdelrahman.transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 20, 2018
 */
public class TransferMoreTwoFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/// to read
				FileInputStream fileInputStream = new FileInputStream("salary.txt");
				FileInputStream fileInputStream2 = new FileInputStream("sal.txt");
				FileInputStream fileInputStream3 = new FileInputStream("salo.txt");
				Vector<FileInputStream> allfiles = new  Vector<FileInputStream>();
				allfiles.add(fileInputStream);
				allfiles.add(fileInputStream2);
				allfiles.add(fileInputStream3);
				Enumeration enu =  allfiles.elements();
				
				SequenceInputStream sequenceInputStream = new SequenceInputStream(enu);
			   /// to write 
				FileOutputStream fileOutputStream = new FileOutputStream("sumAll.txt");
				
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
