package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
        System.out.println("myObject: " + myObject.toString());
        
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
        
        // Adding this to test query for empty if statement:
		if(filename.length() >= 10 && filename.length() <= 19) {
		} else if(filename.length() >= 20) {
			System.out.println("File name is 20 characters or longer.");
		} else {
			System.out.println("File name is less than 10 characters.");
		}
    }
}