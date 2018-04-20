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
 * @描述 webcrawler
 * @作者 施鹏振
 * @创建日期 2018年1月23日
 * @创建时间 上午11:35:24
 */
public class Test {

    /**
     * TODO
     * @param args void
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // 请求Dom文档
        Document document = Jsoup.connect("http://www.waduanzi.com/").get();
        // 解析
        String selecttor = "div[class=panel panel20 post-item post-box]";

        Elements elements = document.select(selecttor);
        for (Element element : elements) {

            System.out.println("作者=>" + element.child(0).child(1).text());
            Elements select = element.select("div[class=item-detail]>h2>a");
            Elements title = select;
            System.out.println("标题=>" + title.text());
            Elements content = element.select("div[class=item-detail]>div");
            System.out.println("内容=>" + content.text());
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------");

        }
    }
}
