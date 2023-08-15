package groomton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ProjectManagement {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n=Integer.parseInt(input);
		input= br.readLine();
		String[] time=input.split(" ");
		int t=Integer.parseInt(time[0]);
		int m=Integer.parseInt(time[1]);
		for (int i = 0; i < n; i++) {
			input=br.readLine();
			m+=Integer.parseInt(input);
		}
		t=(t+(m)/60)%24;
		m%=60;
		System.out.println(t+" "+m);

	}

}
