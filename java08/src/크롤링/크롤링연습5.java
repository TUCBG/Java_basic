package 크롤링;

import java.io.IOException;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

public class 크롤링연습5 {
	
	public String naver(String code) {
		org.jsoup.nodes.Element tag = null, tag2 = null, tag3 = null;
		
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			
			//전일가
			org.jsoup.select.Elements list = doc.select("td.first").select(".blind");
			tag = list.get(0);
			System.out.println("전일가: " + tag.text());
			
			//현재가
			org.jsoup.select.Elements list2 = doc.select("div.today").select(".blind");
			tag2 = list2.get(0);
			System.out.println("현재가: " + tag2.text());
			
			//시가
			org.jsoup.select.Elements list3 = doc.select("td.first").select(".blind");
			tag3 = list.get(1);
			System.out.println("시가: " + tag3.text());
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "전일가 : " + tag.text() + "\n" +
			   "현재가 : " + tag2.text()+ "\n" +
			   "시가 : " + tag3.text();
	}
}

