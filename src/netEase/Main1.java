package netEase;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月25日 下午3:09:30
 * Title  : Main5
 * Description : https://www.nowcoder.com/discuss/22696?type=0&order=0&pos=5&page=2
 *               赶去公司
 */
public class Main1 {

	public static void main(String[] args) {
		int taxiNum = 0;
		int[][] taxiLocation;
		int office_X = 0;
		int office_Y = 0;
		int walkTime = 0;
		int taxiTime = 0;
		
		
		Scanner in = new Scanner(System.in);
		taxiNum = in.nextInt();
		
		taxiLocation = new int[2][taxiNum];
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < taxiNum; j++)
				taxiLocation[i][j] = in.nextInt();
		
		office_X = in.nextInt();
		office_Y = in.nextInt();
		walkTime = in.nextInt();
		taxiTime = in.nextInt();
		
		int walkCost = 0;
		int[] taxiCost = new int[taxiNum];
		
		walkCost = walkTime * (Math.abs(office_X) + Math.abs(office_Y));
		
		for(int i = 0; i < taxiNum; i++) {
			taxiCost[i] += walkTime * (Math.abs(taxiLocation[0][i]) + 
					Math.abs(taxiLocation[1][i]));
			taxiCost[i] += taxiTime * (Math.abs(office_X - taxiLocation[0][i]) + 
					Math.abs(office_Y- taxiLocation[1][i]));
		}
		
		Arrays.sort(taxiCost);
		
		if(walkCost > taxiCost[0])
			System.out.println(taxiCost[0]);
		else
			System.out.println(walkCost);
	}
}
