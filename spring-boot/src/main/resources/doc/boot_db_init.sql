drop database if exists boot_db;
create database boot_db;
use boot_db;
CREATE TABLE `sys_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `userName` varchar(255) NOT NULL DEFAULT '' COMMENT '用户姓名',
  `gender` varchar(11) NOT NULL DEFAULT '' COMMENT '性别',
  `cellphone` varchar(100) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;