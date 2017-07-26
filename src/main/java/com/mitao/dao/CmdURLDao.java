package com.mitao.dao;

import java.util.Set;

import com.mitao.po.CmdURL;

public interface CmdURLDao {

	public Set<CmdURL> selectCommodityURLsByCmdID(String CmdID);
}
