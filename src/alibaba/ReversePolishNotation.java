package alibaba;
/**
 * @author: wuke 
 * @date  : 2017年4月26日 下午8:42:10
 * Title  : ReversePolishNotation
 * Description : 通过 40%，应该是性能问题
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePolishNotation {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
        char[] arr = expr.toCharArray();
        
        int[] stack = new int[16];
        int result = 0;
        int pointer = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ')
                continue;
            else if(arr[i] == '^') {
                if(pointer < 0)
                    return -1;
                else
                    stack[pointer]++;
            }
            else if(arr[i] == '+') {
                if(pointer < 1)
                    return -1;
                else {
                    stack[pointer-1] += stack[pointer];
                    pointer--;
                }
            }
            else if(arr[i] == '*') {
                if(pointer < 1)
                    return -1;
                else {
                    stack[pointer-1] *= stack[pointer];
                    pointer--;
                }
            }
            else {
                if(pointer == 15)
                    return -2;
                else {
                    pointer++;
                    stack[pointer] = (int) arr[i];
                }
            }
        }
        return stack[0];
    }
}