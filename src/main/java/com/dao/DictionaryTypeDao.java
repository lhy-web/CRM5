package com.dao;


import com.domain.DictionaryType;
import com.domain.DictionaryTypeInfo;

import java.util.List;

public interface DictionaryTypeDao {
    //显示全部分类
    List<DictionaryType>  findAll();
    //添加分类
    public abstract void save(DictionaryType transientInstance);
    //显示某一分类具体信息
    public abstract List<DictionaryTypeInfo> selectDictionaryTypeInfo(Integer id);
    //添加分类具体信息
    public abstract void save(DictionaryTypeInfo transientInstance);
    //删除某一分类
    void delete(Integer id);
    //删除某一分类具体信息
    void deleteDictionaryTypeInfo(Integer id);
    //更新某一分类
    void update(DictionaryType dictionaryType);
    //更新某一分类具体信息
    void update(DictionaryTypeInfo dictionaryType);
}
