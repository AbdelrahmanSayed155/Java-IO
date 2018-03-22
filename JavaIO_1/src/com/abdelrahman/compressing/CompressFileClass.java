/**
 * 
 */
package com.abdelrahman.compressing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 21, 2018
 */
public class CompressFileClass {


	public static void main(String[] args) throws IOException {
	
		FileOutputStream fileOutputStream = new FileOutputStream("zipoo.zip");
		FileInputStream fileInputStream = new FileInputStream("zipoo.txt");
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
		// setting elements into zip file
		zipOutputStream.putNextEntry(new ZipEntry("zipoo.txt"));
		byte[] buffer = new byte[1024];
		int lenght;
		while((lenght=fileInputStream.read(buffer))>0){
			zipOutputStream.write(buffer, 0, lenght);
		}
		zipOutputStream.closeEntry();
		zipOutputStream.close();
		fileInputStream.close();
		fileOutputStream.close();
		System.out.println("Task Complete .....");
	}

}
