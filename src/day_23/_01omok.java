package day_23;

import java.util.Scanner;

public class _01omok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] omok = new int[10][10];
		
		int win = 0;
		int idx1_x = 0;		int idx1_y = 0;
		int idx2_x = 0;		int idx2_y = 0;
		int turn = 0;
		
		while(true)
		{	
			//오목 판
			System.out.println("  ====OMOK GAME====  ");
			System.out.print("  ");
			for(int i=0;i<10;i++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
			for(int i=0;i<10;i++)
			{
				System.out.print(i + " ");
				for(int j=0;j<10;j++)
				{
					System.out.print(omok[i][j]+ " ");
				}
				System.out.println();
			}
			
			//승자 구분
			if(win== 1)
			{
				System.out.println("player1의 승리!");
			}
			else if(win == 2)
			{
				System.out.println("player2의 승리!");
			}
			//player들의 입력
			if(turn%2 == 0)		//player1의 턴
			{
				System.out.println("player1의 x좌표를 입력하여라");
				int p1x= sc.nextInt();
				System.out.println("player1의 y좌표를 입력하여라");
				int p1y= sc.nextInt();
				
				omok[p1y][p1x] = 1;
				idx1_x = p1x;
				idx2_y = p1y;
				turn++;
			}
			else if(turn%2 == 1)		//player2의 턴
			{
				System.out.println("player2의 x좌표를 입력하여라");
				int p2x= sc.nextInt();
				System.out.println("player2의 y좌표를 입력하여라");
				int p2y= sc.nextInt();
				
				omok[p2y][p2x] = 2;
				
				turn++;
			}
			
			//오목을 이기기 위한 조건
			//1) 세로 5개
			int count1 = 0;
			int count2 = 0;
			
			for(int i=0; i<10; i++)
			{
				for(int j=5; j<10; j++)
				{
					if(omok[j][i] ==1 &&omok[j][i] == omok[j-4][i] && omok[j-3][i] ==  omok[j-2][i] && omok[j-1][i] ==  omok[j][i])
					{
						count1++;
					}
					else if(omok[j][i] == 2 &&omok[j][i] == omok[j-4][i] && omok[j-3][i] ==  omok[j-2][i] && omok[j-1][i] ==  omok[j][i])
					{
						count2++;
					}
				}
			}
			
			//2) 가로 5개
			for(int i=5; i<10; i++)
			{
				for(int j=0; j<10; j++)
				{
					if(omok[j][i] ==1 && omok[j][i] == omok[j][i-4] && omok[j][i-3] ==  omok[j][i-2] && omok[j][i-1] ==  omok[j][i])
					{
						count1++;
					}
					else if(omok[j][i] == 2 && omok[j][i] == omok[j][i-4] && omok[j][i-3] ==  omok[j][i-2] && omok[j][i-1] ==  omok[j][i])
					{
						count2++;
					}
				}
			}
			
			if(count1 == 5)
			{
				win = 1;
			}
			else if(count1 == 5)
			{
				win = 2;
			}
			//3) 대가석 5개
			
		}
		
	}
}
