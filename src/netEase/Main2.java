package netEase;

import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月26日 下午2:16:30
 * Title  : Main2
 * Description : https://www.nowcoder.com/discuss/22696?type=0&order=0&pos=5&page=2
 *               调整队形
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String queue = in.next();
		
		char[] arr = queue.toCharArray();
		
		int pointerG = 0;
		int pointerB = 0;
		int stepsG = 0;
		int stepsB = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'G') { // G...GB...B
				stepsG = i - pointerG;
				pointerG++;
			}
			else { // B...BG...G
				stepsB = i - pointerB;
				pointerB++;
			}
		}
		
		System.out.println(Math.min(stepsG, stepsB));
	}

}
