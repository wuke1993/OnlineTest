package alibaba;

import java.util.Scanner;

/**
 * @author: wuke
 * @date : 2017年4月26日 下午9:16:30 
 * Title : Pattern 
 * Description : 通过 37% 多，逻辑不完全对
 * 时间限制: 1S(C/C++以外的语言为: 3 S) 
 * 内存限制: 64M (C/C++以外的语言为: 576 M) 
 * 输入: 第一行，需要过滤的字符串；第二行，匹配模式 
 * 输出: 匹配结果，匹配成功返回1，匹配失败返回0 
 * 输入范例: 
 * 100-trade-done 
 * 1*trade*done
 * 输出范例: 
 * 1
 */
public class PatternMatching {
	public static void main(String[] args) {
		String str = null;
		String pattern = null;

		Scanner scan = new Scanner(System.in);
		str = scan.next();
		pattern = scan.next();

		char[] strs = str.toCharArray();
		char[] patterns = pattern.toCharArray();

		int pointer1 = 0;
		int pointer2 = 0;
		while ((pointer1 < strs.length) && (pointer2 < patterns.length)) {
			if (strs[pointer1] == patterns[pointer2]) {
				pointer1++;
				pointer2++;
			} else if ((strs[pointer1] != patterns[pointer2])
					&& (patterns[pointer2] == '?')) {
				pointer1++;
				pointer2++;
			} else if ((strs[pointer1] != patterns[pointer2])
					&& (patterns[pointer2] == '*')
					&& (strs[pointer1 + 1] != patterns[pointer2 + 1])) {
				pointer1++;
			} else if ((strs[pointer1] != patterns[pointer2])
					&& (patterns[pointer2] == '*')
					&& (strs[pointer1 + 1] == patterns[pointer2 + 1])) { // 这里不全正确
				pointer1++;
				pointer2++;
			} else if ((strs[pointer1] != patterns[pointer2])
					&& (patterns[pointer2] != '*'))
				break;
		}

		if ((pointer1 == strs.length) && (pointer2 == patterns.length))
			System.out.println(0);
		else
			System.out.println(1);
	}
}
