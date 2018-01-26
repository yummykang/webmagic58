package me.yummykang;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 上午11:14
 */
public class SinaBlogProcessor implements PageProcessor {
    public static final String URL_LIST = "http://sh\\.58\\.com/chuzu/0/pn\\d";

    public static final String URL_POST = "http://sh\\.58\\.com/hezu/\\d+x\\.shtml";

    private Site site = Site
            .me()
            .setDomain("sh.58.com")
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

    @Override
    public void process(Page page) {
        //列表页
        if (page.getUrl().regex(URL_LIST).match()) {
            page.addTargetRequests(page.getHtml().xpath("/html/body/div[3]/div[1]/div[5]/div[2]/ul").links().regex(URL_POST).all());
            page.addTargetRequests(page.getHtml().links().regex(URL_LIST).all());
            //文章页
        } else {
            page.putField("title", page.getHtml().xpath("/html/body/div[4]/div[1]/h1"));
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new SinaBlogProcessor()).addUrl("http://sh.58.com/chuzu/0/pn1").thread(5)
                .run();
    }
}
