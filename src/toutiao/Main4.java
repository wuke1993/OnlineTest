package toutiao;

import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月30日 下午7:49:36
 * Title  : Main5
 * Description : 所有测试数据正确率为 30%
 */
public class Main4 {

	public static void main(String[] args) {
		int n = 0;
		int q = 0;
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		q = in.nextInt();
		
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		
		for(int i = 0; i < n; i++)
			arrA[i] = in.nextInt();
		for(int i = 0; i < n; i++)
			arrB[i] = in.nextInt();
		
		int[][] arr = new int[q][2];
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < 2; j++)
				arr[i][j] = in.nextInt();
		}
		
		for(int i = 0; i < q; i++)
			System.out.println(count(arrA, arrB, arr[i]));
		
	}
	
	static int count(int[] arrA, int[] arrB, int[] arr) {
		int num = 0;
		
		for(int i = 0; i < arrA.length; i++)
			if(arrA[i] >= arr[0] && arrB[i] >= arr[1])
				num++;
		
		return num;
	}
}
