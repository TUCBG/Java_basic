package 크롤링;
import 크롤링.크롤링연습5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

import javax.swing.JTextField;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 크롤링연습2 {
	private static JTextField codeTextfield;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JLabel codeLabel = new JLabel("CODE");
		codeLabel.setFont(new Font("굴림", Font.BOLD, 12));
		codeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codeLabel.setBounds(157, 223, 57, 15);
		f.getContentPane().add(codeLabel);
		
		codeTextfield = new JTextField();
		codeTextfield.setHorizontalAlignment(SwingConstants.CENTER);
		codeTextfield.setFont(new Font("굴림", Font.BOLD, 12));
		codeTextfield.setBounds(129, 248, 116, 21);
		f.getContentPane().add(codeTextfield);
		codeTextfield.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(218, 218, 218));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setBounds(12, 332, 360, 219);
		f.getContentPane().add(textArea);
		
		JButton samsung = new JButton("SAMSUNG");
		samsung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				크롤링.naver("005930");
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		samsung.setBounds(12, 45, 360, 23);
		f.getContentPane().add(samsung);
		
		JButton sk = new JButton("SK");
		sk.setBounds(12, 78, 360, 23);
		f.getContentPane().add(sk);
		sk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				크롤링.naver("034730");
				String result = 크롤링.naver("034730");
				textArea.setText(result);
			}
		});
		
		JButton hyundai = new JButton("HYUNDAI");
		hyundai.setBounds(12, 111, 360, 23);
		f.getContentPane().add(hyundai);
		hyundai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				크롤링.naver("005380");
				String result = 크롤링.naver("005380");
				textArea.setText(result);
			}
		});
		
		JButton lg = new JButton("LG");
		lg.setBounds(12, 144, 360, 23);
		f.getContentPane().add(lg);
		lg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				크롤링.naver("003550");
				String result = 크롤링.naver("003550");
				textArea.setText(result);
			}
		});
		
		JButton lotte = new JButton("LOTTE");
		lotte.setBounds(12, 177, 360, 23);
		f.getContentPane().add(lotte);
		lotte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				크롤링.naver("005300");
				String result = 크롤링.naver("005300");
				textArea.setText(result);
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 360, 15);
		f.getContentPane().add(lblNewLabel);
		
		JButton crawling = new JButton("\uD06C\uB864\uB9C1 \uC2DC\uC791!");
		crawling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String codeInsert = codeTextfield.getText();
				
				크롤링연습5 크롤링 = new 크롤링연습5();
				String result = 크롤링.naver(codeInsert);
				textArea.setText(result);
			}
		});
		crawling.setBounds(129, 278, 116, 23);
		f.getContentPane().add(crawling);
		f.setVisible(true);
		
	}
}
