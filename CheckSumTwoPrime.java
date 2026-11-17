package Maths;
/*
 Check for Sum of 2 Primes

Given a number n, find if it can be expressed as sum of two prime numbers.

Examples:
Input: n = 34
Output: true 
Explanation: 34 = 3 + 31, and both 3 and 31 are prime numbers.
Input: n = 23
Output: false
Explanation: 23 cannot be expressed as sum of two prime numbers.

Constraints:
1 ≤ n ≤ 10^5

 */
public class CheckSumTwoPrime {
	 public boolean isSumOfTwo(int n) {
	        for (int i = 2; i <= n / 2; i++) {
	            if (isPrime(i) && isPrime(n - i)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean isPrime(int m) {
	        if (m <= 1) return false;
	        for (int i = 2; i * i <= m; i++) {
	            if (m % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
/*
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
If there is more than one solution possible, return the lexicographically smaller solution i.e.
If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then [a, b] < [c, d] 
If a < c OR ( a == c AND b < d ).
NOTE: A solution will always exist. read Goldbach's conjecture

Problem Constraints: 1 <= A <= 2 * 107
Input Format: The first argument is an integer A.
Output Format: Return an array of integers.
Example Input: 4
Example Output: [2, 2]
Example Explanation: 2 + 2 equals 4, which is the lexicographically smaller solution */

/*
public class Solution {
    public int[] primesum(int A) {

        for (int i = 2; i <= A / 2; i++) {

            if (isPrime(i) && isPrime(A - i)) {
                return new int[]{i, A - i};
            }
        }

        return new int[]{};
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
*/
