package com.dao;

import com.domain.Customerinfo;

import java.util.List;

public interface CustomerInfoDao {
List<Customerinfo> findAll();
}