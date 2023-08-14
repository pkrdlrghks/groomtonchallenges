package groomton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseAddiction {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		double w=Double.parseDouble(input[0]);
		double r=Double.parseDouble(input[1]);
		int rm=(int) (w*(double)(1+r/30));
		System.out.println(rm);

	}

}
