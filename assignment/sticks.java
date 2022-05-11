package Generics;
import java.util.*;
import java.lang.*;
import java.io.*;

class sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-arr[i-1]<=d) {
				cnt++;
				i++;
			}
		}
		System.out.println(cnt);
	}
}

