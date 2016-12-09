package com.sd.DiceFinal;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JButton;  //GUI��� ���� �� ���� ������.
import java.awt.event.*;  // �׼� �����ʸ� ���� ��
import java.awt.*;
import java.awt.Container;  //��� �ڹ� �����ȿ� �ִ°� �ƴ�. �����Ұ�!

public class DiceGameMain extends JFrame implements ActionListener{

/////////////////////////////GUI/////////////////////////////////////   
	JTextField scoreTF1, scoreTF2, winTF1;
	JLabel label1,label2,label3,label4,label5;
	JButton b1,b2,b3;

/////////////////////////////Code///////////////////////////////////
	Player p1;
	Player p2;
	public int playTime = 2;

	public void calcScoreMain(){
		JPanel panel = new JPanel(new GridLayout(5,2)); 

		getContentPane().add(panel);
		label1 = new JLabel("�ֻ��� ����");
		b3 = new JButton("������ �ϱ�");

		label3 = new JLabel("Player1 ����");
		scoreTF1 = new JTextField(10); 
		label4 = new JLabel("Player2 ����");
		scoreTF2 = new JTextField(10); 

		label5 = new JLabel("�̱� ���");
		winTF1 = new JTextField(10); 

		b1 = new JButton("����");
		b2 = new JButton("Clear");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		panel.add(label1);	//grid ���̾ƿ�
		panel.add(b3);
		panel.add(label3);
		panel.add(scoreTF1);
		panel.add(label4);
		panel.add(scoreTF2);
		panel.add(label5);
		panel.add(winTF1);
		panel.add(b1);
		panel.add(b2);

		pack(); 
 		setVisible(true);		
	}

	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource();   //�̰� ���� �˾Ƴ��� ��! ���⼭�� getSource�� ��ư��!
		
		if(b.getText().equals("����")){
			p1 = new Player("soyeon");
			p2 = new Player("yeseul");

			for(int i=0;i<playTime; i++){
				p1.play();
				p2.play();
			}

			String string1 = Integer.toString(p1.getNum());
			String string2 = Integer.toString(p2.getNum());

			scoreTF1.setText(string1);
			scoreTF2.setText(string2);
		
			int n1 = p1.getNum();  
			int n2 = p2.getNum();

			if (n1 < n2) {
				winTF1.setText(p2.getName());
			}
			else if(n1 > n2){
				winTF1.setText(p1.getName());
			}
			else if(n1==n2) {
				winTF1.setText("�����");
			}
		}
		else if(b.getText().equals("Clear")){
			scoreTF1.setText("");
			scoreTF2.setText("");
			winTF1.setText("");
		}
		
		else if(b.getText().equals("������ �ϱ�")){
			YutGameMain y = new YutGameMain();
			y.calcScoreMain();
			y.pack();
			y.setVisible(true);
		}
		
	}	
		
	public static void main(String[] args){
		DiceGameMain d = new DiceGameMain();
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
		d.calcScoreMain();
		d.pack();
		d.setVisible(true);
	}
}