package groomton;

import java.util.Iterator;
import java.util.Scanner;

public class CloudFlag {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String[] firstLine=sc.nextLine().split(" ");
		int n=Integer.parseInt(firstLine[0]);
		int k=Integer.parseInt(firstLine[1]);
		int[][] m=new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] nextLine=sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				m[i][j]=Integer.parseInt(nextLine[j]);
			}
		}
		int counter=0;
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(m[i][j]==0) {
					int flag=0;
					if(j>0) {
						flag+=m[i][j-1];
					}
					if(j<n-1) {
						flag+=m[i][j+1];
					}
					if(i>0) {
						if(j>0) {
							flag+=m[i-1][j-1];
						}
						if(j<n-1) {
							flag+=m[i-1][j+1];
						}
						flag+=m[i-1][j];
					}
					if(i<n-1) {
						flag+=m[i+1][j];
						if(j>0) {
							flag+=m[i+1][j-1];
						}
						if(j<n-1) {
							flag+=m[i+1][j+1];
						}
					}
					if(flag == k) {
						counter++;
					}
				}
				
			}
		}
		System.out.println(counter);
		sc.close();

	}

}
