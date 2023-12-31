package groomton;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BinarySort {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String[] firstLine=sc.nextLine().split(" ");
		String[] secondLine=sc.nextLine().split(" ");
		//int n=Integer.parseInt(firstLine[0]);
		int k=Integer.parseInt(firstLine[1]);
		ArrayList<Integer> decimal=new ArrayList<Integer>();
		for(String stra : secondLine) {
			decimal.add(Integer.parseInt(stra));
		}
		Collections.sort(decimal, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int o1Count=Integer.bitCount(o1);
				int o2Count=Integer.bitCount(o2);
				int change=(o2Count-o1Count==0)? o2-o1 : o2Count-o1Count;
				return change;
			}
			
		});
		System.out.println(decimal.get(k-1));
		sc.close();
	}
}
