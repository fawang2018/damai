package com.dm.serviceImpl;

import com.dm.dao.YongHuMapper;
import com.dm.pojo.YongHu;
import com.dm.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;


@Service
    @EnableTransactionManagement
    public class YongHuServiceImpl implements YongHuService {

        @Autowired
        private YongHuMapper ym;

        @Override
        public List dengLu(YongHu yongHu) {
            return ym.dengLu(yongHu);
        }

        @Override
        public int zhuce(YongHu yonghu) {
            return ym.zhuce(yonghu);
        }

        @Override
        public YongHu ceshi(int YH_ID) {
            return ym.ceshi(YH_ID);
        }

        @Override
        public int gengxin(YongHu yh) {
            return ym.gengxin(yh);
        }
}

