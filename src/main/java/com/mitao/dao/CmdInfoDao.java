package com.mitao.dao;

import com.mitao.po.CmdInfo;

public interface CmdInfoDao {

	public CmdInfo selectCommodityInfoByCmdID(String CmdID);
}
