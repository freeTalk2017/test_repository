package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Brand;

public interface CmdTypeDao {

	public Set<Brand> selectBrandsByType(String Type);
}
