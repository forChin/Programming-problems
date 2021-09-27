package euler;

import java.math.BigInteger;

/* 2^15 = 32768 and 
 * the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 */

public class PowerDigitSum {

	public static void main(String args[]) {
        BigInteger two = new BigInteger("2");
        BigInteger a = two.pow(1000);
        String strNum = a.toString();
        
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            char c = strNum.charAt(i);
            sum += (c-'0');
        }
        
        System.out.println(sum); //answer is 1366
    }
}
