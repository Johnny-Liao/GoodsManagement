package org.goodsManagement.service.impl.PoiUtils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.vo.GetGoodsVO;

import java.util.List;

/**
 * Created by lifei on 2015/9/23.
 */
public class GetGoodsToExcel {
    /**
     *
     * @param list
     *          数据库表中人员领用记录的集合
     * @param path
     *          要写入的文件的路径
     */

    public void toExcel(List<GetGoodsVO> list,String path){

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("Users");

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
