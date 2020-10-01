
/*
 * Author = Mohamed Maalej
 * Date : 16/09/2015
 */
package core;

import org.xeustechnologies.googleapi.spelling.SpellChecker;
import org.xeustechnologies.googleapi.spelling.SpellCorrection;
import org.xeustechnologies.googleapi.spelling.SpellResponse;

public class JStrings {
	private String str;

	// Constructor
	public JStrings() {
	}

	
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	// The length of a given string
	public int len() {
		return str.length();
	}

	// Reversing a string
	public String rts() {
		return new StringBuilder(str).reverse().toString();
	}

	// Capitalizing a String
	public String capitalize(int i) {
		char capitalized = str.charAt(i);
		if ((int) capitalized >= 97 && (int) capitalized <= 122) {
			return (char) ((int) capitalized) + str.substring(i, str.length() - 1);
		}
		return str;
	}

	// Splitting a string (the same as Java built-in split method)
	public String[] cut(String delimiter) {
		return str.split(delimiter);
	}

	// Printing a string (a dedicated method)
	public void puts() {
		System.out.print(str);
	}

	// Printing a string(on a single line)
	public void putLine() {
		System.out.println(str);
	}

	// Possibility parsing a string to int
	public boolean canParseInt() {
		for (int i = 0; i < str.length(); i++) {
			if (!((int) str.charAt(i) >= 48) || !(((int) str.charAt(i) <= 57))) {
				return false;
			}
		}
		return true;
	}

	// Counting string latin vowels
	public int vowelsCount() {
		String temp = str.toLowerCase();
		int vowelsCounter = 0;
		for(char ch : temp.toCharArray()){
		    if("aeiou".indexOf(ch) != -1){
		        vowelsCounter++;
		    }
		}
		return vowelsCounter;
	}
	/**
	 * The coming improvements
	 */
/*
	// Spell-check a word
	public void spellCheck() {
		SpellChecker checker = new SpellChecker();

		SpellResponse spellResponse = checker.check(str);

		for (SpellCorrection sc : spellResponse.getCorrections())
			System.out.println(sc.getValue());
	}
	
	//Draw a picture of the String
	*/

}
