package org.howard.edu.hw2;

import java.io.FileNotFoundException;

public interface Driver {

	public static void main(String[] args) throws FileNotFoundException
	  {
		FileReader fr = new FileReader();
		try {
			System.out.println(fr.readToString("main/java/resources/words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
		WordCount wc = new WordCount("words.txt");
	    wc.words_counter();
	}

	  }



