/**
 * 
 */
package com.abdelrahman.transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 20, 2018
 */
public class TransferImages {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream= new FileInputStream("to.PNG");
		FileOutputStream fileOutputStream =  new FileOutputStream("write.PNG");
		int i;
		while((i=fileInputStream.read())!=-1){
			fileOutputStream.write((byte)i);
		}

		
	}

}
