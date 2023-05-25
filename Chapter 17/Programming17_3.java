package programming17_3;

import java.io.*;

public class Programming17_3 {
	public static void main(String[] args) throws IOException {
		int sum = 0;
		try(
			DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
				) {
			
			for (int i = 1; i < 100; i++) {
				output.writeInt((int)(Math.random() * 100));
				}
		try(
			DataInputStream input = new DataInputStream (new FileInputStream("Exercise17_03.dat"));
				) {
			while (true)
				sum += input.readInt();
		}
			catch (EOFException eof) {
			 System.out.println(sum);
		 }	
		}
	}
			
}



