/**
 * 
 */
package com.abdelrahman.compressing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 21, 2018
 */
public class UnZipFileClassMain {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fileInputStream =  new FileInputStream("unzip.zip");
		ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
		ZipEntry zipEntry ;
		zipEntry = zipInputStream.getNextEntry();
		while(zipEntry!=null){
			String fileName = zipEntry.getName();
			File newFile = new File(fileName);
			String dirctory = newFile.getParent();
			if(dirctory ==null){
				if(newFile.isDirectory()){
					break;
				}
			}
			FileOutputStream fileOutputStream = new FileOutputStream(newFile);
			byte[] buffers =  new byte[1024];
			int length;
			while((length=zipInputStream.read(buffers, 0, 1024))>0){
				fileOutputStream.write(buffers);
			}
			fileOutputStream.close();
			fileInputStream.close();
			zipEntry = zipInputStream.getNextEntry();
		}

		System.out.println("Task Done ......");
	}

}
