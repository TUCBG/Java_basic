package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Blackjack {
	static int playerDrawNumber;
	static int comDrawNumber;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("블랙잭");
		f.setSize(315, 430);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player");
		lblNewLabel.setBounds(39, 61, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblCom = new JLabel("COM");
		lblCom.setBounds(205, 61, 57, 15);
		f.getContentPane().add(lblCom);
		
		JLabel playerNum = new JLabel("숫자");
		playerNum.setFont(new Font("굴림", Font.BOLD, 20));
		playerNum.setHorizontalAlignment(SwingConstants.CENTER);
		playerNum.setBounds(28, 159, 81, 36);
		f.getContentPane().add(playerNum);
		
		JLabel comNum = new JLabel("숫자");
		comNum.setHorizontalAlignment(SwingConstants.CENTER);
		comNum.setFont(new Font("굴림", Font.BOLD, 20));
		comNum.setBounds(181, 159, 81, 36);
		f.getContentPane().add(comNum);
		
		Random ran = new Random();

				JButton draw = new JButton("뽑기");
				draw.setBounds(12, 300, 97, 23);
				f.getContentPane().add(draw);
				draw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						playerDrawNumber += ran.nextInt(12)+1;
						playerNum.setText("" + playerDrawNumber);
						
						comDrawNumber += ran.nextInt(12) + 1;
						comNum.setText("" + comDrawNumber);
						
							if (comDrawNumber >= 18) {
								int randomDraw = ran.nextInt(2);
								
								if (randomDraw == 1) {
									if (comDrawNumber < playerDrawNumber && comDrawNumber < 21) {
										comDrawNumber += ran.nextInt(12) + 1;
										comNum.setText("" + comDrawNumber);
									} 
								}
						}
						if(playerDrawNumber > 21 && comDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "무승부" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "당신의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(comDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "컴퓨터의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber == 21 && comDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "무승부" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "컴퓨터의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(comDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "당신의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
					}
				});
				
				JButton stop = new JButton("멈추기");
				stop.setBounds(181, 300, 97, 23);
				f.getContentPane().add(stop);
				stop.addActionListener(new ActionListener() {
	
					@Override
					public void actionPerformed(ActionEvent e) {
						int randomDraw = ran.nextInt(2);
						
						if (randomDraw == 1) {
							if (comDrawNumber < playerDrawNumber && comDrawNumber < 21) {
								comDrawNumber += ran.nextInt(12) + 1;
								comNum.setText("" + comDrawNumber);
							} 
						} else {
							if (comDrawNumber < playerDrawNumber && playerDrawNumber <= 21) {
								JOptionPane.showMessageDialog(f, "당신의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
								
								comDrawNumber = 0;
								playerDrawNumber = 0;
								
								comNum.setText("" + comDrawNumber);
								playerNum.setText("" + comDrawNumber);
							} else if (comDrawNumber == playerDrawNumber) {
									JOptionPane.showMessageDialog(f, "무승부" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
									
									comDrawNumber = 0;
									playerDrawNumber = 0;
									
									comNum.setText("" + comDrawNumber);
									playerNum.setText("" + comDrawNumber);
							} else if (comDrawNumber > playerDrawNumber) {
								JOptionPane.showMessageDialog(f, "컴퓨터의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
								
								comDrawNumber = 0;
								playerDrawNumber = 0;
								
								comNum.setText("" + comDrawNumber);
								playerNum.setText("" + comDrawNumber);
							} 
						}
						if(playerDrawNumber > 21 && comDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "무승부" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "당신의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(comDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "컴퓨터의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber == 21 && comDrawNumber == 21) {
							JOptionPane.showMessageDialog(f, "무승부" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(playerDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "컴퓨터의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
						
						if(comDrawNumber > 21) {
							JOptionPane.showMessageDialog(f, "당신의 승리" + "\n당신 : " + playerDrawNumber + " 컴퓨터 : " + comDrawNumber);
							
							comDrawNumber = 0;
							playerDrawNumber = 0;
							
							comNum.setText("" + comDrawNumber);
							playerNum.setText("" + comDrawNumber);
						}
					}
				});
				
				JButton restart = new JButton("다시시작");
				restart.setBounds(99, 358, 97, 23);
				f.getContentPane().add(restart);
				restart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						comDrawNumber = 0;
						playerDrawNumber = 0;
						
						comNum.setText("" + comDrawNumber);
						playerNum.setText("" + comDrawNumber);
						
					}
				});
				
		f.setVisible(true);
	}
}
