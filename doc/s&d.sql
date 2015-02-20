/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.27 : Database - nfqx
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

/*Table structure for table `booking_service` */

DROP TABLE IF EXISTS `booking_service`;

CREATE TABLE `booking_service` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL COMMENT '用户姓名',
  `contact` varchar(100) DEFAULT NULL COMMENT '联系方式',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `diagnosis` bigint(16) DEFAULT NULL COMMENT '诊断',
  `displacement` varchar(100) DEFAULT NULL COMMENT '排量',
  `model` varchar(100) DEFAULT NULL COMMENT '型号',
  `year` varchar(10) DEFAULT NULL COMMENT '年份',
  `status` varchar(1) DEFAULT NULL COMMENT '处理状态',
  `reserved` varchar(10) DEFAULT NULL COMMENT '预留字段',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `date` date DEFAULT NULL COMMENT '预约时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `booking_service` */

insert  into `booking_service`(`id`,`username`,`contact`,`brand`,`diagnosis`,`displacement`,`model`,`year`,`status`,`reserved`,`remark`,`date`) values (1,'111','111','123',26,'123','123','2004','1',NULL,NULL,'2013-12-21'),(2,'caixi','123456','丰田',22,'2.4','凯美瑞','2004','1',NULL,NULL,'2014-12-09'),(3,'caixi','123456','丰田',22,'2.4','凯美瑞','2004','1',NULL,NULL,'2014-12-09');

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `content` varchar(3000) DEFAULT NULL COMMENT '内容',
  `author` varchar(100) DEFAULT NULL COMMENT '作者',
  `date` date DEFAULT NULL COMMENT '日期',
  `type` int(2) DEFAULT NULL COMMENT '类型',
  `replyid` bigint(16) DEFAULT NULL COMMENT '回复id',
  `permissions` varchar(100) DEFAULT NULL COMMENT '权限',
  `the_order` bigint(16) DEFAULT NULL COMMENT '顺序',
  `reserved` varchar(2) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `message` */

insert  into `message`(`id`,`title`,`content`,`author`,`date`,`type`,`replyid`,`permissions`,`the_order`,`reserved`) values (1,NULL,'服务很不错，检查很仔细，及时发现发动机比较脏，主动要求额外加了罐发动机清洗液。','晋江-陈先生','2013-04-01',2,NULL,NULL,NULL,NULL),(2,NULL,'还不错，师傅比较热心。预约后很快就安排保修。','泉州-王先生','2013-04-11',2,NULL,NULL,NULL,NULL),(3,NULL,'服务不错，师傅很耐心，下次再去:)','泉州-李先生','2013-03-06',2,NULL,NULL,NULL,NULL),(4,NULL,'态度很不错，很认真讲解车辆的保养问题。会再去。','厦门-吴先生','2013-02-14',2,NULL,NULL,NULL,NULL),(5,NULL,'保养技术不错~服务非常人性化！','泉州-李先生','2013-04-29',2,NULL,NULL,NULL,NULL),(9,NULL,'维修师傅很专业','泉州-郭先生','2013-03-13',2,NULL,NULL,NULL,NULL),(10,NULL,'很不错，赞一个','泉州-苏先生','2013-03-18',2,NULL,NULL,NULL,NULL),(11,NULL,'服务尚可，就是收费透明，维修快。','泉州江女士','2013-06-05',2,NULL,NULL,NULL,NULL),(12,NULL,'来这里做保养：1省油，如到4S店保养，汽车空调从头开到尾。2快。3不会要你换东换西。','泉州张先生','2013-06-09',2,NULL,NULL,NULL,NULL),(13,NULL,'好，事无巨细，都能认真。','晋江王先生','2013-06-12',2,NULL,NULL,NULL,NULL),(14,NULL,'那天去维修车子突然息火的问题，师傅们还是很认真地研究排查问题的根源所在，本着为客户节省的原则，先调整火花塞的点火距离，如若问题还继续存在，在考虑更换部分零件。这样好。','泉州程女士','2013-06-23',2,NULL,NULL,NULL,NULL),(15,NULL,'Q9wtSU  <a href=\"http://wlpmcxyrvomz.com/\">wlpmcxyrvomz</a>, [url=http://xtccdvhwpeju.com/]xtccdvhwpeju[/url], [link=http://aisettouiign.com/]aisettouiign[/link], http://dhweilrivqxi.com/','chotnhnu','2014-02-21',1,NULL,NULL,NULL,NULL),(16,NULL,'nagra 3 flores  tones bermanfaat forthe arecover  sildenafil cobra viagra versandapotheke viagra over the counter canada  <a href=\"http://rumtwo.gamutadvertising.com\">avis sur cialis generique</a> elaboreaza marca bertuliskan windeseile  brevard elektonik comsharon alinea  front vaughan opus  cialis safe viagra cialis y levitra viagra sandoz cialis healthy men  postsint commentsred oznaczala','AsushVanynub','2014-06-29',1,NULL,NULL,NULL,NULL),(17,NULL,'nagra 3 flores  tones bermanfaat forthe arecover  sildenafil cobra viagra versandapotheke viagra over the counter canada  <a href=\"http://rumtwo.gamutadvertising.com\">avis sur cialis generique</a> elaboreaza marca bertuliskan windeseile  brevard elektonik comsharon alinea  front vaughan opus  cialis safe viagra cialis y levitra viagra sandoz cialis healthy men  postsint commentsred oznaczala','AsushVanynub','2014-06-29',1,NULL,NULL,NULL,NULL),(18,NULL,'AIo7Z5  <a href=\"http://dqwrgzbvncna.com/\">dqwrgzbvncna</a>, [url=http://dwhygnhpxhsj.com/]dwhygnhpxhsj[/url], [link=http://uesygqpxfsvr.com/]uesygqpxfsvr[/link], http://hkrmvghccona.com/','mgkkow','2014-08-30',2,NULL,NULL,NULL,NULL),(19,NULL,'mizsgogry, <a href=\"http://www.ckhsuqemxy.com/\">bqxwfbrlht</a> , [url=http://www.gqltunixbk.com/]gebyrsafoe[/url], http://www.eicabyaptd.com/ bqxwfbrlht','qwdpptgimw','2014-11-01',2,NULL,NULL,NULL,NULL),(20,NULL,'qxeewogry, <a href=\"http://www.dmjialutfv.com/\">jgqhtsxozi</a>','wrlzsiisxz','2014-11-04',2,NULL,NULL,NULL,NULL),(21,NULL,'azcjgogry, http://www.bulsncpojj.com/ jxssgrsvly','nmwoaqgnkn','2014-11-08',2,NULL,NULL,NULL,NULL),(22,NULL,'xpynwogry, http://www.svvaituwrq.com/ cdozouatye','nehqtfjegu','2014-11-10',2,NULL,NULL,NULL,NULL),(23,NULL,'test','test','2014-12-09',1,NULL,NULL,NULL,NULL);

/*Table structure for table `message_log` */

DROP TABLE IF EXISTS `message_log`;

CREATE TABLE `message_log` (
  `log_id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '日志id',
  `workflow_id` bigint(16) NOT NULL COMMENT '工作流id',
  `id` bigint(16) NOT NULL COMMENT '主表id',
  `title` varchar(100) DEFAULT NULL COMMENT 'title',
  `content` varchar(3000) DEFAULT NULL COMMENT '内容',
  `author` varchar(100) DEFAULT NULL COMMENT '作者',
  `date` date DEFAULT NULL COMMENT '日期',
  `type` int(2) DEFAULT NULL COMMENT '类型',
  `replyid` bigint(16) DEFAULT NULL COMMENT '回复id',
  `permissions` varchar(100) DEFAULT NULL COMMENT '权限',
  `order` bigint(16) DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_log` */

/*Table structure for table `message_workflow` */

DROP TABLE IF EXISTS `message_workflow`;

CREATE TABLE `message_workflow` (
  `workflow_id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '工作流id',
  `id` bigint(16) DEFAULT NULL COMMENT '主表id',
  `title` varchar(100) DEFAULT NULL COMMENT 'title',
  `content` varchar(3000) DEFAULT NULL COMMENT '内容',
  `author` varchar(100) DEFAULT NULL COMMENT '作者',
  `date` date DEFAULT NULL COMMENT '日期',
  `type` int(2) DEFAULT NULL COMMENT '类型',
  `replyid` bigint(16) DEFAULT NULL COMMENT '回复id',
  `permissions` varchar(100) DEFAULT NULL COMMENT '权限',
  `order` bigint(16) DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`workflow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_workflow` */

/*Table structure for table `reservation_item` */

DROP TABLE IF EXISTS `reservation_item`;

CREATE TABLE `reservation_item` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fid` bigint(16) DEFAULT NULL COMMENT '父ID',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `status` varchar(100) DEFAULT NULL COMMENT '状态',
  `type` varchar(1) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;

/*Data for the table `reservation_item` */

insert  into `reservation_item`(`id`,`fid`,`name`,`description`,`status`,`type`) values (-1,-1,'直接预约维修',NULL,NULL,NULL),(1,NULL,'感觉-我觉得它（如震动等）',NULL,NULL,'1'),(2,NULL,'看到-我看到它（如汽油泄漏，警示灯）',NULL,NULL,'1'),(3,NULL,'气味-我闻到它（如臭味等）',NULL,NULL,'1'),(4,NULL,'听到-我听到它(如尖叫）',NULL,NULL,'1'),(5,NULL,'电器异常',NULL,NULL,'2'),(6,NULL,'耗油异常',NULL,NULL,'2'),(7,NULL,'空调异常','',NULL,'2'),(8,NULL,'排气异常',NULL,NULL,'2'),(9,NULL,'启动异常',NULL,NULL,'2'),(10,NULL,'刹车异常',NULL,NULL,'2'),(11,NULL,'渗漏现象',NULL,NULL,'2'),(12,NULL,'提速异常',NULL,NULL,'2'),(13,NULL,'温度异常',NULL,NULL,'2'),(14,NULL,'异常气味',NULL,NULL,'2'),(15,NULL,'异响问题',NULL,NULL,'2'),(16,NULL,'转向异常',NULL,NULL,'2'),(17,1,'打方向时有虚位','您有什么感觉',NULL,'3'),(18,1,'低速到高速提速困难','您有什么感觉',NULL,'3'),(19,1,'低速和高速方向抖','您有什么感觉',NULL,'3'),(20,1,'低速时方向抖','您有什么感觉',NULL,'3'),(21,1,'低速提速困难','您有什么感觉',NULL,'3'),(22,1,'高速时方向抖','您有什么感觉',NULL,'3'),(23,1,'高速提速困难','您有什么感觉',NULL,'3'),(24,1,'静止时方向重','您有什么感觉',NULL,'3'),(25,1,'起步提速困难','您有什么感觉',NULL,'3'),(26,1,'刹车偏软','您有什么感觉',NULL,'3'),(27,1,'刹车偏硬','您有什么感觉',NULL,'3'),(28,1,'刹车时抖动','您有什么感觉',NULL,'3'),(29,1,'刹车时偏右','您有什么感觉',NULL,'3'),(30,1,'刹车时偏左','您有什么感觉',NULL,'3'),(31,1,'行驶时方向重','您有什么感觉',NULL,'3'),(32,1,'行驶中偏右','您有什么感觉',NULL,'3'),(33,1,'行驶中偏左','您有什么感觉',NULL,'3'),(34,1,'制动力不够','您有什么感觉',NULL,'3'),(35,2,'变速箱漏油','您看到什么？',NULL,'3'),(36,2,'差速器漏油','您看到什么？',NULL,'3'),(37,2,'发动机漏水','您看到什么？',NULL,'3'),(38,2,'发动机漏油','您看到什么？',NULL,'3'),(39,2,'方向助力系统漏油','您看到什么？',NULL,'3'),(40,2,'空调管渗漏','您看到什么？',NULL,'3'),(41,2,'排气管冒白烟','您看到什么？',NULL,'3'),(42,2,'排气管冒黑烟','您看到什么？',NULL,'3'),(43,2,'排气管冒蓝烟','您看到什么？',NULL,'3'),(44,2,'燃油管渗漏','您看到什么？',NULL,'3'),(45,2,'刹车系统漏油','您看到什么？',NULL,'3'),(46,2,'水箱漏水','您看到什么？',NULL,'3'),(47,2,'水箱水管漏水','您看到什么？',NULL,'3'),(48,2,'油箱渗漏','您看到什么？',NULL,'3'),(49,3,'废气味','您闻到什么气味',NULL,'3'),(50,3,'焦味','您闻到什么气味',NULL,'3'),(51,3,'霉味','您闻到什么气味',NULL,'3'),(52,3,'汽油味','您闻到什么气味',NULL,'3'),(53,4,'变速箱异响','您听到什么',NULL,'3'),(54,4,'车身内部异响','您听到什么',NULL,'3'),(55,4,'车身中部异响','您听到什么',NULL,'3'),(56,4,'发动机异响','您听到什么',NULL,'3'),(57,4,'发动机噪音大','您听到什么',NULL,'3'),(58,4,'后底盘异响','您听到什么',NULL,'3'),(59,4,'后门异响','您听到什么',NULL,'3'),(60,4,'前车身异响','您听到什么',NULL,'3'),(61,4,'前底盘异响','您听到什么',NULL,'3'),(62,4,'前门异响','您听到什么',NULL,'3'),(63,5,'车内灯具不亮或亮度不够','电器异常',NULL,'4'),(64,5,'灯光失效','电器异常',NULL,'4'),(65,5,'电动升降窗失效','电器异常',NULL,'4'),(66,5,'防盗失效','电器异常',NULL,'4'),(67,5,'各种开关失效','电器异常',NULL,'4'),(68,5,'后部灯具不亮或亮度不够','电器异常',NULL,'4'),(69,5,'喇叭不响或音量不够','电器异常',NULL,'4'),(70,5,'前部灯具不亮或亮度不够','电器异常',NULL,'4'),(71,5,'闪光失效','电器异常',NULL,'4'),(72,5,'雨刮失效','电器异常',NULL,'4'),(73,5,'自动门锁失效','电器异常',NULL,'4'),(74,6,'低速时油耗偏高','耗油异常',NULL,'4'),(75,6,'高速时油耗偏高','耗油异常',NULL,'4'),(76,6,'换机油后油耗偏高','耗油异常',NULL,'4'),(77,6,'开空调时油耗偏高','耗油异常',NULL,'4'),(78,6,'新加燃油后油耗偏高','耗油异常',NULL,'4'),(79,7,'不制冷','空调异常',NULL,'4'),(80,7,'风口出水雾','空调异常',NULL,'4'),(81,7,'开空调有异味','空调异常',NULL,'4'),(82,7,'空调不送风','空调异常',NULL,'4'),(83,7,'空调结冰','空调异常',NULL,'4'),(84,7,'空调送风量不够','空调异常',NULL,'4'),(85,7,'制冷不够','空调异常',NULL,'4'),(86,8,'排气管过响','排气异常',NULL,'4'),(87,8,'排气管冒白烟','排气异常',NULL,'4'),(88,8,'排气管冒黑烟','排气异常',NULL,'4'),(89,8,'排气管冒蓝烟','排气异常',NULL,'4'),(90,9,'冷车时启动困难','启动异常',NULL,'4'),(91,9,'热车后启动困难','启动异常',NULL,'4'),(92,9,'斜坡上启动困难','启动异常',NULL,'4'),(93,9,'异常死火后启动困难','启动异常',NULL,'4'),(94,10,'ABS功能失效','刹车异常',NULL,'4'),(95,10,'刹车偏软','刹车异常',NULL,'4'),(96,10,'刹车偏硬','刹车异常',NULL,'4'),(97,10,'刹车时抖动','刹车异常',NULL,'4'),(98,10,'刹车时偏右','刹车异常',NULL,'4'),(99,10,'刹车时偏左','刹车异常',NULL,'4'),(100,10,'制动力不够','刹车异常',NULL,'4'),(101,11,'变速箱漏油','渗漏现象',NULL,'4'),(102,11,'差速器漏油','渗漏现象',NULL,'4'),(103,11,'发动机漏水','渗漏现象',NULL,'4'),(104,11,'发动机漏油','渗漏现象',NULL,'4'),(105,11,'方向助力系统漏油','渗漏现象',NULL,'4'),(106,11,'空调管渗漏','渗漏现象',NULL,'4'),(107,11,'燃油管渗漏','渗漏现象',NULL,'4'),(108,11,'刹车系统漏油','渗漏现象',NULL,'4'),(109,11,'水箱漏水','渗漏现象',NULL,'4'),(110,11,'水箱水管漏水','渗漏现象',NULL,'4'),(111,11,'油箱渗漏','渗漏现象',NULL,'4'),(112,12,'低速到高速提速困难','提速异常',NULL,'4'),(113,12,'低速提速困难','提速异常',NULL,'4'),(114,12,'高速提速困难','提速异常',NULL,'4'),(115,12,'冷车时提速困难','提速异常',NULL,'4'),(116,12,'起步提速困难','提速异常',NULL,'4'),(117,12,'水温高时提速困难','提速异常',NULL,'4'),(118,13,'低速时水温高','温度异常',NULL,'4'),(119,13,'高速时水温高','温度异常',NULL,'4'),(120,13,'开空调时水温高','温度异常',NULL,'4'),(121,13,'停车等候时水温高','温度异常',NULL,'4'),(122,13,'行驶超过半小时水温高','温度异常',NULL,'4'),(123,14,'废气味','异常气味',NULL,'4'),(124,14,'焦味','异常气味',NULL,'4'),(125,14,'霉味','异常气味',NULL,'4'),(126,14,'汽油味','异常气味',NULL,'4'),(127,15,'变速箱异响','异响问题',NULL,'4'),(128,15,'车身内部异响','异响问题',NULL,'4'),(129,15,'车身中部异响','异响问题',NULL,'4'),(130,15,'发动机异响','异响问题',NULL,'4'),(131,15,'发动机噪音大','异响问题',NULL,'4'),(132,15,'后车身异响','异响问题',NULL,'4'),(133,15,'后底盘异响','异响问题',NULL,'4'),(134,15,'后门异响','异响问题',NULL,'4'),(135,15,'前车身异响','异响问题',NULL,'4'),(136,15,'前底盘异响','异响问题',NULL,'4'),(137,15,'前门异响','异响问题',NULL,'4'),(138,16,'打方向时有虚位','转向异常',NULL,'4'),(139,16,'低速和高速方向抖','转向异常',NULL,'4'),(140,16,'低速时方向抖','转向异常',NULL,'4'),(141,16,'高速时方向抖','转向异常',NULL,'4'),(142,16,'静止时方向重','转向异常',NULL,'4'),(143,16,'行驶时方向重','转向异常',NULL,'4'),(144,16,'行驶中偏右','转向异常',NULL,'4'),(145,16,'行驶中偏左','转向异常',NULL,'4'),(146,16,'转弯半径变大','转向异常',NULL,'4'),(147,16,'转弯半径变小','转向异常',NULL,'4');

/*Table structure for table `sys_approval` */

DROP TABLE IF EXISTS `sys_approval`;

CREATE TABLE `sys_approval` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `process_id` bigint(16) DEFAULT NULL COMMENT '流程id',
  `name` varchar(50) DEFAULT NULL COMMENT '审批标题',
  `step` int(2) DEFAULT NULL COMMENT '审批步骤',
  `permissions` varchar(50) DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_approval` */

/*Table structure for table `sys_business` */

DROP TABLE IF EXISTS `sys_business`;

CREATE TABLE `sys_business` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) DEFAULT NULL COMMENT '业务类型',
  `name` varchar(50) DEFAULT NULL COMMENT '业务名称',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_business` */

/*Table structure for table `sys_encoding` */

DROP TABLE IF EXISTS `sys_encoding`;

CREATE TABLE `sys_encoding` (
  `id` bigint(20) NOT NULL,
  `field_name` varchar(30) NOT NULL,
  `field_value` varchar(50) NOT NULL,
  `coding_value` varchar(50) NOT NULL,
  `reserved` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_encoding` */

insert  into `sys_encoding`(`id`,`field_name`,`field_value`,`coding_value`,`reserved`) values (1,'testcode1','code1','value1',NULL),(2,'testcode1','code2','value2',NULL),(3,'testcode2','code1','value1',NULL),(4,'testcode2','code2','value2',NULL),(11,'gender','1','男',NULL),(12,'gender','2','女',NULL),(22,'truefalse','1','是',NULL),(23,'truefalse','0','否',NULL),(24,'reservationStatus','1','预约成功',NULL),(25,'reservationStatus','2','已处理',NULL),(26,'reservationStatus','3','已完成',NULL),(27,'reservationStatus','0','作废',NULL);

/*Table structure for table `sys_files` */

DROP TABLE IF EXISTS `sys_files`;

CREATE TABLE `sys_files` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(100) DEFAULT NULL COMMENT '文件名',
  `description` varchar(300) DEFAULT NULL COMMENT '描述',
  `path` varchar(500) DEFAULT NULL COMMENT '文件路径',
  `pdfpath` varchar(500) DEFAULT NULL COMMENT 'pdf文件路径',
  `type` int(2) DEFAULT NULL COMMENT '文件类型',
  `related_description` varchar(300) DEFAULT NULL COMMENT '关联描述',
  `related_object` bigint(15) DEFAULT NULL COMMENT '关联对象',
  `date` date DEFAULT NULL COMMENT '上传时间',
  `operator` varchar(100) DEFAULT NULL COMMENT '操作者',
  `is_primary` int(1) DEFAULT NULL COMMENT '关联对象首选文件',
  `reserved` varchar(10) DEFAULT NULL COMMENT '预留字段',
  `webpath` varchar(500) DEFAULT NULL COMMENT '网站地址',
  PRIMARY KEY (`id`),
  KEY `IND_FILES_TYPE_RELATEDID` (`type`,`related_object`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_files` */

/*Table structure for table `sys_module` */

DROP TABLE IF EXISTS `sys_module`;

CREATE TABLE `sys_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '模块ID',
  `fid` bigint(20) NOT NULL COMMENT '父节点ID',
  `name` varchar(30) NOT NULL COMMENT '节点名称',
  `address` varchar(150) DEFAULT NULL COMMENT '节点链接地址',
  `title` varchar(50) DEFAULT NULL COMMENT '节点标题',
  `target` varchar(200) DEFAULT NULL COMMENT '节点提示',
  `icon` varchar(150) DEFAULT NULL COMMENT '节点图标',
  `iconOpen` varchar(150) DEFAULT NULL COMMENT '节点打开图标',
  `reserved` varchar(50) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8;

/*Data for the table `sys_module` */

insert  into `sys_module`(`id`,`fid`,`name`,`address`,`title`,`target`,`icon`,`iconOpen`,`reserved`) values (1,0,'预约维修',NULL,'预约维修',NULL,NULL,NULL,NULL),(100,0,'系统管理','','系统管理',NULL,NULL,NULL,NULL),(101,100,'模块管理','pages/framework/sysmanager/module.html','模块管理',NULL,NULL,NULL,NULL),(102,100,'角色管理','pages/framework/sysmanager/role.html','角色管理',NULL,NULL,NULL,NULL),(103,100,'用户管理','pages/framework/sysmanager/user.html','用户管理',NULL,NULL,NULL,NULL),(104,100,'测试模块','pages/module/test.html','测试模块',NULL,NULL,NULL,NULL),(138,100,'修改密码','pages/framework/login/modifyPwd.html','修改密码',NULL,NULL,NULL,NULL),(139,100,'新增用户','pages/module/system/addUser.html','新增用户',NULL,NULL,NULL,NULL),(144,1,'预约记录','pages/module/reservation/reservation.html','预约记录',NULL,NULL,NULL,NULL);

/*Table structure for table `sys_param` */

DROP TABLE IF EXISTS `sys_param`;

CREATE TABLE `sys_param` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(100) DEFAULT NULL COMMENT '编码值',
  `value` varchar(5000) DEFAULT NULL COMMENT '参数值',
  `available` int(1) DEFAULT NULL COMMENT '是否可用',
  `description` varchar(500) DEFAULT NULL COMMENT '参数说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_param` */

/*Table structure for table `sys_permissions` */

DROP TABLE IF EXISTS `sys_permissions`;

CREATE TABLE `sys_permissions` (
  `roleid` bigint(20) NOT NULL COMMENT '角色ID',
  `moduleid` bigint(20) NOT NULL COMMENT '模块ID',
  `description` varchar(250) DEFAULT NULL COMMENT '描述',
  `reserved` varchar(50) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`roleid`,`moduleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_permissions` */

insert  into `sys_permissions`(`roleid`,`moduleid`,`description`,`reserved`) values (1,1,NULL,NULL),(1,100,NULL,NULL),(1,101,NULL,NULL),(1,102,NULL,NULL),(1,103,NULL,NULL),(1,104,NULL,NULL),(1,138,NULL,NULL),(1,139,NULL,NULL),(1,144,NULL,NULL),(2,1,NULL,NULL),(2,100,NULL,NULL),(2,103,NULL,NULL),(2,138,NULL,NULL),(2,139,NULL,NULL),(2,144,NULL,NULL),(3,1,NULL,NULL),(3,100,NULL,NULL),(3,138,NULL,NULL),(3,144,NULL,NULL);

/*Table structure for table `sys_process` */

DROP TABLE IF EXISTS `sys_process`;

CREATE TABLE `sys_process` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `business_id` bigint(16) DEFAULT NULL COMMENT '业务id',
  `name` varchar(50) DEFAULT NULL COMMENT '流程名',
  `action` varchar(200) DEFAULT NULL COMMENT '执行类',
  `method` varchar(200) DEFAULT NULL COMMENT '执行方法',
  `step` int(2) DEFAULT NULL COMMENT '执行步骤',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_process` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `roleid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rolename` varchar(20) NOT NULL COMMENT '角色名称',
  `reserved` varchar(50) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`roleid`),
  UNIQUE KEY `ROLENAME_UNIQUE` (`rolename`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

insert  into `sys_role`(`roleid`,`rolename`,`reserved`) values (1,'root','0'),(2,'admin',NULL),(3,'nfqx',NULL);

/*Table structure for table `sys_sequence_simulator` */

DROP TABLE IF EXISTS `sys_sequence_simulator`;

CREATE TABLE `sys_sequence_simulator` (
  `val` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`val`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_sequence_simulator` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `pwd` varchar(80) NOT NULL COMMENT '密码',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `reserved` varchar(50) DEFAULT NULL COMMENT '预留字段',
  `joinedTime` date NOT NULL COMMENT '注册时间',
  `lastLoginTime` date DEFAULT NULL COMMENT '最后登陆时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `USERNAME_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`uid`,`username`,`pwd`,`role_id`,`reserved`,`joinedTime`,`lastLoginTime`) values (1,'root','63A9F0EA7BB98050796B649E85481845',1,'0','2012-07-01','2013-12-21'),(2,'sll','202CB962AC59075B964B07152D234B70',2,NULL,'2013-05-15','2013-10-20'),(3,'nfqx','21218CCA77804D2BA1922C33E0151105',3,NULL,'2013-12-21','2013-12-21');

/*Table structure for table `sys_workflow` */

DROP TABLE IF EXISTS `sys_workflow`;

CREATE TABLE `sys_workflow` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `business_id` bigint(16) DEFAULT NULL COMMENT '业务id',
  `process_id` bigint(16) DEFAULT NULL COMMENT '流程id',
  `approval_id` bigint(16) DEFAULT NULL COMMENT '审批id',
  `status` int(1) DEFAULT NULL COMMENT '审核状态',
  `application_time` date DEFAULT NULL COMMENT '申请时间',
  `processing_time` date DEFAULT NULL COMMENT '最后处理时间',
  `completion_time` date DEFAULT NULL COMMENT '完成时间',
  `operator` varchar(100) DEFAULT NULL COMMENT '操作者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_workflow` */

/*Table structure for table `sys_workflow_log` */

DROP TABLE IF EXISTS `sys_workflow_log`;

CREATE TABLE `sys_workflow_log` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '日志id',
  `workflow_id` bigint(16) NOT NULL COMMENT '主表id',
  `business_id` bigint(16) DEFAULT NULL COMMENT '业务id',
  `process_id` bigint(16) DEFAULT NULL COMMENT '流程id',
  `approval_id` bigint(16) DEFAULT NULL COMMENT '审批id',
  `status` int(1) DEFAULT NULL COMMENT '审核状态',
  `application_time` date DEFAULT NULL COMMENT '申请时间',
  `processing_time` date DEFAULT NULL COMMENT '最后处理时间',
  `completion_time` date DEFAULT NULL COMMENT '完成时间',
  `operator` varchar(100) DEFAULT NULL COMMENT '操作者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_workflow_log` */

/*Table structure for table `vehicle_renewal` */

DROP TABLE IF EXISTS `vehicle_renewal`;

CREATE TABLE `vehicle_renewal` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `vin` varchar(100) DEFAULT NULL COMMENT '车架号',
  `engine_number` varchar(100) DEFAULT NULL COMMENT '发动机号',
  `plate_number` varchar(100) DEFAULT NULL COMMENT '车牌号',
  `transfer_vehicle` varchar(1) DEFAULT NULL COMMENT '是否过户车辆',
  `loan_vehicles` varchar(1) DEFAULT NULL COMMENT '是否贷款车辆',
  `vehicle_models` varchar(50) DEFAULT NULL COMMENT '型号',
  `brand` varchar(50) DEFAULT NULL COMMENT '品牌',
  `contact` varchar(100) DEFAULT NULL COMMENT '联系人姓名',
  `email` varchar(100) DEFAULT NULL COMMENT 'email',
  `phone` varchar(30) DEFAULT NULL COMMENT '手机',
  `date` date DEFAULT NULL COMMENT '登记日期',
  `purchase_date` date DEFAULT NULL COMMENT '购买日期',
  `effective_date` date DEFAULT NULL COMMENT '保单生效日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehicle_renewal` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
