package com.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;

import com.app.Entities.Item;

public interface IoUtils {
	
	public static void writeDetails(Stream<Item> items, String FileName) throws IOException {
		
		try(
				PrintWriter pw = new PrintWriter(new FileWriter(FileName))
		   )
		{
			items.forEach(s -> pw.println(s));
		}
	}
	
	public static void writeDataSer(List<Item> items, String FileName) throws FileNotFoundException, IOException {
		
		try(
				
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FileName))
		   )
		{
					out.writeObject(items);
		}
	}
	
	public static Object readDataSer(String FileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		try(
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(FileName))
		   )
		{
			return in.readObject();
			
		}
	
		
		
	}
	
	
	
	
	
//	We can use the SerializationUtils class from the Apache Commons Lang library to achieve the same goal.
//
//	This class has a method named serialize(), which is used to serialize an object to a byte array:
//
//	byte[] data = SerializationUtils.serialize(user);
//	Copy
//	And a deserialize() method to deserialize byte array to object:
//
//	User deserializedUser = SerializationUtils.deserialize(data);
//		 try (
//		            InputStream inputStream = new FileInputStream(inputFile);
//		            OutputStream outputStream = new FileOutputStream(outputFile);
//		        ) {
//		            long fileSize = new File(inputFile).length();
//		            byte[] allBytes = new byte[(int) fileSize];
//		 
//		            int bytesRead = inputStream.read(allBytes);
//		 
//		            outputStream.write(allBytes, 0, bytesRead);
//	}
	

}
