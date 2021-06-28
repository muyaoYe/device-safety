package cn.soc.securityoperationscenter.server.dao.dictionary;

import cn.soc.securityoperationscenter.server.pojo.dictionary.DataDictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll();

    int updateByPrimaryKey(DataDictionary record);
}