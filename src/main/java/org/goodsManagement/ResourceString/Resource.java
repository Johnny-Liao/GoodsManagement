package org.goodsManagement.ResourceString;

/**
 * Created by lifei on 2015/9/24.
 */
public class Resource {
    /**
     * 入库单表头
     */
    public static String[] InrepositoryHead = {"入库单号","到货时间","供应商","联系人","联系电话","编制人","操作"};
    /**
     * 入库单货物表头
     */
    public static String[] InrepositoryGoodHead = {"入库物品","单位","型号","数量"};

    // 出库表表头
    public static String[] OutRepositoryHead = {"出库单号","出库时间", "货物名", "货物类型", "发放部门名", "操作人","操作"};

    // 出库单货物列表表头
    public static String[] OutRepositoryGoodListHead = {"出库物品", "部门", "数量", "数量单位", "型号"};

}
