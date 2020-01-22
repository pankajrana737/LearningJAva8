package com.pakaj.serializable.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Util {
	
	
	public static void serialzeObject(Object obj,String fileName) {
		
		try {
			ObjectOutputStream out= new ObjectOutputStream(
					new FileOutputStream(
							new File(fileName))
					);
			out.writeObject(obj);
			out.close();
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO exception occurred");
			e.printStackTrace();
		}
				
		
	}
	
	 public static Object deserializedObject(String fileName) {
		 Object obj = null;
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(new File(fileName)));
			obj=	in.readObject();
			
		} 
		catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		 
		 
	 }

}
