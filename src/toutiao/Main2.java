package toutiao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2017年3月30日 下午7:09:23
 * Title  : Main4
 * Description : 
 */
public class Main2 {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		in.nextLine();
		
		String[] strs1 = new String[n];
		for(int i = 0; i < n; i++) {
			strs1[i] = in.nextLine();
		}
		
		String[] strs2 = new String[m];
		for(int i = 0; i < m; i++) {
			strs2[i] = in.nextLine();
		}		
		
		for(String str : strs2) 
			System.out.println(compare(strs1, str));
	}
	
	static String compare(String[] strs1, String str) {		
		String result = null;
		
		ArrayList<HashSet<String>> sentence = new ArrayList<HashSet<String>>();
		HashSet<String> temp = null;
		String[] arr = null;
		for(String s : strs1) {
			temp = new HashSet<String>();
			
			arr = s.split(" ");
			for(String t : arr) 
				temp.add(t);
			
			sentence.add(temp);
		}
		
		HashSet<String> hs = new HashSet<String>();
		arr = str.split(" ");
		for(String t : arr) 
			hs.add(t);
		
		int localtion = 0;
		int max = 0;
		int count = 0;
		HashSet<String> hashSet = null;
		for(int i = 0; i < sentence.size(); i++) {
			hashSet = sentence.get(i);
			count = 0;
			
			for(String s : hs)
				if(hashSet.contains(s)) 
					count++;
			if(count > max) {
				max = count;
				localtion = i;
			}
		}
		
		result = strs1[localtion];
		
		return result;
	}
}
