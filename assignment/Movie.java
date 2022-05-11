package Generics;

import java.util.Iterator;
import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int arr[][] = new int[2][m];
			for (int j1 = 0; j1 < arr.length; j1++) {
				for (int j2 = 0; j2 < arr[j1].length; j2++) {
					arr[j1][j2]=sc.nextInt();
				}
			}
			int multi[] = new int[m];
			int index[] = new int[m]; 
			int rat[] = new int[m]; 
			for (int k1 = 0; k1 < m; k1++) {
				for (int k2 = k1; k2 <=k1 ; k2++) {
					multi[k1] = arr[0][k1]*arr[1][k2];
					index[k1] = k1;
					rat[k1]=arr[1][k1];
				}
			}
	        sorts(0,m,multi,index,rat);
			int multicnt = 0;
			int ratcnt = 0;
	         for(int z=1;z<m;z++)
	        	 if(multi[0]==multi[z])multicnt++;
	        	 if(multicnt>0) {
	        		 sorts(0,multicnt+1,rat,index,multi);
	        		 for(int z=1;z<m;z++)
	    	        	 if(rat[0]==rat[z])ratcnt++;
	        		 if(ratcnt>0) {
	        			 sorts(0,ratcnt+1,index,multi,rat);
	        			 res[i]=index[ratcnt];
	        		 }
	        		 else {
	        			 res[i]=index[0];
	        		 }
	        	 }
	        	 else {
	        		 res[i]=index[0];
	        	 }
	         }
			for (int i = 0; i < res.length; i++) {
				System.out.println(res[i]+1);
			}
		}
	

	private static void sorts(int temp, int m, int[] multi, int[] index, int[] rat) { 
        for(int r1=0; r1 < m-1; r1++){  
                for(int r2=0; r2 < (m-r1-1); r2++){  
                         if(multi[r2] < multi[r2+1]){    
                                temp = multi[r2];  
                                multi[r2] = multi[r2+1];  
                                multi[r2+1] = temp;
                                
                                temp = rat[r2];
                                rat[r2]= rat[r2+1];
                                rat[r2+1]=temp;
                                
                                temp = index[r2];
                                index[r2]= index[r2+1];
                                index[r2+1]=temp;
                        }   
                }  
        }

	}
}
