package org.goodsManagement.service.impl.PoiUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.goodsManagement.dao.impl.GoodsDaoImpl;
import org.goodsManagement.dao.impl.InRepositoryDaoImpl;
import org.goodsManagement.po.InRepositoryDto;
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
import java.util.ArrayList;
import java.util.List;
/**
 * Created by lifei on 2015/9/22.
 */
@Component
public class InRepositoryUtils {
    @Autowired
    @Qualifier("inRepositoryDaoImpl")
    private static InRepositoryDaoImpl inRepositoryDaoImpl;
    @Autowired
    @Qualifier("goodsDaoImpl")
    private static GoodsDaoImpl goodsDaoImpl;
    public static String filePath = "C:\\Users\\lifei\\Desktop\\goods.xls";

    public static void main(String[] args){
        InRepositoryUtils.PoiUtils(filePath);
    }
    public static void PoiUtils(String filePath) {
        HSSFWorkbook wookbook = null;
        InRepositoryDto  in;
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
            if(row1!=null){
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
                                value1 += df.format(cell.getNumericCellValue())+ ",";
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
                                    value += df.format(cell.getNumericCellValue())+ ",";
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
                        in = new InRepositoryDto();
                        in.setInrepositoryid(val1[0]);
                        in.setSuppliers(val1[1]);
                        in.setLinkman(val1[2]);
                        in.setOperatorid(Integer.parseInt(val1[3]));
                        Date indata = null;
                        try {
                            DateFormat f = new SimpleDateFormat("yyyy/MM/dd");
                            indata = new Date(f.parse(val1[4].toString()).getTime());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        in.setIntime(indata);
                    //将物品信息设置
                        in.setGoodid(Integer.parseInt(val[0]));
                        in.setGoodnumber(Integer.parseInt(val[1]));
                        System.out.println(in);
                        int count = inRepositoryDaoImpl.insert(in);
                        System.out.println(count);
//                    SqlSessionFactory sqlSessionFactory;
//                    SqlSession sqlSession;
//                    ApplicationContext applicationContext;
//                    applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
//                    sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//                    sqlSession = sqlSessionFactory.openSession();
//                    int count = sqlSession.insert("org.goodsManagement.mapper.InRepositoryDtoMapper.insert", in);
//                    System.out.println(count);
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
