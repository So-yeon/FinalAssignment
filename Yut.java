package com.sd.DiceFinal;

public class Yut extends Dice{
	private int number = 0;

	public void roll() {
		number = (int)(Math.random()*6+1);
		if(number == 1){
			yut = "��";
		}
		else if(number == 2){
			yut = "��";
		}
		else if(number == 3){
			yut = "��";
		}
		else if(number == 4){
			yut = "��";
		}
		else if(number == 5){
			yut = "��";
		}
		else if(number == 6){
			number = -1;
			yut = "����";
		}
		System.out.println(number + yut);

	}	
	public int getNum() {
		return this.number;
	}
}