package groomton;

import java.util.Scanner;
import java.util.stream.Stream;

public class PerfectBurger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int[] k=new int[n];
		k=Stream.of(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
		int i=1;
		int sum=k[0];
		while (i<k.length) {
			if(k[i-1]>k[i]) {
				break;
			}
			sum+=k[i];
			i++;
		}
		while (i<k.length) {
			if(k[i-1]<k[i]) {
				sum=0;
				break;
			}
			sum+=k[i];
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
