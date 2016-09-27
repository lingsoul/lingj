package com.jian;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class TestEx1 {
	private static final URL URL = null;
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		System.out.println(arr[2]);
		TestEx1 z = new TestEx1();
		z.a1();
		z.b1();
		z.c1();
		z.d1();
		z.x1();
}
	

	void a(int i)throws ArithmeticException  {
		if (i == 0)
			throw new ArithmeticException("被除数为零");
	}

	void b() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int j;
		j = in.read();
		while (j != -1) {
			System.out.println((char) j);
			j = in.read();
		}
	}
	void c()throws EOFException, IOException {
		throw new EOFException("信息输入有误");
			
	} 
	void d() throws MalformedURLException,IOException{
		URL jn = new URL("www.goole.com");
		String h;
		h = jn.getPath();	
	}
	
	void x() throws UnknownHostException, IOException{
		Socket kn = new Socket("null",21);
		InetAddress l ;
       kn.getInetAddress();
		//l = kn.getRemoteSocketAddress();
	    //l.getByName("a");
	}
	
	
	
	
	






	void a1(){
		try {
            a(0);}  catch( ArithmeticException ae){
            	System.out.println("被除数为零");ae.printStackTrace();
            }		
	}
	void b1(){
		try{
			b();} catch (FileNotFoundException e){
				System.out.println(e.getMessage());
			}    catch (IOException e){
				System.out.println(e.getMessage());
			}
	}
	void c1(){
		try{
			c();} catch (EOFException f){
				System.out.println(f.getMessage());
			}    catch (IOException f){
				System.out.println(f.getMessage());
			}
	}
	void d1(){
		try{
			d();} catch (MalformedURLException h){
				System.out.println(h.getMessage());
			}    catch (IOException h){
				System.out.println(h.getMessage());
			}
	}
	
	void x1(){
		try{
			x();} catch (UnknownHostException o){
				System.out.println(o.getMessage());
			}    catch (IOException o){
				System.out.println(o.getMessage());
			}
	}
	
	
	
	
	
	
	}

