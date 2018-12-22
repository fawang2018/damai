package com.dm.pojo;

import lombok.Data;

@Data
public class ShouHuoDiZhi {

    private int SHDZ_ID;
    private String SHDZ_BieMing;
    private String SHDZ_ShouJianRen;
    private String SHDZ_ShouJi;
    private String SHDZ_ZuoJi;
    private String SHDZ_PeiSongDiZhi;
    private int SHDZ_MoRen;//默认为0，默认为不是首选地址，如需改为首选地址，请把0改为1
    private int SHDZ_YH_ID;
}
