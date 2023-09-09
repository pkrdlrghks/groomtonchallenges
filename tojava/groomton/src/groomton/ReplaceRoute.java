package groomton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class ReplaceRoute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,M,S,E;
		Map<Integer, List<Integer>> graph=new HashMap<Integer, List<Integer>>();
		String[] firstLine=sc.nextLine().split(" ");
		N=Integer.parseInt(firstLine[0]);
		M=Integer.parseInt(firstLine[1]);
		S=Integer.parseInt(firstLine[2]);
		E=Integer.parseInt(firstLine[3]);
		for(int i=0; i<M; i++) {
			String[] edge = sc.nextLine().split(" ");
			int s=Integer.parseInt(edge[0]);
			int e=Integer.parseInt(edge[1]);
			graph.putIfAbsent(s, new ArrayList<>());
			graph.putIfAbsent(e, new ArrayList<>());
			graph.get(s).add(e);
			graph.get(e).add(s);
		}
		for(int off=1; off<=N; off++) {
			if(off == S || off == E) {
				System.out.println(-1);
			}else {
				int[] visited=new int[N+1];
				Arrays.fill(visited, (int) 1e8);
				Queue<Integer> queue=new LinkedList<Integer>();
				queue.add(S);
				visited[S]=1;
				while (!queue.isEmpty()) {
					int curNode=queue.poll();
					if(graph.containsKey(curNode)) {
						for(int nextNode : graph.get(curNode)) {
							if(nextNode != off) {
								if(visited[nextNode]>visited[curNode]+1) {
									visited[nextNode]=visited[curNode]+1;
									queue.add(nextNode);
								}
								if(nextNode == E) break;
							}
						}
					}
					
					
				}
				System.out.println(visited[E] == (int) 1e8 ? -1:visited[E]);
			}
		}
	}

}
