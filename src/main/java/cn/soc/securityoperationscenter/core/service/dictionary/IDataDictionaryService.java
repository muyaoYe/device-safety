package cn.soc.securityoperationscenter.core.service.dictionary;

import cn.soc.securityoperationscenter.server.pojo.dictionary.DataDictionary;

import java.util.List;

public interface IDataDictionaryService {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll();

    int updateByPrimaryKey(DataDictionary record);
}
