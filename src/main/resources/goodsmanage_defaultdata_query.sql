START TRANSACTION;
-- 插入测试数据
USE goodsmanage;

INSERT INTO dept (deptname) VALUE ("无线事业部");
INSERT INTO dept (deptname) VALUE ("技术服务部");
INSERT INTO dept (deptname) VALUE ("运维支持部");
INSERT INTO dept (deptname) VALUE ("后台服务部");
INSERT INTO dept (deptname) VALUE ("软件开发部");

INSERT INTO user  VALUES (1, "admin", "admin");
INSERT INTO user  VALUES (2, "user", "user");

INSERT INTO goods VALUES (1, "衣服", "件", 30, "大码");
INSERT INTO goods VALUES (2, "裤子", "件", 20, "超大码");
INSERT INTO goods VALUES (3, "袜子", "双", 50, "小码");
INSERT INTO goods VALUES (4, "鞋子", "双", 20, "中码");
INSERT INTO goods VALUES (5, "月饼", "个", 80, "豆沙");
INSERT INTO goods VALUES (6, "月饼", "个", 20, "莲蓉");

INSERT INTO staff (id, staffname, sex, deptid)  VALUES (1, "小黑狗", "女", 1);
INSERT INTO staff (id, staffname, sex, deptid)  VALUES (2, "大黄狗", "男", 2);
INSERT INTO staff (id, staffname, sex, deptid)  VALUES (3, "牛羊新", "男", 3);
INSERT INTO staff (id, staffname, sex, deptid)  VALUES (4, "汉子", "女", 1);

INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (1, 1, 1, 20);
INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (2, 2, 2, 10);
INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (4, 3, 6, 20);
# INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (5, 4, 4, 40);


INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (1, 20150919, 1, 20, "卖衣服的", "黄衣党", 12345678901, 1, "买了几件衣服和裤子", "1111");
INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (2, 20150919, 2, 30, "卖裤子的", "酷酷党", 12345678901, 1, "买了几件破裤子", "2222");
INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (3, 20150919, 4, 30, "卖鞋的", "飞鞋党", 12345678901, 1, "买了几件破鞋", "XIEZI");
INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (4, 20150919, 5, 30, "卖月饼的", "咸蛋超人", 12345678901, 1, "可以吃月饼咯", "yuebing");
INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (5, 20150919, 2, 30, "卖衣服的", "黄衣党", 12345678901, 1, "买了几件衣服和裤子", "1111");

INSERT INTO outrepository (outtime, goodid, goodnumber, operatorid, deptid, standardnumber, comments, outrepositoryid)  VALUES (20150920, 1, 10, 1, 1, 3, "发衣服咯", "YIFU");
INSERT INTO outrepository (outtime, goodid, goodnumber, operatorid, deptid, standardnumber, comments, outrepositoryid)  VALUES (20150920, 2, 10, 1, 1, 3, "发裤子咯", "KUZI");
INSERT INTO outrepository (outtime, goodid, goodnumber, operatorid, deptid, standardnumber, comments, outrepositoryid)  VALUES (20150920, 5, 10, 1, 5, 3, "发月饼咯", "YUEBING");
INSERT INTO outrepository (outtime, goodid, goodnumber, operatorid, deptid, standardnumber, comments, outrepositoryid)  VALUES (20150921, 5, 10, 1, 2, 3, "发衣服咯", "YIFU");

-- 显示所有表数据
SELECT * FROM user;
SELECT * FROM dept;
SELECT * FROM goods;
SELECT * FROM staff;
SELECT * FROM getgoods;
SELECT * FROM inrepository;
SELECT * FROM outrepository;

-- 常用查询语句

# 物品信息管理页展示数据
SELECT id, goodname, goodunit FROM goods;

# 库房盘存
SELECT id, goodname, sum(goodnumbers) FROM goods GROUP BY goodname;

# 人员物品领用明细
SELECT getgoods.id, staff.staffname, goods.goodname, getgoods.getnumber
FROM getgoods
  LEFT JOIN staff ON getgoods.staffid = staff.id
  LEFT JOIN goods ON getgoods.goodid = goods.id
WHERE getgoods.id = 1;

# 入库信息明细
SELECT inr.goodid, intime, goods.goodname, goodnumber, suppliers, linkman, phone, username,comments, inrepositoryid
FROM inrepository inr
  LEFT JOIN goods ON goods.id = inr.goodid
  LEFT JOIN user ON user.id = inr.operatorid;

# 出库信息明细
SELECT outr.id, outtime, goodname, goodnumber, username, deptname, comments, outrepositoryid
FROM outrepository outr
  LEFT JOIN goods ON goods.id = goodid
  LEFT JOIN user ON user.id = operatorid
  LEFT JOIN dept ON dept.id = deptid
  GROUP BY outrepositoryid;

# 通过特定的ID来查询出库信息
SELECT outrepositoryid, outr.id, outtime, goodname, goodtype, goodnumber, username, deptname, comments
FROM outrepository outr
  LEFT JOIN goods ON goods.id = goodid
  LEFT JOIN user ON user.id = operatorid
  LEFT JOIN dept ON dept.id = deptid
WHERE outrepositoryid = 'YIFU'
GROUP BY outrepositoryid;

# public static String[] OutRepositoryGoodListHead = {"出库物品", "部门", "数量", "数量单位", "型号"};
SELECT goodname, deptname, goodnumber, goodunit, goodtype
  FROM outrepository
    LEFT JOIN goods ON goods.id = outrepository.goodid
    LEFT JOIN dept ON dept.id = outrepository.deptid
WHERE outrepositoryid = 'YIFU';

COMMIT
