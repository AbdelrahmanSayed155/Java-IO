/**
 * 
 */
package com.abdelrahman.transferByte;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 21, 2018
 */
public class ByteStreamIO {
	
	public static void main(String []args) throws IOException{
		PipedInputStream pipedInputStream = new PipedInputStream();
		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		pipedOutputStream.connect(pipedInputStream);
		
		Thread thread1 = new Thread(){
			public void run(){
				for(int i=0;i<30;i++){
					try {
						pipedOutputStream.write(i);
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread thread2 = new Thread(){
			public void run(){
				try {
					for(int i=0;i<30;i++){
					System.out.println(pipedInputStream.read());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
	}

}
