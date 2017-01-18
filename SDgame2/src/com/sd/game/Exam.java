package com.sd.game;

import java.util.Scanner;

public class Exam {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);	
		int res1,res2;
		while (true) {
			SDgame player1 = new SDgame();
			SDgame player2 = new SDgame();	
			System.out.println("1 �÷��̾� �̸��� �Է��ϼ���.");
			player1.name = scanner.nextLine();
			System.out.println("2 �÷��̾� �̸��� �Է��ϼ���.");
			player2.name = scanner.nextLine();
	
			for(int i=0;i<5;i++){
				
			System.out.print("\n"+player1.name + "�� ���ڸ� �Է��ϼ���.");
			player1.input();
			while (true) {
				player1.select = scanner.nextInt();
				if (player1.select < 1 || player1.select > 10) {
					System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
					continue;
				} else
					break;}
			
			System.out.print(player2.name + "�� ���ڸ� �Է��ϼ���.");
			player2.input();
			while (true) {
				player2.select = scanner.nextInt();
				if (player2.select < 1 || player2.select > 10) {
					System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
					continue;
				} else
					break;}
			
			System.out.print("\n"+player1.name + "�� ù ��° �� ���� = " + player1.select + "     ");
			System.out.println(player1.name + "�� ���� �� ����= " + player1.random);

			System.out.print(player2.name + "�� ù ��° �� ���� = " + player2.select + "     ");
			System.out.println(player2.name + "�� ���� �� ����= " + player2.random);

			res1 = player1.solution();
			if (res1 >= 21) {
				System.out.println("\n"+player1.name + "�� 38����!!!!!");
			} else if ( res1>10  )  {
				System.out.println("\n"+player1.name+ "�� " + player1.random + "��");
			} else {
				System.out.println("\n"+player1.name+ "�� " + res1 + "��");
			}
			
			res2 = player2.solution();
			if (res2 >= 21) {
				System.out.println(player2.name + "�� 38����!!!!!");
			} else if ( res2>10) {
				System.out.println(player2.name+ "�� " + player2.random + "��");
			} else {
				System.out.println(player2.name+ "�� " + res2 + "��");
			}
			
			if(res1 > res2)
				System.out.println("************ "+ (i+1) +" ���� " + player1.name + "���� �¸� �ϼ̽��ϴ� ************");
			else if(res1 < res2)
				System.out.println("************ "+ (i+1) +" ���� " + player2.name + "���� �¸� �ϼ̽��ϴ� ************");
			else
				System.out.println("************************** "+ (i+1) +" ���� ���º� �Դϴ�. **************************");
			player1.compare(player2);
			 }// 5�� �ݺ�
		
		
			System.out.println(player1.name+" �� ����  "+ player1.score + " �� �Դϴ�." );
			System.out.println(player2.name+" �� ����  "+ player2.score + " �� �Դϴ�." );
			
			if (player1.score > player2.score)
				System.out.println("************" + player1.name + "�� �����մϴ�. ���� �¸� �ϼ̽��ϴ� ************");
			else if (player1.score < player2.score)
				System.out.println("************" + player2.name + "�� �����մϴ�. ���� �¸� �ϼ̽��ϴ� ************");
			else if (player1.score == player2.score)
				System.out.println("************************** �ƽ��׿�. ���� ���º��Դϴ�. **************************");

			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("������ ���� �Ǿ����ϴ�.");
				break;}
		}//����while
	}//main
}//class