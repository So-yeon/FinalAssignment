package com.sd.DiceFinal;

public class Player{
	public String name = null;
	int num = 0;
	int point = 0;
	
	public Player(String _name){
		name = _name;
	}

	public void play() {
		Dice d = new Dice();
		d.roll();
		num += d.getNum();
		point += num;
	}
	public int getNum() {
		 return this.num;
	}
	public String getName(){
		return this.name;
	}
	public int getPoints(){
		return this.point;
	}
}