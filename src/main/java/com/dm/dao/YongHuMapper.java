package com.dm.dao;

import com.dm.pojo.YongHu;

import java.util.List;

public interface YongHuMapper {
    public List dengLu(YongHu yongHu);

    public int zhuce(YongHu yonghu);

    public YongHu ceshi(int YH_ID);

    public int gengxin(YongHu yh);
}
