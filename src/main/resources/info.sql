-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: web_magic
-- ------------------------------------------------------
-- Server version	5.7.18-1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rent_info`
--

DROP TABLE IF EXISTS `rent_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rent_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `publishTime` varchar(200) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `payType` varchar(10) DEFAULT NULL,
  `roomType` varchar(20) DEFAULT NULL,
  `floorType` varchar(20) DEFAULT NULL,
  `plot` varchar(50) DEFAULT NULL,
  `area` varchar(20) DEFAULT NULL,
  `detailArea` varchar(50) DEFAULT NULL,
  `detailAddress` varchar(200) DEFAULT NULL,
  `farFromSubway` varchar(100) DEFAULT NULL,
  `roomDescription` varchar(500) DEFAULT NULL,
  `images` varchar(500) DEFAULT NULL,
  `fromUrl` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='rent information by scrawler';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent_info`
--

LOCK TABLES `rent_info` WRITE;
/*!40000 ALTER TABLE `rent_info` DISABLE KEYS */;
INSERT INTO `rent_info` VALUES (25,'(单间出租)直租！2室1厅1卫 主卧出租（限女生）(个人)',' 1分钟前     次浏览 ',1200,'','2室1厅1卫   40 平   ','暂无信息','普雄路46弄小区','普陀','武宁路',' 普雄路46弄 ','距离地铁3号线曹杨路站556米',NULL,';;;;;;;;;;;','http://sh.58.com/hezu/32834646693188x.shtml'),(26,'(单间出租)艾南花苑 主卧 朝南 室内阳台 精装修(个人)',' 1分钟前     次浏览 ',3500,'','2室1厅1卫   40 平   ','暂无信息','艾南花苑华绣路255弄','浦东','北蔡',' 暂无信息 ','',NULL,';;;;;','http://sh.58.com/hezu/27978115557307x.shtml'),(27,'(单间出租)中友嘉园 2室1厅1卫 男女不限(个人)',' 1分钟前     次浏览 ',3400,'','2室1厅1卫   92 平   ','暂无信息','中友嘉园','闵行','古美罗阳',' 古美路1458弄 ','距离地铁9号线漕河泾开发区站1178米',NULL,';;','http://sh.58.com/hezu/32890591432395x.shtml'),(28,'(单间出租)浦东金桥阳光城市家园 4室0厅 主卧 朝南 豪华装修(个人)',' 2分钟前     次浏览 ',1400,'押一付一','4室0厅1卫   25 平  豪华装修 ','南  高层/共14层','阳光城市家园','浦东','金桥',' 永宁路33弄 ','距离地铁12号线金京路站916米',NULL,';;;','http://sh.58.com/hezu/31562183125292x.shtml'),(29,'(单间出租)限单身上班簇女生！(个人)',' 2分钟前     次浏览 ',500,'押一付三','2室2厅1卫   12 平  简单装修 ','北  中层/共24层','美罗家园润苑','宝山','罗店',' 年吉路650弄 ','距离地铁7号线美兰湖站1480米',NULL,'','http://sh.58.com/hezu/32701557706567x.shtml'),(30,'(单间出租)8号线沈杜公路站步行5分钟，独立厨卫一室户，配置齐全！拎包住(个人)',' 2分钟前     次浏览 ',1300,'押一付三','1室0厅1卫   26 平  精装修 ','南  共2层','文达公寓','闵行','浦江',' 联达路139号 ','',NULL,';;;;;;','http://sh.58.com/hezu/32758611977915x.shtml'),(31,'(单间出租)丰盛雅苑 7室2厅 主卧 朝南 精装修(个人)',' 3分钟前     次浏览 ',1450,'','7室2厅2卫   22 平   ','暂无信息','丰盛雅苑','嘉定','江桥新城',' 华江公路555弄 ','距离地铁13号线金沙江西路站604米',NULL,';;;;','http://sh.58.com/hezu/29751451741130x.shtml'),(32,'(单间出租)上海阳城 1室1厅1卫 男女不限(个人)',' 3分钟前     次浏览 ',1800,'','1室1厅1卫   20 平   ','暂无信息','上海阳城','闵行','古美罗阳',' 罗锦路888弄4支弄 ','距离地铁1号线外环路站773米',NULL,';;;;;;;','http://sh.58.com/hezu/32890581253685x.shtml'),(33,'(单间出租)泰和新村(东区) 男女不限(个人)',' 4分钟前     次浏览 ',3500,'','1室1厅1卫   25 平   ','暂无信息','泰和新村(东区)','宝山','顾村',' 泰和西路3381弄94-141号 ','距离地铁1号线共富新村站2586米',NULL,';;;','http://sh.58.com/hezu/32890571623495x.shtml'),(34,'(单间出租)浦东北蔡莲泰苑 3室2厅 主卧 朝南 精装修(个人)',' 4分钟前     次浏览 ',1500,'押一付一','3室2厅2卫   15 平  精装修 ','南  高层/共7层','莲泰苑','浦东','北蔡',' 新陈路303弄 ','距离地铁16号线华夏中路1947米',NULL,';;;;;','http://sh.58.com/hezu/32713209154223x.shtml'),(35,'(单间出租)松江莘闵沿海丽水馨庭 4室2厅 主卧 朝南北 简单装修(个人)',' 4分钟前     次浏览 ',1000,'押一付三','4室2厅3卫   15 平  简单装修 ','南北  共3层','沿海丽水馨庭','松江','莘闵',' 明中路1588弄 ','',NULL,';;;;','http://sh.58.com/hezu/31814070446774x.shtml'),(36,'(单间出租)阳光好带阳台的房间便宜急租，女生优先(个人)',' 6分钟前     次浏览 ',1200,'','2室1厅1卫   15 平   ','暂无信息','翔黄雅苑','嘉定',NULL,' 星华公路1782弄 ','距离地铁13号线金运路站4065米',NULL,';','http://sh.58.com/hezu/32413905746498x.shtml'),(37,'(单间出租)可短租2个月左右，精装修朝南带阳台主卧，带大衣柜，拎包入住，(个人)',' 7分钟前     次浏览 ',2800,'','3室1厅1卫   30 平   ','暂无信息','古美小区','闵行','古美罗阳',' 东兰路111弄,古美路1107弄,东兰路151弄 ','距离地铁9号线漕河泾开发区站1728米',NULL,';;;;;','http://sh.58.com/hezu/32890450896200x.shtml'),(38,'(单间出租)浦东三林飞旺家园 转租朝东次卧 靠近8号线杨思6号线上南路，1700/月，押一付一(个人)',' 4分钟前     次浏览 ',1700,'押一付一','2室2厅1卫   10 平  中等装修 ','东  中层/共6层','飞旺家园','浦东','三林',' 海阳路865弄1-15号 ','距离地铁8号线杨思站833米',NULL,';;;;;;;;','http://sh.58.com/hezu/32890559077957x.shtml'),(39,'(单间出租)阳光苑 3室1厅1卫 单间出租男女不限(个人)',' 8分钟前     次浏览 ',1600,'','3室1厅1卫   15 平   ','暂无信息','阳光苑','浦东','曹路',' 民耀路268弄 ','',NULL,';;;;','http://sh.58.com/hezu/32846199732934x.shtml'),(40,'(单间出租)维罗纳贵都 民用水电(个人)',' 8分钟前     次浏览 ',1480,'','3室2厅2卫   25 平   ','暂无信息','维罗纳贵都','松江','松江老城',' 暂无信息 ','距离地铁9号线松江体育中心2486米',NULL,';','http://sh.58.com/hezu/32749011919302x.shtml'),(41,'(单间出租)玉乐小区 3室2厅2卫 男女不限(个人)',' 8分钟前     次浏览 ',1150,'','3室2厅2卫   20 平   ','暂无信息','玉乐小区','松江','松江老城',' 暂无信息 ','',NULL,';;;;;','http://sh.58.com/hezu/32857557632077x.shtml'),(42,'(单间出租)平南一村 3室一卫(个人)',' 10分钟前     次浏览 ',1300,'','3室1厅1卫   80 平   ','暂无信息','平南一村','闵行',NULL,' 平南一村 ','距离地铁9号线合川路1734米',NULL,';;;','http://sh.58.com/hezu/32757002379216x.shtml'),(43,'(单间出租)绿地康桥新苑 3室1厅1卫 限女生(个人)',' 10分钟前     次浏览 ',1900,'','3室1厅1卫   100 平   ','暂无信息','绿地康桥新苑','南汇','康桥',' 沪南路2688弄 ','',NULL,';;;;;;;;;','http://sh.58.com/hezu/32710876499661x.shtml'),(44,'(单间出租)高行绿洲(二期) 主卧转租(个人)',' 10分钟前     次浏览 ',1300,'','2室1厅1卫   16 平   ','暂无信息','高行绿洲(二期)','浦东','外高桥',' 秋岚路251弄 ','距离地铁6号线航津路717米',NULL,';;;;;','http://sh.58.com/hezu/32890544901044x.shtml'),(45,'(单间出租)靠13号线 次卧 超干净 金运路 淞虹路 真北路 绿地新江桥城 男女不限(个人)',' 11分钟前     次浏览 ',1700,'','3室1厅1卫   15 平   ','暂无信息','绿地新江桥城(东区','长宁',NULL,' 金耀南路300弄 ','',NULL,';;;;;;;;;','http://sh.58.com/hezu/32887310480452x.shtml');
/*!40000 ALTER TABLE `rent_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'web_magic'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-26 17:30:56
