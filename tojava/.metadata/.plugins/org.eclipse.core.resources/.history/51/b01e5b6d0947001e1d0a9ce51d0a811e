package groomton;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generator2 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		int[][] map=new int[n][n];
		int maxMrc=0;
		for(int r=0; r<n; r++) {
			String[] rString=sc.nextLine().split(" ");
			for(int c=0; c<n; c++) {
				map[r][c]=Integer.parseInt(rString[c]);
				if(map[r][c]>maxMrc) {
					maxMrc=map[r][c];
				}
			}
		}
		int[] kCount=new int[maxMrc];
		int[] rd= {0,0,1,-1};
		int[] cd= {1,-1,0,0};
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				for(int mrc=0; mrc<maxMrc; mrc++) {
					if(map[r][c]==mrc+1) {
						Queue<int[]> queue=new LinkedList<int[]>();
						int counter=0;
						queue.add(new int[] {r,c});
						while (!queue.isEmpty()) {
							int[] rc= queue.poll();
							int mr=rc[0];
							int mc=rc[1];
							map[mr][mc]=0;
							for(int d=0; d<4; d++) {
								int mrd=rc[0]+rd[d];
								int mcd=rc[1]+cd[d];
								if(map[mrd][mcd]==mrc+1) {
									queue.add(new int[]{mrd,mcd});
								}
							}
							counter++;
						}
						if(counter>=k) {
							kCount[mrc]++;
						}
						
					}
				}
			}
		}
		int kMax=0;
		int generator=0;
		for(int find=kCount.length-1; find>=0; find--) {
			if(kCount[find]>kMax) {
				kMax=kCount[find];
				generator=find-1;
			}
		}
		System.out.println(generator);

	}

}
