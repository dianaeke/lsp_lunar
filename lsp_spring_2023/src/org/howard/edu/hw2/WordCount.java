/** Uchenna Ekechukwu
**/

package org.howard.edu.hw2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/* wordcount class */
public class WordCount 
	{

	Scanner objt = null;
	  Scanner file = null;
	  
	  ArrayList<String> words = null;
	  ArrayList<Integer> w_count = null;
	  
	  public WordCount(String file_name) throws FileNotFoundException
	  {
	    objt = new Scanner(System.in);
	    file = new Scanner(new File(file_name));
	    words = new ArrayList<String>();
	    w_count = new ArrayList<Integer>();
	  }
	  
	  void counter()
	  {
	    String str;
	    int c = 0;
	    String s = "";
	    
	    while(file.hasNext())
	    {
	      s = "";
	      str = file.next();
	      if (str.length() > 3)
	      {
	        for (int i = 0; i < str.length(); i++)
	        {
	          if (Character.isAlphabetic(str.charAt(i)))
	          {
	            s += str.charAt(i);
	          }
	        }
	        if (!words.contains(s))
	        {
	          words.add(s);
	          w_count.add(1);
	        }
	        else
	        {
	          int indx = words.indexOf(str);
	          w_count.set(indx, w_count.get(indx) + 1);
	        }
	      }
	    }
	    file.close();
	  }
	  
	  /* print out words and count */
	  void print_count()
	  {
	    System.out.println("Word Count: ");
	    for(int i = 0; i < words.size(); i++)
	    {
	      System.out.printf("%6d %-10s\n", w_count.get(i), words.get(i));
	      }
	  }
	  
	  public void words_counter()
	  {
	    counter();
	    print_count();
	  }
	
}
