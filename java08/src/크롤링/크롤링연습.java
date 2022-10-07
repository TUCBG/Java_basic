package 农费傅;

import java.io.FileWriter;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.*;

public class 农费傅楷嚼 {

	public static void main(String[] args) {
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("http://www.naver.com").get();
			//System.out.println(doc);
			org.jsoup.select.Elements list = doc.select(".nav");
			System.out.println(list.size());
			
			//System.out.println(list.get(0));
			//System.out.println(list.get(1));
			
			for (int i = 0; i < list.size(); i++) {
				org.jsoup.nodes.Element tag = list.get(i);
				System.out.println(i + " : " + tag.text());
			}
			
			//FileWriter fileWriter = new FileWriter();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
