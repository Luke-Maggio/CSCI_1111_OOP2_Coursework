package exercise17_14;

import java.io.*;
import java.util.Scanner;

public class Exercise17__14 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter input file name: ");
			String in = input.next();
			System.out.println("Enter output file name: ");
			String out = input.next();
	
		try (
			RandomAccessFile inpt = new RandomAccessFile(in, "rw");
			RandomAccessFile outpt = new RandomAccessFile(out, "rw");
				) {
			inpt.setLength(0);
			outpt.setLength(0);
			inpt.seek(0);
			
			for (int i = 0; i < 100; i++)
				inpt.writeInt(i);
			
			
			int number = 0;
			while((number = inpt.read()) != -1) {
				outpt.write(number + 5);
			}
		}
			catch (IOException e) {
				
			}
		}
	}
