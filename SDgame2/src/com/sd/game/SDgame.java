package com.sd.game;

import java.util.Scanner;

public class SDgame {
	int res;
	String name;
	int select;
	int random;
	int score;

	Scanner scanner = new Scanner(System.in);

	public SDgame() {
		name = " ";
		select = 0;
		random = 0;
		score=5;
	}

	void input() {
		random = ((int) (Math.random() * 10) + 1);
		System.out.print(name + "�� ���ڸ� �Է��ϼ���.");
		while (true) {
			select = scanner.nextInt();
			if (select < 1 || select > 10) {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. A ���ڸ� �ٽ� �Է��ϼ��� ! \n");
				continue;
			} // A�Է� ���� �˻�
			break;
		}
		System.out.print(name + "�� ù ��° �� ���� = " + select + "     ");
		System.out.println(name + "�� ���� �� ����= " + random);

	}// input �޼ҵ�

	void solution() {
		if (select == 3 & random == 8 || select == 8 & random == 3) {
			System.out.println("38����!!!!!");
			res = 21;
		} else if (select == random) {
			System.out.println(random + "��");
			res = 10 + random;
		} else {
			res = select + random;
			if (res > 10) {
				res = res - 10;
			}
			System.out.println(res + "��");
		}
	}

	void compare(SDgame player){
		if (res > player.res)
			score++;
		if (res <  player.res)
			score--;
		if (res == player.res) 
			score =score;
	}
	}// class