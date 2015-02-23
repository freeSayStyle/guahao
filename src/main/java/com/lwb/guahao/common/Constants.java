package com.lwb.guahao.common;

/**
 * Created by Lu Weibiao on 2015/2/16 14:18.
 */

/**
 * 常量
 */
public class Constants {
    //账户状态
    public static class AccountStatus {
        public static final int NORMAL = 0; //正常
        public static final int UN_VERIFIED = 1; //未验证
        public static final int FORBIDDEN = 2; //禁止
        public static final int DELETED = -1; //不存在
    }

    //订单状态
    public static class OrderStatus {
        public static final int UN_PAYED  = 0; //已下定，未支付
        public static final int PAYED = 1; //已支付，待就诊
        public static final int FINISHED = 2; //完成就诊
        public static final int FAILED = 3; //爽约未就诊
        public static final int CANCEL = -1; //取消预约
    }
}
