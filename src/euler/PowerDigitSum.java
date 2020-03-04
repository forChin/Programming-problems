package euler;

import java.math.BigInteger;

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
        
        System.out.println(sum); 	//answer is 1366
    }
}
