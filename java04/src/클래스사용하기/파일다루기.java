package 클래스사용하기;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜 입력");
		String s2 = JOptionPane.showInputDialog("제목 입력");
		String s3 = JOptionPane.showInputDialog("내용 입력");
		
		try {
			FileWriter file = new FileWriter(s2 + ".txt");
			
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			
			file.close();
		} catch (IOException e) {
			System.out.println("에러");
		}
	}
}
