package com.sd.game;

public class SDgame {
	private int res;
	private String name;
	private int select;
	private int random;
	private int score;
	static final int ROUND = 5; // 총 라운드 수 불변
	static final int MONEY = 10000; // 기본 라운드금
	static int currentRound = 1; // 현재 라운드
	int player_money;
	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public SDgame() {
		name = " ";
		select = 0;
		random = 0;
		score=5;
		player_money=50000; // 초기 자본
		currentRound = 1;
	}

	void input() {
	random = ((int) (Math.random() * 10) + 1);
	}	

	int solution() {
		if (select == 3 & random == 8 || select == 8 & random == 3) 
			return 21;
	    else if (select == random) 
			return 10+random;
		else {
			if ( select+random >= 10) 
				return (select+random)-10;
			else
				return select+random;
			}
	}

	void compare(SDgame player){
		if (this.solution() > player.solution()){
			this.score ++;
			player.score --;}
		else if (this.solution() <  player.solution()){
			player.score ++;
			this. score --;}
	}
	
	static void print_menu(){
		System.out.println("┌──────────────────┐");
		System.out.println("│              섯다 게임 메뉴               │");
		System.out.println("│   	                                         │");
		System.out.println("│      1. 게임 시작                          │");
		System.out.println("│    	                                         │");
		System.out.println("│      2. 게임 설명  	                 │");
		System.out.println("│    	                                         │");
		System.out.println("│   	3. 메뉴 종료                           │");
		System.out.println("│    	                           	         │");
		System.out.println("└──────────────────┘");
	}
}// class