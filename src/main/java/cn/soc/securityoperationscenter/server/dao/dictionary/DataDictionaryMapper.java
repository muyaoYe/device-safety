package cn.soc.securityoperationscenter.server.dao.dictionary;

import cn.soc.securityoperationscenter.server.pojo.dictionary.DataDictionary;
import java.util.List;

public interface DataDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll();

    int updateByPrimaryKey(DataDictionary record);
}