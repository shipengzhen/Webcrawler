/**
 *
 */
package com.spz.web;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @���� webcrawler
 * @���� ʩ����
 * @�������� 2018��1��23��
 * @����ʱ�� ����11:35:24
 */
public class Test {

    /**
     * TODO
     * @param args void
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // ����Dom�ĵ�
        Document document = Jsoup.connect("http://www.waduanzi.com/").get();
        // ����
        String selecttor = "div[class=panel panel20 post-item post-box]";

        Elements elements = document.select(selecttor);
        for (Element element : elements) {

            System.out.println("����=>" + element.child(0).child(1).text());
            Elements select = element.select("div[class=item-detail]>h2>a");
            Elements title = select;
            System.out.println("����=>" + title.text());
            Elements content = element.select("div[class=item-detail]>div");
            System.out.println("����=>" + content.text());
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------");

        }
    }
}
