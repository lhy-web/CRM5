package com.service;

import com.domain.DictionaryType;
import com.domain.DictionaryTypeInfo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface DictionaryTypeService {
    public List<DictionaryType> findAll();

    void saveDictionaryType(DictionaryType dictionarytype);

    void saveDictionaryTypeInfo(DictionaryTypeInfo dictionarytypetnfo);
    public List<DictionaryTypeInfo> selectDictionaryTypeInfo(Integer id);

    public void delete(Integer id);
    void update(DictionaryType dictionaryType);
    void deleteDictionaryTypeInfo(Integer id);
    void update(DictionaryTypeInfo dictionaryType);
}
