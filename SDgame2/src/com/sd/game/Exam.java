package com.sd.game;

import java.util.Scanner;
import java.io.*;

public class Exam {
   
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);   
      int res[]= new int[2];
      int menu_input;
      int back_input = 0;
      
      SDgame.print_menu();
      System.out.println("메뉴를 선택하세요.");
   menu_input=scanner.nextInt();
   
   boolean menu_check = true;
   while(menu_check){
   if(menu_input == 1 || back_input == 1){   
	   while (true) {
			SDgame_child[] players = { new SDgame_child(),
											  new SDgame_child() };
			for(int i=0; i<2; i++){
				System.out.println( (i+1) +" 플레이어 이름을 입력하세요.");
				players[i].setName(scanner.nextLine());
				}
		    for(int i=SDgame.currentRound; i<=GameInterface.ROUND ;i++){
				for(int j=0;j<2;j++){
					System.out.print("\n"+players[j].getName() + "님 숫자를 입력하세요.");
					players[j].input();
					while (true) {
						players[j].setSelect(scanner.nextInt());
						if (players[j].getSelect() < 1 || players[j].getSelect() > 10) {
							System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력하세요 ! \n");
							continue;
						} else
							break;
						}
					System.out.print("\n"+players[j].getName() + "의 첫 번째 패 숫자 = " + players[j].getSelect() + "     ");
					System.out.println(players[j].getName() + "의 랜덤 패 숫자= " + players[j].getRandom());
					res[j] = players[j].solution();
					
					if (res[j] >= 21) {
						System.out.println("\n"+players[j].getName() + "님 38광땡!!!!!");
					} else if ( res[j]>10  )  {
						System.out.println("\n"+players[j].getName()+ "님 " +players[j].getRandom() + "땡");
					} else {
						System.out.println("\n"+players[j].getName()+ "님 " + res[j] + "끗");
					}
				}
			
			
			if(res[0] > res[1])
				System.out.println("************ "+ SDgame.currentRound+" 라운드 " + players[0].getName()+ "님이 승리 하셨습니다 ************");
			else if(res[0] < res[1])
				System.out.println("************ "+ SDgame.currentRound +" 라운드 " + players[1].getName() + "님이 승리 하셨습니다 ************");
			else
				System.out.println("******************* "+ SDgame.currentRound +" 라운드 무승부 입니다. *******************");
		
			SDgame.currentRound++;
			players[0].compare(players[1]);
			System.out.println(players[0].getName()+"님의 보유금액= " + players[0].player_money);
			System.out.println(players[1].getName()+"님의 보유금액= " + players[1].player_money);
			 }// 5판 반복
			
			System.out.println(players[0].getName()+" 님 최종  "+ players[0].getScore() + " 점 입니다." );
			System.out.println(players[1].getName()+" 님 최종  "+ players[1].getScore() + " 점 입니다." );
				
			if (players[0].getScore() > players[1].getScore())
				System.out.println("************" + players[0].getName() + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (players[0].getScore() < players[1].getScore())
				System.out.println("************" + players[1].getName() + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (players[0].getScore() == players[1].getScore())
				System.out.println("************************** 아쉽네요. 최종 무승부입니다. **************************");

			System.out.println("계속하시겠습니까? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				menu_check= false;
				break;}
			else if(scanner.nextLine().equals("y"))
				continue;
		}//게임시작 while
   }
   
   else if (menu_input == 2){
      System.out.println("이 게임은 섯다를 기준으로 만든 게임입니다");
      System.out.println("두명의 사용자가 초기금 50,000원을 받고,"
            + "판돈을 만원씩으로해 총 5라운드를 진행을 합니다.");
      System.out.println("각 판마다의 승패를 가려 승리시 +20,000원을 "
            + "패배시 -10,000원을 하여 누적해 마지막 총액과 승수를 비교해 승리자를 나타내줍니다.");
      System.out.println("\n메뉴를 종료하시겠습니까?");
      
      if(scanner.nextLine().equals("y")){
         back_input = 1;
      }
         else if(scanner.nextLine().equals("n")){
            continue;
         }
      }
   }//else if문
   }

   
}//main
