package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.DataDictionaryMapper;
import cn.soc.securityoperationscenter.entity.DataDictionary;
import cn.soc.securityoperationscenter.service.IDataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class IDataDictionaryServiceImpl implements IDataDictionaryService {

    @Autowired
    DataDictionaryMapper dataDictionaryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = dataDictionaryMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(DataDictionary record) {
        int i = dataDictionaryMapper.insert(record);
        return i;
    }

    @Override
    public DataDictionary selectByPrimaryKey(Integer id) {
        DataDictionary dataDictionary = dataDictionaryMapper.selectByPrimaryKey(id);
        return dataDictionary;
    }

    @Override
    public List<DataDictionary> selectAll() {
        List<DataDictionary> dataDictionaryList = dataDictionaryMapper.selectAll();
        return dataDictionaryList;
    }

    @Override
    public int updateByPrimaryKey(DataDictionary record) {
        int i = dataDictionaryMapper.updateByPrimaryKey(record);
        return i;
    }
}
