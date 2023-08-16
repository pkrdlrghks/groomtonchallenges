package groomton;

import java.util.Scanner;

public class SumCalculator {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		int sum=0;
		for (int i = 0; i < t; i++) {
			String[] formula= sc.nextLine().split(" ");
			int frontNum=Integer.parseInt(formula[0]);
			int backNum=Integer.parseInt(formula[2]);
			
			switch (formula[1]) {
			case "+":
				sum+=frontNum+backNum;
				break;
			case "-":
				sum+=frontNum-backNum;
				break;
				
			case "*":
				sum+=frontNum*backNum;
				break;
				
			case "/":
				sum+=frontNum/backNum;
				break;

			}
			
		}
		System.out.println(sum);
		
	}

}
