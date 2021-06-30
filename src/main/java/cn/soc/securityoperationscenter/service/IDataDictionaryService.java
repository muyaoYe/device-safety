package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.DataDictionary;

import java.util.List;

public interface IDataDictionaryService {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll();

    int updateByPrimaryKey(DataDictionary record);

    List<DataDictionary> selectByName(String dictionaryName);
}
