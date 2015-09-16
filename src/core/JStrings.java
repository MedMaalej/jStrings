
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
		String reversed = "";
		for (int i = str.length() - 1; i >= 1; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
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
		int vowelsCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U' || str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
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
