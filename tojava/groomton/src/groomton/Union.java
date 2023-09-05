package groomton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] archipelago=new int[n+1];
		int[][] bridgeGrape=new int[n+1][n+1];
		Map<Integer, ArrayList<Integer>> bridge=new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0; i<m; i++) {
			int s=scanner.nextInt();
			int e=scanner.nextInt();
			if(!bridge.containsKey(s)) {
				bridge.put(s, new ArrayList<Integer>());
			}
			bridge.get(s).add(e);
			bridgeGrape[s][e]=1;
		}
		int count=0;
		for (int i=1; i<=n; i++) {
			if(archipelago[i]==0) {
				archipelago[i]=++count;
				Queue<Integer> queue=new LinkedList<Integer>();
				queue.add(i);
				while (!queue.isEmpty()) {
					int sBridge=queue.poll();
					if(bridge.containsKey(sBridge)) {
						for(int eBridge : bridge.get(sBridge)) {
							if(bridgeGrape[eBridge][sBridge]==1&&archipelago[eBridge]==0) {
								archipelago[eBridge]=count;
								queue.add(eBridge);
							}
						}
					}
				}
				
			}
			
		}
		System.out.println(count);
			
	}

}
