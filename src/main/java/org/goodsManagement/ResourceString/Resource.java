package org.goodsManagement.ResourceString;

/**
 * Created by lifei on 2015/9/24.
 */
public class Resource {
    /**
     * 入库单表头
     */
    public static String[] InrepositoryHead = {"入库单号", "到货时间", "供应商", "联系人", "联系电话", "操作人", "操作"};
    /**
     * 入库单货物表头
     */
    public static String[] InrepositoryGoodHead = {"入库物品", "数量", "单位", "型号"};


    // 出库表表头
    public static String[] OutRepositoryHead = {"出库单号", "出库时间", "货物名", "货物类型", "发放部门名", "操作人", "操作"};

    // 出库单货物列表表头
    public static String[] OutRepositoryGoodListHead = {"出库物品", "部门", "数量", "数量单位", "型号"};

    public static String[] goodInformationHead = {"品名", "单位", "显示详细信息", "删除"};

    public static String[] goodNuberAndTypeHead = {"数量", "类型"};

    public static String[] DeliveryDetail = {"服务单位", "员工编号", "姓名", "性别", "物品名", "物品数量", "物品类型"};

    /*
    * 库房盘存表表头
    * */
    public final static String[] GoodHead = {"品名", "数量", "单位"};
}
