/**
 * 
 */
package com.sam.java;

/**
 * @author Sam
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.print(i == 0 ? args[i] : " " + args[i]);
		System.out.println();
	}
}
