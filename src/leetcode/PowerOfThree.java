package leetcode;

/*Given an integer, write a function to determine if 
 * it is a power of three.
 * 
 * Example 1:
 * Input: 27
 * Output: true
 * 
 * Example 2:
 * Input: 0
 * Output: false
 * 
 * Example 3:
 * Input: 9
 * Output: true
 * 
 * Example 4:
 * Input: 45
 * Output: false
 */

public class PowerOfThree {

	public static void main(String[] args) {
		PowerOfThree s = new PowerOfThree();
		
		
		System.out.println(s.isPowerOfThree(27)); 			//answer is true
		System.out.println(s.isPowerOfThree(129140163));	//answer is true
		System.out.println(s.isPowerOfThree(1));			//answer is true
		System.out.println(s.isPowerOfThree(45));			//answer is false
		System.out.println(s.isPowerOfThree(0));			//answer is false
	}
	
	public boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;
        
        if(n % 3 == 0 && n != 0) {
            return isPowerOfThree(n/3);
        }
        
        return false;
    }
}
