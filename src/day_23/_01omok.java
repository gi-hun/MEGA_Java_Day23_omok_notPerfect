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
			//���� ��
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
			
			//���� ����
			if(win== 1)
			{
				System.out.println("player1�� �¸�!");
			}
			else if(win == 2)
			{
				System.out.println("player2�� �¸�!");
			}
			//player���� �Է�
			if(turn%2 == 0)		//player1�� ��
			{
				System.out.println("player1�� x��ǥ�� �Է��Ͽ���");
				int p1x= sc.nextInt();
				System.out.println("player1�� y��ǥ�� �Է��Ͽ���");
				int p1y= sc.nextInt();
				
				omok[p1y][p1x] = 1;
				idx1_x = p1x;
				idx2_y = p1y;
				turn++;
			}
			else if(turn%2 == 1)		//player2�� ��
			{
				System.out.println("player2�� x��ǥ�� �Է��Ͽ���");
				int p2x= sc.nextInt();
				System.out.println("player2�� y��ǥ�� �Է��Ͽ���");
				int p2y= sc.nextInt();
				
				omok[p2y][p2x] = 2;
				
				turn++;
			}
			
			//������ �̱�� ���� ����
			//1) ���� 5��
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
			
			//2) ���� 5��
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
			//3) �밡�� 5��
			
		}
		
	}
}
