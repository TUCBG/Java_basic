package 순차문;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 콘솔입력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		
//		JFrame f = new JFrame();
//		
//		JTextField t1 = new JTextField();
//		JTextField t2 = new JTextField();
//		
//		JTextArea ja = new JTextArea();
//		
//		Random r = new Random();
//		Date date = new Date(0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		int age2 = age +1;
		
		System.out.println("나이는 "  + age);
		
	}

}
