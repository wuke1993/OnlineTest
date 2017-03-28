package huawei;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月24日 下午6:58:21
 * Title  : Main
 * Description : reverse two positive integer then add them
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
		
        String s = sc.nextLine();
        
        a = Integer.parseInt(s.split(",")[0]);
        b = Integer.parseInt(s.split(",")[1]);
        
        System.out.println(reverseAdd(a, b));
	}
	
	static int reverseAdd(int a, int b) {
	    if(a < 1 || a > 70000 || b < 1 || b > 70000)
	    	System.out.println("-1");
	    
	    return reverseDigit(a) + reverseDigit(b);	    
	}
	
	static int reverseDigit(int n) {
	    int reverseNum = 0;
	    
	    while(n > 0) {
	        reverseNum = reverseNum * 10 + n % 10;
	        n = n / 10;
	    }
	    
	    return reverseNum;
	}
}
/**
 * Input: 123,876
 * Output: 999
 */