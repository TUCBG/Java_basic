package ũ�Ѹ�;

import java.io.IOException;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

public class ũ�Ѹ�����5 {
	
	public String naver(String code) {
		org.jsoup.nodes.Element tag = null, tag2 = null, tag3 = null;
		
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			
			//���ϰ�
			org.jsoup.select.Elements list = doc.select("td.first").select(".blind");
			tag = list.get(0);
			System.out.println("���ϰ�: " + tag.text());
			
			//���簡
			org.jsoup.select.Elements list2 = doc.select("div.today").select(".blind");
			tag2 = list2.get(0);
			System.out.println("���簡: " + tag2.text());
			
			//�ð�
			org.jsoup.select.Elements list3 = doc.select("td.first").select(".blind");
			tag3 = list.get(1);
			System.out.println("�ð�: " + tag3.text());
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "���ϰ� : " + tag.text() + "\n" +
			   "���簡 : " + tag2.text()+ "\n" +
			   "�ð� : " + tag3.text();
	}
}

