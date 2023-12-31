package groomton;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Generator {
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[][] m=new String[n][n];
		for (int r = 0; r < n; r++) {
			m[r] = sc.nextLine().split(" ");
		}
		Line line=new Line(n,m);
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if(line.m[r][c]==1) {
					line.connection(r, c);
					line.count++;
				}
			}
		}
		System.out.println(line.count);
		sc.close();
	}
	public static Queue<int[]> queue=new LinkedList<int[]>();
	public static class Line{
		public int n;
		public int[][] m;
		public int count=0;
		public int[] rd= {0,0,1,-1};
		public int[] cd= {1,-1,0,0};
		
		public Line(int n, String[][] m) {
			this.n=n;
			this.m=new int[n][n];
			for(int r=0; r<n; r++) {
				for(int c=0; c<n; c++) {
					this.m[r][c]=Integer.parseInt(m[r][c]);
				}
			}
		}
		public void connection(int r, int c) {
				int[] point= {r,c};
				queue.add(point);
				m[r][c]=0;
				while (!queue.isEmpty()) {
					int[] poll=queue.poll();
					for (int i = 0; i < 4; i++) {
						int rn=poll[0]+rd[i];
						int cn=poll[1]+cd[i];
						if(rn>=0&rn<n&cn>=0&cn<n) {
							if(m[rn][cn]==1) {
								m[rn][cn]=0;
								queue.add(new int[]{rn,cn});
							}
							
						}
					}
					
				}
		}
					
	}
		
}