package 农费傅;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class 农费傅楷嚼4 {

	public static void main(String[] args) {
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			org.jsoup.select.Elements list = doc.select("td.first").select(".blind");
			//System.out.println(list);
			org.jsoup.nodes.Element tag = list.get(0);
			String yesterday = tag.text();
			
			Elements list2 = doc.select("div.today").select(".blind");
			org.jsoup.nodes.Element tag2 = list2.get(0);
			String today = tag2.text();
		
			Elements list3 = doc.select("td.first").select(".blind");
			org.jsoup.nodes.Element tag3 = list3.get(1);
			String first = tag3.text();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
