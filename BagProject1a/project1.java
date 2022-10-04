package BagProject1a;
/**
 * Jason Salazar
 *  Data Structures and Algorithms
 * Assignment Bag Project
 * September 5th 2021
 */

public class project1 {

	public static void main (String[]args)
	{
		Bag <String> alphabet = new Bag<String>(); 
		{
			alphabet.add("F"); alphabet.add("T");
			alphabet.add("T"); alphabet.add("U");
			alphabet.add("E"); alphabet.add("V");
			alphabet.add("A"); alphabet.add("E");
			alphabet.add("U"); alphabet.add("F");
			alphabet.add("R"); alphabet.add("U");
			alphabet.add("O"); alphabet.add("I");
			alphabet.add("S"); alphabet.add("K");
			alphabet.add("T"); alphabet.add("R");
			alphabet.add("J"); alphabet.add("E");
		}
	
		// creating a bag for vowels
		
		Bag <String> vowels = new Bag<String>();
		
	
		 
		  // string counter will keep track and count of bag vowels
		
		String countLetters;

	      while (!alphabet.isEmpty())
	     
	      //while loop is going to run until the "letter" bag is empty
	     
	      {
	      
	      countLetters = alphabet.remove();
	      
	      if (countLetters.equals("A")) {vowels.add(countLetters);
	      }
	      else if (countLetters.equals("E")) { vowels.add(countLetters);}
	      else if (countLetters.equals("I")) { vowels.add(countLetters);}
	      else if (countLetters.equals("O")) { vowels.add(countLetters);}
	      else if (countLetters.equals("U")) {vowels.add(countLetters); }
		       } 
		       

		      System.out.println("A was counted " + vowels.getFrequencyOf("A"));
		      System.out.println("O was counted " + vowels.getFrequencyOf("O"));
		      System.out.println("U was counted " + vowels.getFrequencyOf("U"));
		      System.out.println("I was counted " + vowels.getFrequencyOf("I"));
		      System.out.println("E was counted " + vowels.getFrequencyOf("E"));
		      System.out.println("The number of vowels in total were " + vowels.getCurrentSize());
		 
		    }
			
		 
	}

