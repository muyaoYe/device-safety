package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.DictionaryTypeMapper;
import cn.soc.securityoperationscenter.entity.DictionaryType;
import cn.soc.securityoperationscenter.service.IDictionaryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class IDictionaryTypeServiceImpl implements IDictionaryTypeService {

    @Autowired
    DictionaryTypeMapper dictionaryTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = dictionaryTypeMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(DictionaryType record) {
        int i = dictionaryTypeMapper.insert(record);
        return i;
    }

    @Override
    public DictionaryType selectByPrimaryKey(Integer id) {
        DictionaryType dictionaryType = dictionaryTypeMapper.selectByPrimaryKey(id);
        return dictionaryType;
    }

    @Override
    public List<DictionaryType> selectAll() {
        List<DictionaryType> dictionaryTypeList = dictionaryTypeMapper.selectAll();
        return dictionaryTypeList;
    }

    @Override
    public int updateByPrimaryKey(DictionaryType record) {
        int i = dictionaryTypeMapper.updateByPrimaryKey(record);
        return i;
    }
}
