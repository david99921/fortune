package com.sd.game;

import java.util.Scanner;

public class Exam {
	public static void main(String args[]){
		while (true) {
		int score[] = new int[2];
		Scanner scanner = new Scanner(System.in);
		
		SDgame player1 =new SDgame();
		SDgame player2 = new SDgame();
		
		System.out.println("1 �÷��̾� �̸��� �Է��ϼ���.");
		player1.name = scanner.nextLine();
		System.out.println("2 �÷��̾� �̸��� �Է��ϼ���.");
		player2.name = scanner.nextLine();
		player1.input();
		player1.solution();
		player2.input();
		player2.solution();	
		player1.compare(player2);
		player2.compare(player1);
		 
		 if (player1.score > player2.score)
				System.out.println("************" +player1.name+"�� �����մϴ�. �¸� �ϼ̽��ϴ� ************");
			else if (player1.score <player2.score)
				System.out.println("************" +player2.name+"�� �����մϴ�. �¸� �ϼ̽��ϴ� ************");
			else if (player1.score == player2.score)
				System.out.println("************ �ƽ��׿�. ���º��Դϴ�. ************");
	
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("������ ���� �Ǿ����ϴ�.");
				break;}
		}
	}

}
