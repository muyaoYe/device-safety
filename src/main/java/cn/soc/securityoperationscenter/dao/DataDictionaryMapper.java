package cn.soc.securityoperationscenter.dao;


import cn.soc.securityoperationscenter.entity.DataDictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll(String dictioaryName);

    int updateByPrimaryKey(DataDictionary record);

    List<DataDictionary> selectByName(String dictionaryName);

}