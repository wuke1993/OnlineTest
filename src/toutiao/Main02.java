package toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月29日 下午3:25:00
 * Title  : Main2
 * Description : 水仙花数
 */
public class Main02 {

	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		List<Integer> arr = new ArrayList<Integer>();
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int temp = 0;
		while(in.hasNext()) {
			m = in.nextInt();
			n = in.nextInt();
			
			for(int i = m; i <= n; i++) {
				a = i % 10;
				b = (i / 10) % 10;
				c = i / 100;
				temp = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
				
				if(temp == i)
					arr.add(i);
			}
			
			if(arr.size() == 0)
				System.out.println("no");
			else {
				for(Integer t : arr)
					System.out.print(t + " ");
				System.out.println();
			}
		}
	}
}
