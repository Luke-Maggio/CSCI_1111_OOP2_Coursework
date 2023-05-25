package programming17_7;

import java.io.*;

public class Exercise17_7 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        }
        
        	outputData();
    }
    
        public static void outputData() {
        try (
        	ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
        	) {
        	while (true) {
        		Loan loan1 = (Loan) input.readObject();       
        		Loan loan2 = (Loan) input.readObject();
        		System.out.print("total loan amount: " + loan1.getTotalPayment());
        		System.out.print(" total loan amount: " + loan2.getTotalPayment());
        	}
        }
        catch (EOFException eof) {
        }
        catch (IOException ex) {
            System.out.println(" File could not be opened"); 
        }
        catch (ClassNotFoundException ex) {	
			 
        }
    }
}

