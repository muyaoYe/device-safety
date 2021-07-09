package cn.soc.securityoperationscenter.dao;


import cn.soc.securityoperationscenter.entity.DictionaryType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryType record);

    DictionaryType selectByPrimaryKey(Integer id);

    List<DictionaryType> selectAll(String name);

    int updateByPrimaryKey(DictionaryType record);

    List<DictionaryType> selectByName(String name);
}