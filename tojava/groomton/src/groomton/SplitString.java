package groomton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		String s=sc.nextLine();
		String first, second, third;
		ArrayList<String> splits = new ArrayList<String>();
		int maxScore=0;
		
		for (int i = 1 ; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				first=s.substring(0,i);
				second=s.substring(i,j);
				third=s.substring(j);
				if(!splits.contains(first)) {
					splits.add(first);
				}
				if(!splits.contains(second)) {
				splits.add(second);
				}
				if(!splits.contains(third)) {
				splits.add(third);
				}
			}
		}
		Collections.sort(splits);
		
		for (int i = 1 ; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				first=s.substring(0,i);
				second=s.substring(i,j);
				third=s.substring(j);
				int comparison = splits.indexOf(first)+splits.indexOf(second)+splits.indexOf(third)+3;
				if(comparison>maxScore) {
					maxScore=comparison;
				}
			}
		}
		
		System.out.println(maxScore);
		sc.close();
	}

}
