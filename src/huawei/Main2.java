package huawei;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月24日 下午7:33:23
 * Title  : Main2
 * Description : 骰子翻转
 */
public class Main2 {
	static int[] arr = {1, 2, 3, 4, 5, 6};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        
        char[] sequence = temp.toCharArray();
        
        for(char c : sequence) {
        	playDice(c);
        }
        
        for(int i : arr)
            System.out.print(i);
	}

	static void playDice(char a) {
        switch(a) {
	        case 'L':
	    	{
	    		int[] temp = arr.clone();
	    		arr[0] = temp[4];
	        	arr[1] = temp[5];
	        	arr[4] = temp[1];
	        	arr[5] = temp[0];
	        	break;
	    	}
	        case 'R':
	    	{
	    		int[] temp = arr.clone();
	    		arr[0] = temp[5];
	        	arr[1] = temp[4];
	        	arr[4] = temp[0];
	        	arr[5] = temp[1];
	        	break;
	    	}
	        case 'F':
	    	{
	    		int[] temp = arr.clone();
	    		arr[2] = temp[4];
	        	arr[3] = temp[5];
	        	arr[4] = temp[3];
	        	arr[5] = temp[2];
	        	break;
	    	}
	        case 'B':
	    	{
	    		int[] temp = arr.clone();
	    		arr[2] = temp[5];
	        	arr[3] = temp[4];
	        	arr[4] = temp[2];
	        	arr[5] = temp[3];
	        	break;
	    	}
	        case 'A':
	    	{
	    		int[] temp = arr.clone();
	    		arr[0] = temp[3];
	        	arr[1] = temp[2];
	        	arr[2] = temp[0];
	        	arr[3] = temp[1];
	        	break;
	    	}
	        case 'C':
	    	{
	    		int[] temp = arr.clone();
	    		arr[0] = temp[2];
	        	arr[1] = temp[3];
	        	arr[2] = temp[1];
	        	arr[3] = temp[0];
	    	}
        }
    }
}
