package huawei;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月24日 下午8:24:08
 * Title  : Main3
 * Description : not finished yet
 */
public class Main3 {
	static int[][] timeTable = {{0, 2, 10, 5, 3, 1000},
		{1000, 0, 12, 1000, 1000, 10},
		{1000, 1000, 0, 1000, 7, 1000},
		{2, 1000, 1000, 0, 2, 1000},
		{4, 1000, 1000, 1, 0, 1000},
		{3, 1000, 1, 1000, 2, 0}
	};
	static int start = 5;
	
	public static void main(String[] args) {
        int end = 0;
        int fog = 0;
        
        Scanner sc = new Scanner(System.in);
        end = sc.nextInt();
        fog = sc.nextInt();
        
        for(int i = 0; i < 6; i++)
        	timeTable[fog-1][i] = 1000;
        
        int cost = 0;
        StringBuilder path = new StringBuilder("5");
        int tempLocation = 0;
        
        while((tempLocation != end) && (cost <1000)) {
        	
        }
	}
}
