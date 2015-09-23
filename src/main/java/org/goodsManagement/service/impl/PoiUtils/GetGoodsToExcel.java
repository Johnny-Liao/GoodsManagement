package org.goodsManagement.service.impl.PoiUtils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.vo.GetGoodsVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lifei on 2015/9/23.
 */
@Component
public class GetGoodsToExcel {


    /*public static void main(String[] args){
        List<GetGoodsVO> list = new ArrayList<GetGoodsVO>();
        GetGoodsVO a1 = new GetGoodsVO();
        a1.setStaffname("大黄");
        a1.setGoodname("屎");
        a1.setGetnumber(2);
        a1.setGoodtype("一大坨");
        list.add(a1);
        GetGoodsVO a2 = new GetGoodsVO();
        a2.setStaffname("小黄");
        a2.setGoodname("屎");
        a2.setGetnumber(2);
        a2.setGoodtype("一桶");
        list.add(a2);
        String path = "C:\\Users\\lifei\\Desktop\\getgood.xls";
        GetGoodsToExcel.toExcel(list,path);
        System.out.println("导出完成");
    }*/
    /**
     *
     * @param list
     *          数据库表中人员领用记录的集合
     * @param path
     *          要写入的文件的路径
     */

    public void addtoExcel(List<GetGoodsVO> list,String path){

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("Outgoods");

        String[] n = { "姓名", "物品名称号", "物品型号", "物品数量" };

        Object[][] value = new Object[list.size() + 1][4];
        for (int m = 0; m < n.length; m++) {
            value[0][m] = n[m];
        }
        for (int i = 0; i < list.size(); i++) {
            GetGoodsVO  getGoodsVOg= (GetGoodsVO) list.get(i);
            value[i + 1][0] = getGoodsVOg.getStaffname();
            value[i + 1][1] = getGoodsVOg.getGoodname();
            value[i + 1][2] = getGoodsVOg.getGoodtype();
            value[i + 1][3] = getGoodsVOg.getGetnumber();
        }
        ExcelUtils.writeArrayToExcel(wb, sheet, list.size() + 1, 4, value);
        ExcelUtils.writeWorkbook(wb, path);
    }
}
