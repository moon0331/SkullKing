package skullking;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.io.*;

import javax.imageio.ImageIO;

class CardButton extends JButton{
	public int val;
	CardButton(ImageIcon image, String name, int i){
		super(image);
		setName(name);
		val=i;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.out.println(getName());
			}
		}
		);
	}
	public int getVal() {
		return val;
	}	
}

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("titlename");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		for(int i=0;i<10;i++) {
			JLabel l=new JLabel(i*100+""); //걍 이름
			l.setBounds(100+100*i,50,100,100); //위치 위치 가로 세로
			add(l);
		}
		for(int i=0;i<10;i++) {
			//CardButton c=new CardButton("D:/joy.png",i);
			//System.out.println(c.retString());
			try {
				//JButton b=new JButton(new ImageIcon("D:/joy.png"));
				CardButton b=new CardButton(new ImageIcon("joy.png"),i+"번째 조이", i);
				//b.setName("조이");
				/*b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						System.out.println(b.getName());
					}
				}
				);*/
				b.setBounds(150+50*i, 500, 180, 320);
				add(b);
			} catch(Exception e) {
				 
			}
			//b.addActionListener(this);
			
			//이미지에서 픽셀 받는법 찾아야함
			
			//JButton button=c.getButton();
			//add(c);
		}
		/*JPanel panel1=new JPanel();
		panel1.add(new JLabel("ID"));
		add(panel1);*/
		
		setSize(1000,1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame mf=new MyFrame();
	}

}
