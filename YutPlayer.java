package com.sd.DiceFinal;

public class YutPlayer {
	public String name = null;
	int num = 0;
	int point = 0;

	public YutPlayer(String _name){
		name = _name;
	}

	public void play() {
		Yut y = new Yut();
		y.roll();
		num += y.getNum();
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