package hashtable;


/**
 * Leetcode204: count primes 题目：给定一个数字n，求出小于n的素数的个数。 思路：用The Sieve of
 * Eratosthenes 思路（重要）。
 * 
 * @author qiuyi
 *
 */
public class solution204 {
	public int countPrimes(int n) {
		if (n == 1)
			return 0;
		int result = 0;
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i * i < n; i++) {
			for (int j = i; i * j < n; j++) {
				isPrime[i * j] = true;
			}
		}
		for (int i = 2; i < n; i++) {
			if (!isPrime[i])
				result++;
		}
		return result;
	}
}
