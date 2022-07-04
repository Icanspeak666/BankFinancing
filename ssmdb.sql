SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员账户  主键id',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员用户名',
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录密码',
  `status` int(10) NULL DEFAULT NULL COMMENT '登录状态（0：离线   1：在线）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin', 1);

-- ----------------------------
-- Table structure for bank
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自动递增',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行名称',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行类型',
  `assets` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资产',
  `bankDesc` varchar(20000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES (1, '中国工商银行', '商业银行', '250000亿人民币', '中国工商银行');
INSERT INTO `bank` VALUES (2, '中国建设银行', '商业银行', '300000亿人民币', '中国建设银行');
INSERT INTO `bank` VALUES (3, '中国民生银行', '股份制商业银行', '800000亿人民币', '中国民生银行');
INSERT INTO `bank` VALUES (4, '中国银行', '123456', '8000000', '123');

-- ----------------------------
-- Table structure for bankcard
-- ----------------------------
DROP TABLE IF EXISTS `bankcard`;
CREATE TABLE `bankcard`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '银行卡编号 主键自增',
  `cardBank` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行卡所属银行',
  `type` int(10) NULL DEFAULT NULL COMMENT '银行卡类型（1：借记卡  2：信用卡）',
  `cardNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行卡号',
  `userId` int(10) NULL DEFAULT NULL COMMENT '银行卡所属用户',
  `balance` decimal(15, 2) NULL DEFAULT NULL COMMENT '金额',
  `defaultl` int(10) NULL DEFAULT NULL COMMENT '是否默认（1；默认，2；不默认）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '银行卡表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bankcard
-- ----------------------------
INSERT INTO `bankcard` VALUES (4, '2', 2, '123456789554482', 5, 10000.00, 2);
INSERT INTO `bankcard` VALUES (5, '1', 1, '123456712345482', 7, 20000.00, 1);
INSERT INTO `bankcard` VALUES (6, '3', 2, '12548954856215549', 5, 100000.00, 1);
INSERT INTO `bankcard` VALUES (7, '3', 2, '12548954856211524', 5, 5000.00, 1);
INSERT INTO `bankcard` VALUES (8, '1', 1, '12548954856215549', 5, 100000.00, 1);
INSERT INTO `bankcard` VALUES (9, '1', 1, '44151321034534814', 4, 100000000.00, 1);
INSERT INTO `bankcard` VALUES (10, '1', 1, '44151321034534834', 4, 100000000.00, 1);

-- ----------------------------
-- Table structure for fund_product
-- ----------------------------
DROP TABLE IF EXISTS `fund_product`;
CREATE TABLE `fund_product`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '基金理财产品  主键id',
  `type` int(10) NULL DEFAULT NULL COMMENT '基金类型(1:股票型基金  2:债券型基金  3:货币型基金  4:混合型基金)',
  `code` int(10) NULL DEFAULT NULL COMMENT '基金代码',
  `fundDesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基金简称',
  `dailyGrowth` decimal(10, 8) NULL DEFAULT NULL COMMENT '日增长率',
  `leastMoney` decimal(10, 2) NULL DEFAULT NULL COMMENT '起投金额',
  `profit` decimal(10, 2) NULL DEFAULT NULL COMMENT '收益',
  `invesTerm` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投资期限',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of fund_product
-- ----------------------------
INSERT INTO `fund_product` VALUES (3, 1, 143745, '广发多元新兴股票', 0.00040000, 3000.00, 108.00, '90');
INSERT INTO `fund_product` VALUES (4, 4, 519933, '长信利发债券', 0.00050000, 5000.00, 450.00, '180');
INSERT INTO `fund_product` VALUES (5, 3, 665176, '比特币', 0.00050000, 10000.00, 800.00, '300');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id 主键自增',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `realname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `IDcard` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `paypwd` int(40) NULL DEFAULT NULL COMMENT '交易密码',
  `status` int(10) NULL DEFAULT NULL COMMENT '用户状态（0：离线   1：在线）',
  `reputation` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户信誉',
  PRIMARY KEY (`id`, `username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (4, 'zhangsan', NULL, '123456', '114514', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (5, 'zhaosi', NULL, '123456', NULL, NULL, '123456@qq.com', NULL, NULL, NULL);
INSERT INTO `user` VALUES (6, 'qianwu', NULL, '123456', '9527', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (7, 'sunliu', NULL, '123456', '654321', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (8, 'niuda', NULL, '123456', '159357', NULL, '123456@163.com', NULL, NULL, NULL);
INSERT INTO `user` VALUES (9, 'lihua', NULL, '123', NULL, NULL, '123@11.com', NULL, NULL, NULL);
INSERT INTO `user` VALUES (10, 'xiaoming', NULL, '1234', '115544', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (11, 'wuda', NULL, '123456', NULL, NULL, '190@qq.com', NULL, NULL, NULL);
INSERT INTO `user` VALUES (13, 'hyz', NULL, '123456', NULL, NULL, '190560@qq.com', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user_fund_product
-- ----------------------------
DROP TABLE IF EXISTS `user_fund_product`;
CREATE TABLE `user_fund_product`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户-基金理财 投资表id 主键 自增',
  `userId` int(10) NULL DEFAULT NULL COMMENT '用户id',
  `fundId` int(10) NULL DEFAULT NULL COMMENT '基金产品id',
  `startTime` datetime NULL DEFAULT NULL COMMENT '起投时间',
  `endTime` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `status` int(10) NULL DEFAULT NULL COMMENT '投资状态（1：持有中  2：已失效  3：已撤销）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_fund_product
-- ----------------------------
INSERT INTO `user_fund_product` VALUES (5, 5, 4, '2022-05-02 14:37:47', '2022-05-03 14:37:47', 1);
INSERT INTO `user_fund_product` VALUES (6, 7, 3, '2022-05-02 18:37:47', '2022-05-03 18:37:47', 1);
INSERT INTO `user_fund_product` VALUES (7, 4, 4, '2022-05-03 14:00:00', '2022-05-06 14:00:00', 1);
INSERT INTO `user_fund_product` VALUES (8, 13, 3, '2022-05-08 00:00:00', '2022-05-08 00:00:00', 1);

SET FOREIGN_KEY_CHECKS = 1;
