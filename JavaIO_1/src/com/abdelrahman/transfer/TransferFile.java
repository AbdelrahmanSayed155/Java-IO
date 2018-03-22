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
public class TransferFile {
	
	public static void main(String []args) throws IOException{
		
		FileInputStream fileInputStream = new FileInputStream("salary.txt");
		FileOutputStream fileOutputStream =  new FileOutputStream("copiedSalay.txt");
        int i;
		while((i=fileInputStream.read())!=-1){
			fileOutputStream.write((byte)i);
		}
		
		fileInputStream.close();
		fileOutputStream.close();
		
		System.out.println("Task Done ");
	}

}
