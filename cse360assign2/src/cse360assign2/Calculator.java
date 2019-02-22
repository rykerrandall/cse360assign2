/*Ryker Randall
Class ID #: 531
CSE 360 Assignment 2
*/

package cse360assign2;
/**
 * A file that is made to work as a calculator
 * @author ryker
 *
 */
public class Calculator {

	private int total;
	/**
	 * The main calculator function
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * This function is used to get the total after all computation
	 * @return the total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * This function is to add a value to the total
	 * @param value is the value to add
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * This function is to subtract a value from the total
	 * @param value is the desired number to subtract
	 */
	public void subtract (int value) {
		total = total - value;
	}
	/**
	 * This function is to multiply the total by a number
	 * @param value is the desired multiplier
	 */
	public void multiply (int value) {
		total = total * value;
	}
	/**
	 * This function is to divide the total by a number
	 * @param value is the desired number by which the total will be divided
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	/**
	 * This function is to get the history of computations
	 * @return returns the history that has occured
	 */
	public String getHistory () {
		return "";
	}
}