package others;

/* Fizz Buzz is a very simple programming task, 
 * asked in software developer job interviews.
 * 
 * Write a program that prints the numbers from 1 to 100 and 
 * for multiples of '3' print "Fizz" instead of the number and 
 * for the multiples of '5' print "Buzz". If a number is 
 * a multiple of both 3 and 5, the output should be "FizzBuzz".
 */

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
