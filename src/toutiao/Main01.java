package toutiao;

import java.util.Scanner;

/**
 * @author: wuke
 * @date : 2017年3月29日 下午3:12:40 
 * Title : Main 
 * Description : 数列前 n 项求和，第 n 项为第 n-1 项的平方根
 */
public class Main01 {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		double temp = 0;
		double result = 0;
		
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			n = in.nextInt();
			m = in.nextInt();
			
			result = n;
			temp = n;
			while (m > 1) {
				temp = Math.sqrt(temp);
				result += temp;
				m -= 1;
			}
			
			System.out.println(String.format("%.2f", result)); // 保留 double 两位小数
		}
	}
}
