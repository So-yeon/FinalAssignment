package com.sd.DiceFinal;

public class Yut extends Dice{
	private int number = 0;

	public void roll() {
		number = (int)(Math.random()*6+1);
		if(number == 1){
			yut = "µµ";
		}
		else if(number == 2){
			yut = "°³";
		}
		else if(number == 3){
			yut = "°É";
		}
		else if(number == 4){
			yut = "À·";
		}
		else if(number == 5){
			yut = "¸ğ";
		}
		else if(number == 6){
			number = -1;
			yut = "»ªµµ";
		}
		System.out.println(number + yut);

	}	
	public int getNum() {
		return this.number;
	}
}