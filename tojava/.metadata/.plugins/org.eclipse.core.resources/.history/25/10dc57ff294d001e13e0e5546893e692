package groomton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class NetworkAnalysis {
	static List<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		graph=new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			graph[i]=new ArrayList<Integer>();
		}
		visited=new boolean[n+1];
		for(int i= 0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			graph[a].add(b);
			graph[b].add(a);
		}
		List<Integer> result=new ArrayList<Integer>();
		double desity=0;
		
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				Pair pair=bfs(i);3
				List<Integer> temp=pair.list;
				double tempDesity=pair.value;
				
				if(Math.abs(tempDesity-desity)<1e-8) {
					if(result.size()>temp.size()) {
						result=temp;
						desity=tempDesity;
					}else if (result.size()==temp.size()) {
						if(temp.get(0)<result.get(0)) {
							result=temp;
							desity=tempDesity;
						}
					}
				}else if (tempDesity>desity) {
					result=temp;
					desity=tempDesity;
				}
			}
		}
		for(int node : result) {
			System.out.print(node+" ");
		}
		sc.close();
		

	}
	public static Pair bfs(int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		
		Set<Integer> component=new HashSet<Integer>();
		
		while (!q.isEmpty()) {
			int now=q.poll();
			if(visited[now]) {
				continue;
			}
			visited[now]=true;
			component.add(now);
			for(int to:graph[now]) {
				if(!visited[to]) {
					q.add(to);
				}
			}
		}
		int edge=0;
		for(int i : component) {
			for(int to : graph[i]) {
				if(component.contains(to)) {
					edge++;
				}
			}
		}
		List<Integer> sortedList= new ArrayList<Integer>(component);
		Collections.sort(sortedList);
		return new Pair(sortedList, (double) edge/component.size());
	}
	static class Pair{
		List<Integer> list;
		double value;
		
		public Pair(List<Integer> list, double value) {
			this.list=list;
			this.value=value;
		}
	}

}
