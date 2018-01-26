package me.yummykang.pipeline;

import lombok.extern.slf4j.Slf4j;
import me.yummykang.model.Rent58Info;
import me.yummykang.utils.JdbcUtils;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import java.sql.SQLException;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 下午1:48
 */
@Slf4j
public class JDBCPipeline implements PageModelPipeline<Rent58Info> {

    @Override
    public void process(Rent58Info info, Task task) {
        if (info.getTitle() != null) {
            saveInfo(info);
        }
    }

    private void saveInfo(Rent58Info info) {
        try {
            JdbcUtils.getQueryRuner().update("insert into rent_info" +
                    "(title,publishTime,price,payType,roomType,floorType,plot,area,detailArea,detailAddress,farFromSubway,roomDescription,images,fromUrl) " +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    info.getTitle(), info.getPublishTime(), info.getPrice(), info.getPayType(),
                    info.getRoomType(), info.getFloorType(), info.getPlot(), info.getArea(),
                    info.getDetailArea(), info.getDetailAddress(), info.getFarFromSubway(),
                    info.getRoomDescription(), String.join(";", info.getImages()), info.getFromUrl());
        } catch (SQLException e) {
            log.error("保存租房信息失败");
            e.printStackTrace();
        }
    }
}
