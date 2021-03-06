SET FOREIGN_KEY_CHECKS=0;



DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL COMMENT '品牌名称',
  `industry` varchar(64) DEFAULT NULL COMMENT '主营行业',
  `nation_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '品牌发源地，0代表无品牌发源地',
  `brand_description` text COMMENT '品牌描述',
  `brand_logo` varchar(1024) DEFAULT NULL COMMENT '品牌LOGO',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否已删除，0代表未删除，1代表已删除',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `review` int(11) NOT NULL DEFAULT '0' COMMENT '品牌信息是否已被审核，0代表已审核，1代表未审核',
  `design_img` varchar(1024) DEFAULT NULL COMMENT '品牌设计图',
  `story` text COMMENT '品牌故事',
  `on_sale_sku_count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `name_review_index` (`name`,`review`,`is_delete`) USING BTREE,
  KEY `name_index` (`name`,`is_delete`) USING BTREE,
  KEY `id_index` (`id`,`is_delete`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1335 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='品牌表';



DROP TABLE if EXISTS 'category';
CREATE TABLE `category` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(128) NOT NULL COMMENT '类目名称',
  `parent_id` bigint(20) unsigned DEFAULT NULL COMMENT '父类ID',
  `parent_name` varchar(128) DEFAULT NULL COMMENT '父类名称',
  `root_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '类目的根类目ID',
  `root_name` varchar(128) DEFAULT NULL COMMENT '类目的根类目名称',
  `customs_category_code` varchar(128) DEFAULT NULL COMMENT '税号',
  `tax_rate` varchar(128) DEFAULT NULL COMMENT '税率',
  `minimum_scope` int(11) DEFAULT NULL COMMENT '分类所属范围的最小值',
  `maximum_scope` int(11) DEFAULT NULL COMMENT '分类所属范围的最大值',
  `default_shipping_fee` decimal(11,2) DEFAULT NULL COMMENT '默认运费',
  `profitmargi` decimal(11,2) DEFAULT NULL COMMENT '毛利率',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否已删除，0代表未删除，1代表已删除',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `leaf_node` tinyint(1) NOT NULL DEFAULT '0' COMMENT '该类目是否为叶子节点,0不是叶子节点，1是叶子节点，默认值为0',
  `is_view` tinyint(1) NOT NULL DEFAULT '1' COMMENT '该类目是否可见，0代表不可见，1代表可见，默认值为1',
  `secondary_category_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '该类目所属的二级类目ID，若该类目为二级类目及以上，该值为默认值0',
  `secondary_category_name` varchar(128) DEFAULT NULL COMMENT '该类目所属的二级类目名称，若该类目为二级类目及以上，该值为null',
  `third_category_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '该类目所属的三级类目ID，若该类目为三级类目及以上，该值为默认值0',
  `third_category_name` varchar(128) DEFAULT NULL COMMENT '该类目所属的三级类目名称，若该类目为三级类目及以上，该值为null',
  `fourth_category_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '该类目所属的四级类目ID，若该类目为四级类目及以上，该值为默认值0',
  `fourth_category_name` varchar(128) DEFAULT NULL COMMENT '该类目所属的四级类目名称，若该类目为四级类目及以上，该值为null',
  `fifth_category_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '该类目所属的五级类目ID，若该类目为五级类目及以上，该值为默认值0',
  `fifth_category_name` varchar(128) DEFAULT NULL COMMENT '该类目所属的五级类目名称，若该类目为五级类目及以上，该值为null',
  `no_reason_returned_goods` tinyint(1) NOT NULL DEFAULT '0' COMMENT '该类目下的商品是否支持7天无理由退货，0代表不支持，1代表支持，默认值为0，该字段仅在一级类目上生效',
  `is_star` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否为明星商品类目，0：不是，1：是',
  PRIMARY KEY (`id`),
  KEY `category_ is_delete_index` (`is_delete`),
  KEY `category_ name_index` (`name`),
  KEY `category_ parent_id_index` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4066 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='分类表，存储分类信息';