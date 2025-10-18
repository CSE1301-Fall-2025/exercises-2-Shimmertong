package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class E01Stats {

	/*
	 * Exercise: The below code reads in a series of doubles from a file and prints them.
	 * Modify this code to find the maximum, minimum, average, and count of the values
	 * read in from the file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise
		int count = 0;
		double sum = 0;
		double max = Double.NEGATIVE_INFINITY; // better than 0
        double min = Double.POSITIVE_INFINITY; // better than 1,000,000
		
		
		
		
		while(in.hasNextDouble()) {
		    double number = in.nextDouble();
			System.out.println(number);
			count++;
			sum += in.nextDouble();
			if(number > max){
				max = number;
			}
			if(number < min){
				min = number;
			}


		}
	    double average = sum/count;
		System.out.println("The maximum is " + max + ".");
		System.out.println("The minimum is " + min + ".");
		System.out.println("There are " + count + " numbers in total.");
		System.out.println("Their average is " + average + ".");
		in.close();
	}
	
}
