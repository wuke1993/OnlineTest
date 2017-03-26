package tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月25日 下午5:25:14
 * Title  : Main
 * Description : 
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 2; i < 1000; i++) {			
			if(isPrime(i))
				primes.add(i);
		}
		
		int num = 0;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int count = 0;
		int front = 0;
		int tail = primes.size() - 1;
		int sum = 0;

		while(front <= tail) {
			sum = primes.get(front) + primes.get(tail);
			if(sum == num) {
				count++;
				
				front++; // find one result, then remove the two pointers
				tail--;
			}
			else if(sum < num)
				front++;
			else
				tail--;
		}
				
		System.out.println(count);
	}
	
	static boolean isPrime(int i) {
		for(int j = 2; j <= Math.sqrt(i); j++) { // j <= Math.sqrt(i), don't forget '='
			if(i % j ==0)
				return false;
		}
		return true;
	}
}
