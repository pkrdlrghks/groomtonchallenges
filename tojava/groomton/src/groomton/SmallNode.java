package groomton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SmallNode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mNum=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		Map<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
		for(int i=0; i<mNum; i++) {
			int s=sc.nextInt();
			int e=sc.nextInt();
			if(!map.containsKey(s)) {
				map.put(s,new ArrayList<Integer>());
			}
			if(!map.containsKey(e)) {
				map.put(e,new ArrayList<Integer>());
			}
			map.get(s).add(e);
			map.get(e).add(s);
		}
		for(int i=1; i<=n; i++) {
			if(map.containsKey(i)) {
				Collections.sort(map.get(i)); 
			}
		}
		boolean[] nodes=new boolean[n];
		for(int i=0; i<n; i++) {
			nodes[i]=false;
		}
		int count=1;
		boolean go=true;
		while (!nodes[k-1]) {
			nodes[k-1]=true;
			if(map.containsKey(k)&map.get(k)!=null) {
				for(int node:map.get(k)) {
					if(nodes[node-1]==false) {
						k=node;
						count++;
						break;
					}
				}
				
			}
		}
		System.out.println(count+" "+k);
	}

}
