package toutiao;

import java.util.Scanner;

/**
 * @author: wuke
 * @date : 2017��3��29�� ����3:12:40 
 * Title : Main 
 * Description : ����ǰ n ����ͣ��� n ��Ϊ�� n-1 ���ƽ����
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
			
			System.out.println(String.format("%.2f", result)); // ���� double ��λС��
		}
	}
}
