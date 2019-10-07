package com.px.dao.impl;

import com.px.dao.IndexDao;
import org.springframework.stereotype.Repository;

@Repository(value = "indexDao")
public class IndexDaoImpl implements IndexDao {
	@Override
	public void query() {
		System.out.println("query");
	}
}
