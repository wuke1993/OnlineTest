package toutiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月30日 下午8:19:19
 * Title  : Main3
 * Description : 所有测试数据正确率为 90%
 */
public class Main1 {

	public static void main(String[] args) {
		int n = 0;
        Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int flag = 0;
		//int flag2 = 1;
		int start = 0;
		int end = 0;
		int a = arr[start];
		for(int i = 1; i < n; i++) {
			if(a < arr[i] && flag ==0) {
				end = i;
			}
			else if(a < arr[i] && flag == 1) {
				list.add(start);
				list.add(end);
				flag = 0;
				start = i - 1;
			}
			else if(a > arr[i]) {
				end++;
				flag = 1;
			}
			a = arr[i];
		}
		
		if(list.size() != 0) {
			int[] result = new int[list.size()/2];
			for(int i = 0; i < list.size(); i = i+2) {
				result[i /2] = list.get(i + 1) - list.get(i);
			}
			
			int max = result[0];
			int location = 0;
			for(int i = 1; i < result.length; i++) {
				if(result[i] > max) {
					max = result[i];
					location = i;
				}
			}
			
			System.out.println(list.get(2 * location) + " " + list.get(2 * location + 1));
		}
		else
			System.out.println("-1 -1");
	}
}
