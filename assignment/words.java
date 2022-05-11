package Generics;

import java.util.Iterator;
import java.util.Scanner;

public class words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		bucketize(s,n);
	}

	private static void bucketize(String phrase, int n) {
		// TODO Auto-generated method stub

		StringBuffer sbf = new StringBuffer(phrase);
		sbf.append(" ");
		String res[] = new String[phrase.length()];
		while(sbf.length()!=0) 
			for (int i = sbf.length()-1; i >=0 ; i--) 
				if(sbf.charAt(i)==' ') {
					String s  = sbf.substring(0,i);
					if(s.length()<=n) {
						res[i]=s;
						sbf.delete(0,i+1);
						System.out.println(s);
						break;
					}
				}
	}
}
