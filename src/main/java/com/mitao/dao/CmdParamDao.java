package com.mitao.dao;

import java.util.Set;

import com.mitao.po.CmdParam;

public interface CmdParamDao {

	public Set<CmdParam> selectCommodityParamsByCmdID(String CmdID);
}
