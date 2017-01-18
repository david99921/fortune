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
			player1.setName(scanner.nextLine());
			System.out.println("2 �÷��̾� �̸��� �Է��ϼ���.");
			player2.setName(scanner.nextLine());
	
			for(int i=0;i<5;i++){
				
			System.out.print("\n"+player1.getName() + "�� ���ڸ� �Է��ϼ���.");
			player1.input();
			while (true) {
				player1.setSelect(scanner.nextInt());
				if (player1.getSelect() < 1 || player1.getSelect() > 10) {
					System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
					continue;
				} else
					break;}
			
			System.out.print(player2.getName() + "�� ���ڸ� �Է��ϼ���.");
			player2.input();
			while (true) {
				player2.setSelect(scanner.nextInt());
				if (player2.getSelect() < 1 || player2.getSelect() > 10) {
					System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
					continue;
				} else
					break;}
			
			System.out.print("\n"+player1.getName() + "�� ù ��° �� ���� = " + player1.getSelect() + "     ");
			System.out.println(player1.getName() + "�� ���� �� ����= " + player1.getRandom());

			System.out.print(player2.getName() + "�� ù ��° �� ���� = " + player2.getSelect() + "     ");
			System.out.println(player2.getName() + "�� ���� �� ����= " + player2.getRandom());

			res1 = player1.solution();
			if (res1 >= 21) {
				System.out.println("\n"+player1.getName() + "�� 38����!!!!!");
			} else if ( res1>10  )  {
				System.out.println("\n"+player1.getName()+ "�� " + player1.getRandom() + "��");
			} else {
				System.out.println("\n"+player1.getName()+ "�� " + res1 + "��");
			}
			
			res2 = player2.solution();
			if (res2 >= 21) {
				System.out.println(player2.getName() + "�� 38����!!!!!");
			} else if ( res2>10) {
				System.out.println(player2.getName()+ "�� " + player2.getRandom() + "��");
			} else {
				System.out.println(player2.getName()+ "�� " + res2 + "��");
			}
			
			if(res1 > res2)
				System.out.println("************ "+ (i+1) +" ���� " + player1.getName()+ "���� �¸� �ϼ̽��ϴ� ************");
			else if(res1 < res2)
				System.out.println("************ "+ (i+1) +" ���� " + player2.getName() + "���� �¸� �ϼ̽��ϴ� ************");
			else
				System.out.println("************************** "+ (i+1) +" ���� ���º� �Դϴ�. **************************");
			player1.compare(player2);
			 }// 5�� �ݺ�
		
		
			System.out.println(player1.getName()+" �� ����  "+ player1.getScore() + " �� �Դϴ�." );
			System.out.println(player2.getName()+" �� ����  "+ player2.getScore() + " �� �Դϴ�." );
			
			if (player1.getScore() > player2.getScore())
				System.out.println("************" + player1.getName() + "�� �����մϴ�. ���� �¸� �ϼ̽��ϴ� ************");
			else if (player1.getScore() < player2.getScore())
				System.out.println("************" + player2.getName() + "�� �����մϴ�. ���� �¸� �ϼ̽��ϴ� ************");
			else if (player1.getScore() == player2.getScore())
				System.out.println("************************** �ƽ��׿�. ���� ���º��Դϴ�. **************************");

			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("������ ���� �Ǿ����ϴ�.");
				break;}
		}//����while
	}//main
}//class