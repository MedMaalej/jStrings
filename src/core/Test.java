/*
 * Author = Mohamed Maalej
 * Date : 16/09/2015
 */
package core;

public class Test {
	public static void main(String[] args) {
		JStrings strLib = new JStrings();
	    String myDemoString = new String ("Hello JStrings");	
	    strLib.setStr(myDemoString);
	    strLib.putLine();
	    System.out.println(strLib.canParseInt());
	    if(strLib.canParseInt())
	    {
	    	int i = Integer.parseInt(strLib.getStr());
	    }
	   
	}
}
