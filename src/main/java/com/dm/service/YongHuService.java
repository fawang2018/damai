package com.dm.service;

import com.dm.pojo.YongHu;

import java.util.List;

public interface YongHuService {
    List dengLu(YongHu yongHu);

    int zhuce(YongHu yonghu);

    YongHu ceshi(int YH_ID);

    int gengxin(YongHu yh);
}
