package OtherProjects.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String[] args) {
		String str = "";
		try {
			File testFile = new File("C:/Users/HIEU.PM184103/Desktop/OOP/Lab05/OtherProjects/src/text.txt");
			Scanner input = new Scanner(testFile);
			StringBuffer strBuffer = new StringBuffer();
			while(input.hasNext()) {
				str = input.next();
				strBuffer.append(str);
			}
			System.out.println(str);
			input.close();
	    } catch (FileNotFoundException e) {
		System.out.println("Error! Can't open this file!!!");
		e.printStackTrace();
	    }
	}
}
