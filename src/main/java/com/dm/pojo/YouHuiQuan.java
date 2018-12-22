package com.dm.pojo;

import lombok.Data;

@Data
public class YouHuiQuan {

    private int YHQ_ID;
    private String YHQ_HaoMa;
    private String YHQ_MingCheng;
    private String YHQ_ShuoMing;
    private String YHQ_FanWei;
    private String YHQ_YouXiaoQi;
    private int YHQ_YH_ID;//外键指向用户表主键，表示一个用户可以有多张优惠券
    private int YHQ_YiShiYong;//优惠券有没有使用，使用是1，默认为0未使用
    private int YHQ_GuoQi;//优惠券是否过期，过期为1，默认为0未过期
    private String YHQ_YanZhengMa;//优惠券验证码
}
