#这是一个Demo项目


1、springMVC整合mybitis
2、配置加载静态资源
3、配置声明式事务
4、集成mysql数据库操作（加载数据源）
5、配置spring扫描器/AOP
6、配置log4j日志

加载demo加载数据到JSP页面

数据库表：

CREATE TABLE `users` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `users` VALUES ('1', '张三', '123');