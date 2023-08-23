package groomton;

import java.util.Scanner;

public class Pain {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dandage=1;
		int medicine=7;
		int painkiller=14;
		int minItem=0;
		while (n>0) {
			if(n>=painkiller) {
				minItem+=n/painkiller;
				n%=painkiller;
			}else if (n>=medicine) {
				minItem+=n/medicine;
				n%=medicine;
			}else if (n>=dandage) {
				minItem+=n/dandage;
				n%=dandage;
			}
			minItem++;
		}
		System.out.println(minItem);
		sc.close();
		
	}

}
