package com.service;

import com.domain.DictionaryType;
import com.dao.DictionaryTypeDao;
import com.domain.DictionaryTypeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DictionaryTypeServiceImpl implements DictionaryTypeService{
    public void setDao(DictionaryTypeDao dao) {
        this.dao = dao;
    }
    private DictionaryTypeDao dao;

    public List<DictionaryType> findAll() {
        List<DictionaryType> list = dao.findAll();
        return list;
    }
    public void saveDictionaryType(DictionaryType dictionarytype) {
        dao.save(dictionarytype);
    }

    public void saveDictionaryTypeInfo(DictionaryTypeInfo dictionarytypetnfo) {
        dao.save(dictionarytypetnfo);
    }

    public List<DictionaryTypeInfo> selectDictionaryTypeInfo(Integer id) {

        return dao.selectDictionaryTypeInfo(id);
    }

    public void delete(Integer id) {
        dao.delete(id);
    }

    public void update(DictionaryType dictionaryType) {
        dao.update(dictionaryType);
    }

    public void deleteDictionaryTypeInfo(Integer id) {
        dao.deleteDictionaryTypeInfo(id);
    }

    public void update(DictionaryTypeInfo dictionaryType) {
        dao.update(dictionaryType);
    }

}
