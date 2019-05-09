/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.24-log : Database - amp_db
*********************************************************************
*/
DROP DATABASE IF EXISTS app_db;
CREATE DATABASE app_db DEFAULT CHARACTER SET utf8mb4;
USE app_db;

DROP TABLE IF EXISTS sys_admin;
CREATE TABLE sys_admin (
  admin_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '后台管理主键',
  admin_no VARCHAR(255) NOT NULL COMMENT '管理人员编号',
  admin_name VARCHAR(255) NOT NULL COMMENT '管理人员姓名',
  PASSWORD VARCHAR(500) NOT NULL COMMENT '登录密码',
  role_id INT(10) NOT NULL COMMENT '管理员角色',
  create_admin INT(10) NOT NULL COMMENT '添加人',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  update_admin INT(10) NOT NULL COMMENT '修改人',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (admin_id)
) ENGINE=INNODB CHARSET=utf8mb4 COMMENT='管理员信息表';
INSERT INTO sys_admin(admin_no, admin_name, PASSWORD, role_id, create_admin, update_admin) VALUES ('AD000001', '王大锤', '21232f297a57a5a743894a0e4a801fc3', 1, 1, 1);


DROP TABLE IF EXISTS sys_app_info;
CREATE TABLE sys_app_info (
  app_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  app_name VARCHAR(255) NOT NULL COMMENT '名称',
  dev_id INT(10) NOT NULL COMMENT '开发人',
  category_id INT(10) NOT NULL COMMENT '类别',
  logo VARCHAR(500) NOT NULL COMMENT 'app图标',
  app_info VARCHAR(500) NOT NULL COMMENT '简介',
  platform_id INT(10) NOT NULL COMMENT '使用平台',
  examine INT(10) NOT NULL COMMENT '审核状态',
  STATUS INT(10) DEFAULT NULL COMMENT 'app状态',
  checker INT(10) NOT NULL COMMENT '审核人',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (app_id)
) ENGINE=INNODB CHARSET=utf8mb4;


DROP TABLE IF EXISTS sys_category;
CREATE TABLE sys_category (
  category_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  category_code VARCHAR(255) NOT NULL COMMENT '编号',
  category_name VARCHAR(255) NOT NULL COMMENT '类别名称',
  create_admin INT(10) NOT NULL COMMENT '创建人',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_admin INT(10) NOT NULL COMMENT '修改人',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (category_id)
) ENGINE=INNODB CHARSET=utf8mb4;

INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('sale', '购物比价', 1, 1 );
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('entertainment', '影音娱乐', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('tools', '实用工具', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('convenience', '便捷生活', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('tour', '旅游住宿', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('photo', '拍摄美化', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('news', '新闻阅读', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('intercourse', '社交通讯', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('finance', '金融理财', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('education', '教育', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('navigation', '出行导航', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('food', '美食', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('vehicle', '汽车', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('business', '商务', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('children', '儿童', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('health', '运动健康', 1, 1);
INSERT INTO sys_category(category_code, category_name, create_admin, update_admin) VALUES ('theme', '主题个性', 1, 1);


DROP TABLE IF EXISTS sys_dev;
CREATE TABLE sys_dev (
  dev_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  dev_no VARCHAR(255) NOT NULL COMMENT '编号',
  dev_name VARCHAR(255) NOT NULL COMMENT '姓名',
  PASSWORD VARCHAR(500) NOT NULL COMMENT '登录密码',
  cellphone VARCHAR(100) NOT NULL COMMENT '联系电话',
  email VARCHAR(500) NOT NULL COMMENT '电子邮件',
  dev_info VARCHAR(500) NOT NULL COMMENT '开发人员简介',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (dev_id)
) ENGINE=INNODB CHARSET=utf8mb4;


DROP TABLE IF EXISTS sys_dictionary;
CREATE TABLE sys_dictionary (
  dictionary_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  parent_id INT(10) NOT NULL COMMENT '上级字典',
  dictionary_name VARCHAR(255) NOT NULL COMMENT '字典名称',
  create_admin INT(10) NOT NULL COMMENT '创建人',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_admin INT(10) NOT NULL COMMENT '更信任',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (dictionary_id)
) ENGINE=INNODB CHARSET=utf8mb4;
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(0, 'APP状态', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(0, '所属平台', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(0, '是否上架', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(1, '待审核', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(1, '审核通过', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(1, '审核未通过', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(2, '手机', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(2, '平板', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(2, '通用', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(3, '已上架', 1, 1);
INSERT INTO sys_dictionary(parent_id, dictionary_name, create_admin, update_admin) VALUES(3, '已下架', 1, 1);


DROP TABLE IF EXISTS sys_role;
CREATE TABLE sys_role (
  role_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  role_name VARCHAR(255) NOT NULL COMMENT '角色名称',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (role_id)
) ENGINE=INNODB CHARSET=utf8mb4;
INSERT INTO sys_role(role_name) VALUES ('管理员');
INSERT INTO sys_role(role_name) VALUES ('审核员');


DROP TABLE IF EXISTS sys_version;
CREATE TABLE sys_version (
  version_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  app_id INT(10) NOT NULL COMMENT '软件信息',
  apk_name VARCHAR(500) NOT NULL COMMENT '开发包名称',
  support_rom VARCHAR(255) NOT NULL COMMENT '硬件支持',
  software_size DOUBLE(10, 2) NOT NULL COMMENT '软件大小',
  download_link VARCHAR(500) NOT NULL COMMENT '下载地址',
  examine INT(10) NOT NULL COMMENT '审核状态',
  STATUS INT(10) DEFAULT NULL COMMENT 'app状态',
  checker INT(10) NOT NULL COMMENT '审核人',
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (version_id)
) ENGINE=INNODB CHARSET=utf8mb4;