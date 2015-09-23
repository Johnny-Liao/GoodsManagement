package org.goodsManagement.service.impl.PoiUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.goodsManagement.dao.impl.GoodsDaoImpl;
import org.goodsManagement.dao.impl.InRepositoryDaoImpl;
import org.goodsManagement.dao.impl.OutRepositoryDaoImpl;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.po.OutRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by lifei on 2015/9/23.
 */
@Component
public class OutRepositoryUtils {
    @Autowired
    @Qualifier("outRepositoryDaoImpl")
    private OutRepositoryDaoImpl outRepositoryDaoImpl;

    @Autowired
    @Qualifier("goodsDaoImpl")
    private GoodsDaoImpl goodsDaoImpl;

//    public static String filePath = "C:\\Users\\lifei\\Desktop\\outgoods.xls";
//
//        public static void main(String[] args){
//            OutRepositoryUtils.addoutgoodsPoiUtils(filePath);
//    }
    public  void addoutgoodsPoiUtils(String filePath) {
        HSSFWorkbook wookbook = null;
        OutRepositoryDto in;
        try {
            // 创建对Excel工作簿文件的引用
            wookbook = new HSSFWorkbook(new FileInputStream(filePath));
            // 在Excel文档中，第一张工作表的缺省索引是0
            // 其语句为：HSSFSheet sheet = workbook.getSheetAt(0);
            HSSFSheet sheet = wookbook.getSheet("Sheet1");
            //获取到Excel文件中的所有行数
            int rows = sheet.getPhysicalNumberOfRows();
            //遍历行
            //先读取第一行的入库单的有关信息
            HSSFRow row1 = sheet.getRow(1);
            String value1 = "";
            if (row1 != null) {
                int cells = row1.getPhysicalNumberOfCells();
                for (int j = 0; j < cells; j++) {
                    //获取到列的值
                    HSSFCell cell = row1.getCell(j);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case HSSFCell.CELL_TYPE_FORMULA:
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                DecimalFormat df = new DecimalFormat("0");
                                value1 += df.format(cell.getNumericCellValue()) + ",";
//                                    value1 += cell.getNumericCellValue() + ",";
                                break;
                            case HSSFCell.CELL_TYPE_STRING:
                                value1 += cell.getStringCellValue().toString() + ",";
                                break;
                            default:
                                value1 += "0";
                                break;
                        }
                    }
                }
            }
            String[] val1 = value1.split(",");
            for (String s : val1) {
                System.out.println(s);
            }
            //将记录存入入库表中

            for (int i = 4; i <= rows; i++) {
                // 读取左上端单元格
                HSSFRow row = sheet.getRow(i);
                // 行不为空
                if (row != null) {
                    //获取到Excel文件中的所有的列
                    int cells = row.getPhysicalNumberOfCells();
                    String value = "";
                    //遍历列
                    for (int j = 0; j < cells; j++) {
                        //获取到列的值
                        HSSFCell cell = row.getCell(j);
                        if (cell != null) {
                            switch (cell.getCellType()) {
                                case HSSFCell.CELL_TYPE_FORMULA:
                                    break;
                                case HSSFCell.CELL_TYPE_NUMERIC:
                                    DecimalFormat df = new DecimalFormat("0");
                                    value += df.format(cell.getNumericCellValue()) + ",";
//                                    value += cell.getNumericCellValue() + ",";
                                    break;
                                case HSSFCell.CELL_TYPE_STRING:
                                    value += cell.getStringCellValue().toString() + ",";
                                    break;
                                default:
                                    value += "0";
                                    break;
                            }
                        }
                    }
                    // 将数据插入到mysql数据库中
                    String[] val = value.split(",");
                    for (String s : val) {
                        System.out.println(s);
                    }
                    //拿到val1中入库表单的数据
                    in = new OutRepositoryDto();
                    in.setOutrepositoryid(val1[0]);
                    in.setOperatorid(Integer.parseInt(val1[1]));
                    Date outdata = null;
                    try {
                        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                        outdata = new Date(f.parse(val1[2].toString()).getTime());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    in.setOuttime(outdata);
                    in.setComments(val1[3]);
                    //将物品信息设置
                    in.setGoodid(Integer.parseInt(val[0]));
                    in.setGoodnumber(Integer.parseInt(val[1]));
                    in.setDeptid(Integer.parseInt(val[3]));
                    in.setStandardnumber(Integer.parseInt(val[4]));
//                        System.out.println(in);
                    outRepositoryDaoImpl.insert(in);

                    /*SqlSessionFactory sqlSessionFactory;
                    SqlSession sqlSession;
                    ApplicationContext applicationContext;
                    applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
                    sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
                    sqlSession = sqlSessionFactory.openSession();
                    GoodsDto good =sqlSession.selectOne("org.goodsManagement.mapper.GoodsDtoMapper.selectByPrimaryKey", Integer.parseInt(val[0]));
*/


                    GoodsDto good = goodsDaoImpl.selectByPrimaryKey(Integer.parseInt(val[0]));
                    int num = good.getGoodnumbers()-Integer.parseInt(val[1]);
                    good.setGoodnumbers(num);
                    goodsDaoImpl.updateByPrimaryKey(good);

//                    int count = sqlSession.update("org.goodsManagement.mapper.GoodsDtoMapper.updateByPrimaryKeySelective", good);
//                    System.out.println(count);
//                    int counts = sqlSession.insert("org.goodsManagement.mapper.OutRepositoryDtoMapper.insertSelective", in);
//                    System.out.println(counts);
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
