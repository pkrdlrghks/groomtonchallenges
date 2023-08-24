package groomton;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Bomb {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String[][] ground=new String[n][n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] c=sc.nextLine().split(" ");
			for(int j= 0; j<n; j++) {
				ground[i][j]=c[j];
			}
		}
		int[] x=new int[k];
		int[] y=new int[k];
		for (int i = 0; i < k; i++) {
			String[] cr=sc.nextLine().split(" ");
			x[i] = Integer.parseInt(cr[0])-1;
			y[i] = Integer.parseInt(cr[1])-1;
		}
		
		int[] dx= {0, 0, 0, 1, -1};
		int[] dy= {0, 1, -1, 0, 0};
		int[][] bomGround=new int[n][n];
		for (int i = 0; i < k; i++) {
			for (int d = 0; d < 4; d++) {
				int bomX=x[i]+dx[d];
				int bomY=y[i]+dy[d];
				if(bomX>=0&bomX<n&bomY>=0&&bomY<n) {
					if(ground[bomX][bomY].equals("0")) {
						bomGround[bomX][bomY]+=1;
					}else if (ground[bomX][bomY].equals("@")) {
						bomGround[bomX][bomY]+=2;
					}else if (ground[bomX][bomY].equals("#")) {
						
					}
				}
			}
		}
		int max=0;
		for(int i=0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if(bomGround[i][j]>max) {
					max=bomGround[i][j];
				}
			}
		}
		System.out.println(max);
		
		

	}

}
