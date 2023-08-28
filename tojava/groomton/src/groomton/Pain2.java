package groomton;

import java.util.Scanner;

public class Pain2 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int a=sc.nextInt();
		int b=sc.nextInt();
		int countB;
		int countA = 0;
		int remain;
		int minItem;
		for (countB=n/b; countB >= 0; countB--) {
			remain=n-countB*b;
			countA=remain/a;
			if(remain%a == 0) {
				break;
			}
		}
		if(countB*b+countA*a == n) {
			minItem=countB+countA;
		}else {
			minItem=-1;
		}
		System.out.println(minItem);
		sc.close();
		

	}

}
