package faang.adobe;

/* Given a non-negative integer num, repeatedly add all 
 * its digits until the result has only one digit.
 * 
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 */

public class AddDigits {
	
	public static void main(String[] args) {
		AddDigits a = new AddDigits();
		
		System.out.println(a.addDigits(38)); // answer is 2
		System.out.println(a.addDigits(100)); // answer is 1
		System.out.println(a.addDigits(338)); // answer is 5
	}
	
	public int addDigits(int num) {
		while(num >= 10) {
			int temp = 0;
			while(num > 0) {
				temp += num % 10;
				num /= 10;
			}
			
			num = temp;
		}
		
		return num;
	}
}
