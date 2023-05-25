package programming17_1;

import java.io.*;
import java.util.Scanner;

public class Programming17_1 {

	public static void main(String[] args) throws IOException {
	
		try (
		      PrintWriter printwriter = new PrintWriter(new File("Exercise17_01.txt"));
		    ) {
		      for (int i = 0; i < 100; i++) {
		        printwriter.print((int)(Math.random() * 1000) + " ");
		        
		     
		      }
		  }
		}
}
	


