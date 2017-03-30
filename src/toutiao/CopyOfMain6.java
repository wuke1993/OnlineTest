package toutiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月30日 下午7:49:36
 * Title  : Main5
 * Description : 
 */
public class CopyOfMain6 {

	public static void main(String[] args) {
		int n = 0;
		int q = 0;
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		q = in.nextInt();
		
		ArrayList<Integer> arrA = new ArrayList<Integer>();
		ArrayList<Integer> arrB = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
			arrA.add(in.nextInt());
		for(int i = 0; i < n; i++)
			arrB.add(in.nextInt());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 2 * q; i++)
				arr.add(in.nextInt());

		count(arrA, arrB, arr);
		
	}
	
	static void count(ArrayList<Integer> arrA, ArrayList<Integer> arrB, ArrayList<Integer> arr) {
		int num = 0;
		
		int size = arr.size() / 2;
		for(int j = 0; j < size; j++) {
			num = 0;
			for(int i = 0; i < arrA.size(); i++) {
				if((arrA.get(i) >= arr.get(j * 2)) && (arrB.get(i) >= arr.get(j * 2 + 1)))
					num++;
		    }
			System.out.println(num);
		}
	}
}
