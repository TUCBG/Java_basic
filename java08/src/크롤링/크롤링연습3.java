package 农费傅;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;

public class 农费傅楷嚼3 {

	public static void main(String[] args) {
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
			org.jsoup.select.Elements list = doc.select(".Nitem_link_menu");
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				org.jsoup.nodes.Element tag = list.get(i);
				System.out.println(i + " : " + tag.text());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
