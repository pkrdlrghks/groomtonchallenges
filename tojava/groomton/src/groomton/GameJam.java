package groomton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GameJam {
	public  static class Game{
		public int r;
		public int c;
		public int score=0;
	
		public Game(int r, int c) {
			this.r=--r;
			this.c=--c;
		}
		
		public void game(String[][] jam, int n) {
			int[][] playJam=new int[n][n];
			boolean check=true;
			while(check) {
				String location=jam[r][c];
				System.out.println(location);
				String sCount=location.replaceAll("[^0-9]", "");
				int iCount=Integer.parseInt(sCount);
				String command=location.replaceAll("[0-9]", "");
				for (int j = 0; j < iCount; j++) {
					if(playJam[r][c]==0) {
						playJam[r][c]=1;
						score++;
						if(command.equals("U")) {
							r--;
							if(r<0) {
								r+=n;
							}
						}
						if(command.equals("D")) {
							r++;
							if(r>=n) {
								r=r-n;
							}
						}
						if(command.equals("R")) {
							c++;
							if(c>=n) {
								c=c-n;
							}
						}
						if(command.equals("L")) {
							c--;
							if(c<0) {
								c+=n;
							}
						}
					}else {
						j=iCount;
						check=false;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Game goorm=new Game(sc.nextInt(), sc.nextInt());
		sc.nextLine();
		Game player=new Game(sc.nextInt(), sc.nextInt());
		sc.nextLine();
		String[][] jam=new String[n][n];
		for (int i = 0; i < n; i++) {
			jam[i]=sc.nextLine().split(" ");
		}
		goorm.game(jam, n);
		player.game(jam, n);
		String win=(goorm.score>player.score)? "goorm "+goorm.score : "player "+player.score;
		System.out.println(player.score);
		
	}
		
}


