package alibaba;

import java.util.Scanner;

/**
 * @author: wuke
 * @date : 2017��4��26�� ����9:16:30 
 * Title : Pattern 
 * Description : ͨ�� 37% �࣬�߼�����ȫ��
 * ʱ������: 1S(C/C++���������Ϊ: 3 S) 
 * �ڴ�����: 64M (C/C++���������Ϊ: 576 M) 
 * ����: ��һ�У���Ҫ���˵��ַ������ڶ��У�ƥ��ģʽ 
 * ���: ƥ������ƥ��ɹ�����1��ƥ��ʧ�ܷ���0 
 * ���뷶��: 
 * 100-trade-done 
 * 1*trade*done
 * �������: 
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
					&& (strs[pointer1 + 1] == patterns[pointer2 + 1])) { // ���ﲻȫ��ȷ
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
