-- 插入测试数据
USE goodsmanage;

INSERT INTO dept (deptname) VALUE ("无线事业部");
INSERT INTO dept (deptname) VALUE ("技术服务部");
INSERT INTO dept (deptname) VALUE ("运维支持部");

INSERT INTO user  VALUES (1, "admin", "admin");

INSERT INTO goods VALUES (1, "衣服", "件", 30, "大码");
INSERT INTO goods VALUES (2, "裤子", "件", 20, "超大码");
INSERT INTO goods VALUES (3, "袜子", "双", 50, "小码");

INSERT INTO staff (id, staffname, sex, deptid)  VALUES (1, "小黑狗", "女", 1);
INSERT INTO staff (id, staffname, sex, deptid)  VALUES (2, "大黄狗", "男", 2);
INSERT INTO staff (id, staffname, sex, deptid)  VALUES (3, "牛羊新", "男", 3);

INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (1, 1, 1, 20);
INSERT INTO getgoods (id, staffid, goodid, getnumber)  VALUES (2, 2, 2, 10);

INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (1, 20150919, 1, 20, "卖衣服的", "黄衣党", 12345678901, 1, "买了几件衣服", "1111");
INSERT INTO inrepository (id, intime, goodid, goodnumber, suppliers, linkman, phone, operatorid, comments, inrepositoryid)  VALUES (2, 20150919, 1, 30, "卖裤子的", "酷酷党", 12345678901, 1, "买了几件破裤子", "2222");

INSERT INTO outrepository (outtime, goodid, goodnumber, operatorid, deptid, standardnumber, comments)  VALUES (20150920, 1, 10, 1, 1, 3, "发衣服咯");

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
SELECT id, goodname, goodnumbers FROM goods;

# 人员物品领用明细
SELECT getgoods.id, staff.staffname, goods.goodname, getgoods.getnumber
FROM getgoods
  LEFT JOIN staff ON getgoods.staffid = staff.id
  LEFT JOIN goods ON getgoods.goodid = goods.id
WHERE getgoods.id = 1;


# 入库信息明细
SELECT inr.goodid, intime, goods.goodname, goodnumber, suppliers, linkman, phone, username,comments
FROM inrepository inr
  LEFT JOIN goods ON goods.id = inr.goodid
  LEFT JOIN user ON user.id = inr.operatorid;

# 出库信息明细
SELECT outr.id, outtime, goodname, goodnumber, username, deptname, comments
FROM outrepository outr
  LEFT JOIN goods ON goods.id = goodid
  LEFT JOIN user ON user.id = operatorid
  LEFT JOIN dept ON dept.id = deptid;