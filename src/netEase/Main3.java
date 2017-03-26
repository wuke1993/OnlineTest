package netEase;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月25日 下午2:32:42
 * Title  : Main4
 * Description : https://www.nowcoder.com/discuss/22696?type=0&order=0&pos=5&page=2
 *               魔力手环
 *               测试用例通过 60% 其余超时
 */
public class Main3 {

	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		
		int[] arr_copy = arr.clone();
		
		while((k--) > 0) {
			for(int j = 0; j < (n - 1); j++) {
				arr[j] = arr_copy[j] + arr_copy[j + 1];
				if(arr[j] > 100 || arr[j] == 100)
					arr[j] = arr[j] % 100;
			}
			arr[n - 1] = arr_copy[0] + arr_copy[n - 1];
			if(arr[n - 1] > 100 || arr[n - 1] == 100)
				arr[n - 1] = arr[n - 1] % 100;
			
			arr_copy = arr.clone();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if(i != (n - 1))
				System.out.print(" ");
		}
	}
}
