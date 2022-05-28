-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: Book
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_table`
--
USE Book;
DROP TABLE IF EXISTS `book_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_table` (
  `bookid` char(7) NOT NULL,
  `bookname` varchar(100) NOT NULL,
  `author` varchar(100) DEFAULT NULL,
  `publichouse` varchar(50) NOT NULL,
  `introduction` longtext,
  `isin` bit(1) NOT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_table`
--

LOCK TABLES `book_table` WRITE;
/*!40000 ALTER TABLE `book_table` DISABLE KEYS */;
INSERT INTO `book_table` VALUES ('A000001','IBM-PC汇编语言程序设计','沈美明、温东婵','清华大学出版社','在教材中注意体现了“机器”与“程序”相互结合这一思想，使学生对“计算机”的认识更加深入',_binary ''),('A000002','第一行代码Android（第2版）','郭霖','人民邮电出版社','本书内容通俗易懂，由浅入深，既适合初学者阅读，也同样适合专业人员。学习本书内容之前，你并不需要有任何的Android基础，但是你需要有一定的Java基础，因为Android开发都是使用Java语言的，而本书并不会去专门介绍Java方面的知识。',_binary '\0'),('A000003','数据库系统概论','王珊、撒师煊','高等教育出版社','我国第一部系统阐述数据库原理、技术和方法的教材，实时反映数据库领域新成果和应用新方向，内容丰富，概念准确，结构完整，语言精练，具有较强的可读性与教学适用性。',_binary ''),('A000004','软件工程导论','张海藩、牟永敏','清华大学出版社','本书全面系统地讲述了软件工程的概念、原理和典型的方法学，并介绍了软件项目的管理技术。本书正文共13章，第1章是概述，第2章至第8章顺序讲述软件生命周期各阶段的任务、过程、结构化方法和工具。',_binary '\0'),('A000005','PPT设计思维（实战版','邵云蛟','电子工业出版社','在知乎获得300多万收藏、88万赞的PPT设计经验分享，数十万粉丝共同点赞的PPT“美容计划”，《PPT之光》等畅销书作者、@simon_阿文、iSlide社区创始人刘浩力荐，随书赠送PPT知识地图.',_binary ''),('A000006','深入核心的敏捷开发：ThoughtWorks五大关键实践','肖然 张凯峰','清华大学出版社','ThoughtWorks十多年敏捷导入与实施经验回放，行之有效的敏捷开发核心原则、实践、管理体系及案例，灵巧结合工程实践与敏捷管理，推动敏捷转型顺利落地。',_binary ''),('A000007','算法导论（原书第3版）','(美)科尔曼','机械工业出版社','影响全球千万程序员的“算法圣经”！国内外千余所高校采用！MIT四大名师联手铸就。',_binary ''),('A000008','C Primer Plus 第6版 中文版','[美]史蒂芬·普拉达','人民邮电出版社','畅销30余年的C语言编程入门教程 近百万程序员的C语言编程启蒙教程 技术大牛案头常备的工具书 针对C11标准库更新 蔡学镛 孟岩 高博倾力推荐',_binary ''),('A000009','深入浅出MySQL 数据库开发 优化与管理维护 第3版','翟振兴、张恒岩、崔春华、黄荣、董骐铭','人民邮电出版社','MySQL技术内幕从入门到精通书籍，高性能MySQL数据库必知必会教程，畅销图书全新升级版本，涵盖MySQL 8.0的重要功能，附带大量一线工程案例',_binary ''),('A000010','Python金融大数据挖掘与分析全流程详解','王宇涛 房宇亮 肖金鑫','机械工业出版社','利用python高效解决量化金融问题、揭秘人工智能在金融行业中的实战应用、全流程详解量化金融与数据化决策技术、网络爬虫从入门到精通、附赠超值讲解视频',_binary ''),('A000011','千金良方——MySQL性能优化金字塔法则','李春','电子工业出版社','沃趣团队凭借着多年的运维经验，为行业客户提供专业数据库、系统相关的服务和产品。《千金良方——MySQL性能优化金字塔法则》是其核心团队的呕心力作，全书细致地介绍MySQL的基本原理，以及性能优化的实际案例。\n无论你是MySQL初学者，还是专门从事MySQL工作的开发人员和运维人员，或者是资深的MySQL DBA，都值得一读！',_binary ''),('A000012','R语言实战 第2版','[美]卡巴科弗（Robert I. Kabacoff）','人民邮电出版社','【图灵程序设计丛书】R语言入门到精通 大数据挖掘 用R轻松实现数据挖掘 数据可视化 从实际数据分析出发 全面掌握R编程 新增预测性分析 简化多变量数据等近200页内容',_binary ''),('A000013','Android Studio开发实战：从零基础到App上线(第2版)','欧阳燊','清华大学出版社','深度揭秘流行App背后的手机开发技术，展示移动信息科技的1新工程实践',_binary ''),('A000014','用户体验要素：以用户为中心的产品设计（原书第2版）','[美]杰西·詹姆斯·加勒特（Jesse James Garrett）','机械工业出版社','《用户体验要素：以用户为中心的产品设计（原书第2版）》是ajax之父jesse james garrett的经典之作。本书用简洁的语言系统化地诠释了设计、技术和商业融合是重要的发展趋势。全书共8章，包括关于用户体验以及为什么它如此重要、认识这些要素、战略层、范围层、结构层、框架层、表现层以及要素的应用。　　《用户体验要素：以用户为中心的产品设计（原书第2版）》用清晰的说明和生动的图形分析了以用户为中心的设计方法（ucd）来进行网站设计的复杂内涵，并关注于思路而不是工具或技术，从而使你的网站具备高质量体验的流程。',_binary ''),('A072659','计算机操作系统教程','张尧学、宋虹、张高','清华大学出版社','本套教材体系完整，结构严谨。',_binary ''),('A407227','隐私保护数据发布：模型与算法','吴英杰','清华大学出版社','本书主要阐述数据共享发布中的两大主要隐私保护模型及其关键算法。\n    全书分为两篇，第一篇阐述匿名隐私保护数据发布，由第1～9章组成，主要内容涉及匿名隐私保护相关知识、k匿名组规模的上界讨论、关系型数据发布及其扩展背景(数据增量更新和多敏感属性数据发布)下的匿名隐私保护、非关系型数据(包括事务型数据、社会网络数据和轨迹数据)发布中的匿名隐私保护模型及算法、面向LBS应用的位置隐私保护等；第二篇阐述差分隐私保护数据发布，由第10～19章组成，主要内容涉及差分隐私基础知识、基于k叉平均树的差分隐私数据发布、面向任意区间树结构及其扩展背景(考虑区间查询分布和异方差加噪)下的差分隐私直方图发布、面向其他应用背景(流/连续数据发布、稀疏/多维数据发布)的差分隐私保护、差分隐私下的频繁模式挖掘等。\n\n    本书主要面向计算机科学、网络空间安全、管理科学与工程等相关学科专业高年级本科生、研究生以及广大研究数据安全隐私保护的科技工作者。',_binary ''),('B000001','毛泽东思想和中国特色社会主义理论体系概论','本书编写组','高等教育出版社','“毛泽东思想和中国特色社会主义理论体系概论”是根据2005年《中共中央宣传部、教育部关于进一步加强和改进高等学校思想政治理论课的意见》及“实施方案”设立的，是我国高校本专科学生都必修的一门思想政治理论课程。',_binary ''),('B000002','新中国：砥砺奋进的七十年','张士义','东方出版社','2019年主题出版重点出版物 一条时间线勾勒新中国七十年历史 人人都应该认真接受的国史教育 公务员应该人手一册的国史读本',_binary ''),('B000003','大趋势：中国下一步','郑永年','东方出版社','中国问题研究专家郑永年用国际视野，世界眼光系统解读中国的改革逻辑，分析新常态下中国面临的新风险和挑战，探寻中国前进道路的正确方向',_binary ''),('B000004','注定一战：中美能避免修昔底德陷阱吗？','[美] 格雷厄姆·艾利森','上海人民出版社','贸易战必读。亚马逊年度*历史类图书，《纽约时报》、《金融时报》、《伦敦时报》年度畅销书。哈佛大学历史学家、美国前助理国防部长格雷厄姆·艾利森，横跨500年历史、剖析21世纪zui重要的大国关系',_binary ''),('B000005','毛泽东论核武器与核战争 初析','崔茂东 李华','北京联合出版公司','国内较为全面系统地收集和研究*关于核武器与核战争论述的专门著作，再现一代伟人的缜密思维、卓远见识与运筹帷幄。',_binary ''),('C000001','思无邪','安意如','人民文学出版社','一棵树上不可能只结甜而大的果子，也有干瘪酸涩的，因此无论喜悦悲哀都要学会顺然承受。《诗经》传达的本就该是这样发自内心田的喜悦或是忧伤。',_binary ''),('C000002','人生若只如初见','安意如','人民文学出版社','太多人喜欢这一句，“人生若只如初见”。可知我们都遗憾深重。命运像最名贵的丝绢，再怎样巧夺天工，拿到手上看，总透出丝丝缕缕的光，那些错落，是与生具行的原罪。',_binary ''),('C000003','当时只道是寻常','安意如','人民文学出版社','细读纳兰词会发现，豪放是外在的风骨，忧伤才是内敛的精魂。',_binary ''),('C000004','皮囊','蔡崇达，果麦文化','天津人民出版社','刘德华、韩寒、白岩松感动推荐。2019全新升级，书封采用具有肌肤质感的SKINS纸。命运是一条闪闪发光的金色河流，我们彼此相遇，卸下皮囊，以心相交。',_binary ''),('C000005','一只特立独行的猪','王小波','北京十月文艺出版社','王小波杂文精选集，逝世二十周年精装纪念版！幽默中充满智性，扛起一面自由、独立、理性的精神旗帜！——“我觉得黑色幽默是我的气质，是天生的。”',_binary ''),('C000006','万般滋味，都是生活','丰子恺','华中科技大学出版社','丰子恺先生诞辰120周年纪念！全彩插图珍藏本，丰子恺*温暖的散文作品。献给曾是孩子的你！愿你永葆童真，并乐此不疲，去生活！',_binary ''),('C000007','沉默的大多数','王小波','北京十月文艺出版社','王小波杂文精选集，逝世二十周年精装纪念版！特别收入珍贵手稿！集结精粹杂文，全面呈现一位自由思想者的精神世界！——“从话语中，你很少能学到人性，从沉默中却能。”',_binary '\0'),('D000001','明天也是小春日和','津端英子，津端修一','新星出版社','（一个男人对妻子的承诺：那并不耀眼的初冬暖阳，恰似你日复一日的长情陪伴）',_binary ''),('D000002','你想活出怎样的人生','日）吉野源三郎 著，（日）胁田和 绘','南海出版公司','影响宫崎骏一生的经典小说，入选日本学校教材，荣获日本中学教师票选“送你一本书大奖”，中日知名院士、学者一致推荐。生而为人真正重要的事，都在这本书里了！',_binary ''),('D000003','瓦尔登湖','（美）梭罗','中国三峡出版社','美国自然文学的典范，与《圣经》一同被评为“塑造读者的25本书”。瓦尔登湖旅游节指定中文版本，管理者Machael J. Frederick 盛赞推荐。清华大学校长送给新生的见面礼，朗读者推荐阅读。',_binary ''),('D000004','查令十字街84号','海莲·汉芙 著，陈建铭 译','译林出版社','爱书人的圣经，当当网友真实好评破24万！唐诺、恺蒂、张立宪、汤唯、吴秀波、潘虹、李现都是这本书的书迷！',_binary ''),('D000005','痛苦的中国人','[奥地利]彼得·汉德克 著，刘学慧、张帆 译','上海人民出版社','余华推荐！德语文学“活着的经典”，一个充满隐喻的“杀人故事”，三段追索历史与现状的东欧之旅，在作者眼里，没有浮光掠影）',_binary ''),('D000006','月亮和六便士','（英）威廉·萨默塞特·毛姆 著，王然 译','花山文艺出版社','眼前的苟且or诗意的远方，让毛姆告诉你该作何选择,以法国后印象派画家高更为原型，白岩松、余华、村上春树、杨澜、蔡崇达、高晓松、范冰冰感动推荐！',_binary ''),('D000007','聂鲁达情诗全集：二十首情诗和一首绝望的歌','巴勃罗·聂鲁达','南海出版公司','聂鲁达20岁时的《二十首情诗和一首绝望的歌》，为他赢得了全世界的赞誉。《船长的诗》《一百首爱的十四行诗》是聂鲁达写给爱人玛蒂尔德的情诗，充满了突发的和炽烈的激情，字里行间都是对玛蒂尔德的爱。“爱是这么短，遗忘是这么长”“我喜欢你沉默的时候，因为你仿佛不在”等经典的聂鲁达诗句，打动着每一个恋人。',_binary ''),('E000001','知更鸟女孩','查克·温迪格','百花洲文艺出版社','她心里有一座关于死亡的大剧院，舞台上的幕布永远是拉开的，生存与死亡在这里交错轮回，充斥其间的是人性与爱的一次次交锋。到底是人性拯救爱，还是爱拯救人性？或者说爱情在我们的生命里到底占据多大的比重？我想每个人都想知道答案。',_binary ''),('E000002','活着','余华','作家出版社','余华是我国当代著名作家，也是享誉世界的小说家，曾荣获众多国内外奖项。《活着》是其代表作，在全球广泛传播，销量逾千万册，获得了普遍好评，已成为中国乃至世界当代文学的经典。',_binary ''),('E000003','偷影子的人','马克·李维（Marc Levy）','湖南文艺出版社','一部唤醒童年回忆与内心梦想的温情疗愈小说，2013年度“大众ZUI喜爱的50本书”之一。数百万中文读者口口相传，外国文学畅销经典。',_binary ''),('E000004','时间的答案','卢思浩','北京联合出版有限公司','青年作家卢思浩2019年全新长篇小说。献给一边成长一边失去，面临人生选择的我们。我们都是往事的幸存者。向前走，时间会给你答案。',_binary ''),('E000005','荒潮','陈楸帆','上海文艺出版社','　一座被卷入全球化浪潮的电子垃圾之岛，污染肆虐，罪恶横行。;\n\n　　一台用途不明的危险义体，牵扯出一位女孩大脑的疯狂异变。\n\n　　贪心的大家族、饱受歧视的劳工、暗藏其间的经济杀手……小小的孤岛之上暗流涌动。\n\n　　而这一切，都指向一场尘封六十年的禁忌实验——“荒潮”计划……',_binary '');
/*!40000 ALTER TABLE `book_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrow_table`
--

DROP TABLE IF EXISTS `borrow_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrow_table` (
  `booksid` char(7) NOT NULL,
  `usersid` char(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrowtime` timestamp NOT NULL,
  `returntime` timestamp NULL DEFAULT NULL,
  `shouldtime` timestamp NOT NULL,
  `fine` decimal(5,2) NOT NULL DEFAULT (0.0),
  PRIMARY KEY (`booksid`,`usersid`),
  KEY `usersid` (`usersid`),
  CONSTRAINT `borrow_table_ibfk_1` FOREIGN KEY (`booksid`) REFERENCES `book_table` (`bookid`),
  CONSTRAINT `borrow_table_ibfk_2` FOREIGN KEY (`usersid`) REFERENCES `user_table` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow_table`
--

LOCK TABLES `borrow_table` WRITE;
/*!40000 ALTER TABLE `borrow_table` DISABLE KEYS */;
INSERT INTO `borrow_table` VALUES ('A000001','1000002','2019-12-06 08:50:36','2019-12-13 06:14:01','2020-01-05 08:50:36',0.00),('A000002','1000001','2019-12-17 04:58:21','2019-12-17 05:19:36','2020-01-16 04:58:21',0.00),('A000002','1000002','2019-11-13 06:17:05',NULL,'2019-12-12 06:17:05',441.00),('A000013','1656381','2019-12-17 10:03:48','2019-12-17 10:08:02','2020-01-16 10:03:48',0.00),('A072659','1000002','2019-12-13 06:18:57','2019-12-13 06:19:33','2020-01-12 06:18:57',0.00),('A072659','1000003','2019-12-13 06:17:50','2019-12-13 06:18:50','2020-01-12 06:17:50',0.00),('C000001','1000003','2019-12-13 06:19:53','2019-12-13 06:25:21','2020-01-12 06:19:53',0.00),('C000007','1656381','2019-12-17 10:07:51',NULL,'2020-01-16 10:07:51',423.00);
/*!40000 ALTER TABLE `borrow_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classific`
--

DROP TABLE IF EXISTS `classific`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classific` (
  `classid` char(1) NOT NULL,
  `classname` varchar(20) NOT NULL,
  PRIMARY KEY (`classid`),
  UNIQUE KEY `NONCLUSTERED` (`classname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classific`
--

LOCK TABLES `classific` WRITE;
/*!40000 ALTER TABLE `classific` DISABLE KEYS */;
INSERT INTO `classific` VALUES ('C','中国文学'),('D','外国文学'),('E','小说'),('B','思想政治'),('A','计算机');
/*!40000 ALTER TABLE `classific` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `recordsview`
--

DROP TABLE IF EXISTS `recordsview`;
/*!50001 DROP VIEW IF EXISTS `recordsview`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `recordsview` AS SELECT 
 1 AS `usersid`,
 1 AS `booksid`,
 1 AS `bookname`,
 1 AS `borrowtime`,
 1 AS `returntime`,
 1 AS `shouldtime`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `user_table`
--

DROP TABLE IF EXISTS `user_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_table` (
  `userid` char(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(20) NOT NULL,
  `upassword` varchar(14) NOT NULL,
  `phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `id` char(1) NOT NULL,
  `iscan` bit(1) NOT NULL,
  `borrownum` int DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `NONCLUSTERED` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_table`
--

LOCK TABLES `user_table` WRITE;
/*!40000 ALTER TABLE `user_table` DISABLE KEYS */;
INSERT INTO `user_table` VALUES ('0000001','张三','1234567','15936842345','0',_binary '\0',0),('0000002','张五','1234567','15515515511','0',_binary '\0',0),('0000003','张七七','1234567','12212212211','0',_binary '\0',0),('0000004','张八八','1234567','13314312212','0',_binary '\0',0),('0000005','张九九','123456','16616616616','0',_binary '\0',0),('0000006','张十十','123456','17717717717','0',_binary '\0',0),('1000001','李八','1234567','13457678364','1',_binary '',1),('1000002','王六','123456','22233333333','1',_binary '',1),('1000003','张一一','123456','12345678901','1',_binary '',0),('1222221','周三三','123456','13422325634','1',_binary '',0),('1246792','王四四','1234322','14930720937','1',_binary '',0),('1263893','王二二','1234323','15394673289','1',_binary '',0),('1274637','王八八','adjfhaes','17348274836','1',_binary '',0),('1333331','周四四','123456','15937263827','1',_binary '',0),('1345826','李五','dashu322','13746793234','1',_binary '',0),('1347298','王十十','causi23','17342793246','1',_binary '',0),('1371199','李狗蛋','123456','17398393787','1',_binary '',0),('1374672','李三三','bjs4328','13473692833','1',_binary '',0),('1374673','李一一','casy231','17627493834','1',_binary '',0),('1426594','李二二','3246922','13477924326','1',_binary '',0),('1444441','周五五','1234567','15937265327','1',_binary '',0),('1463234','王七七','abcdefg','13746927239','1',_binary '',0),('1467392','王五五','1234322','18463023748','1',_binary '',0),('1473589','李六','dfah453','13467294728','1',_binary '',0),('1555551','周二二','123456','13243246734','1',_binary '',0),('1634583','王九九','dgfiubau','17529338723','1',_binary '',0),('1656381','张咕咕','123456','15823225646','1',_binary '',1),('1666661','周六六','1234567','15937567328','1',_binary '',0),('1736430','王六六','1265382','18365380244','1',_binary '',0),('1763494','王三三','1234567','13864792638','1',_binary '',0),('1769320','王一一','1234567','15370934873','1',_binary '',0),('1777771','周七七','12345678','13437629643','1',_binary '',0),('1789128','张二四','123456','12312312312','1',_binary '',0),('1888881','周八八','12345678','15793075390','1',_binary '',0),('1999991','周九九','12345678','15829837407','1',_binary '',0);
/*!40000 ALTER TABLE `user_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `recordsview`
--

/*!50001 DROP VIEW IF EXISTS `recordsview`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `recordsview` AS select `borrow_table`.`usersid` AS `usersid`,`borrow_table`.`booksid` AS `booksid`,`book_table`.`bookname` AS `bookname`,`borrow_table`.`borrowtime` AS `borrowtime`,`borrow_table`.`returntime` AS `returntime`,`borrow_table`.`shouldtime` AS `shouldtime` from (`borrow_table` join `book_table` on((`borrow_table`.`booksid` = `book_table`.`bookid`))) */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-13 16:56:30
