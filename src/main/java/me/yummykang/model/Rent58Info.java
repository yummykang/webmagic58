package me.yummykang.model;

import lombok.Data;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 下午1:57
 */
@Data
@TargetUrl("http://sh.58.com/hezu/\\d+x.shtml")
@HelpUrl("http://sh.58.com/chuzu/0/pn\\d")
public class Rent58Info implements AfterExtractor {
    private Integer id;

    @ExtractBy("/html/body/div[4]/div[1]/h1/text()")
    private String title;

    @ExtractBy("/html/body/div[4]/div[1]/p/text()")
    private String publishTime;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/span[1]/b/text()")
    private Integer price;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/span[2]/text()")
    private String payType;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[2]/span[2]/text()")
    private String roomType;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[3]/span[2]/text()")
    private String floorType;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[4]/span[2]/a/text()")
    private String plot;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[5]/span[2]/a[1]/text()")
    private String area;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[5]/span[2]/a[2]/text()")
    private String detailArea;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[6]/span[2]/text()")
    private String detailAddress;

    @ExtractBy("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/ul/li[5]/em/text()")
    private String farFromSubway;

    @ExtractBy("/html/body/div[4]/div[3]/div[1]/div[1]/ul/li[3]/span[2]/text()")
    private String roomDescription;

    @ExtractBy(value = "//*[@id=\"housePicList\"]/li/img/text()", multi = true)
    private List<String> images = new ArrayList<>();

    private String fromUrl;

    @Override
    public void afterProcess(Page page) {
        System.out.println(page);
        this.fromUrl = page.getUrl().get();
    }
}
