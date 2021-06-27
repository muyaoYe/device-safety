package cn.soc.securityoperationscenter.server.dao.dictionary;

import cn.soc.securityoperationscenter.server.pojo.dictionary.DictionaryType;
import java.util.List;

public interface DictionaryTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryType record);

    DictionaryType selectByPrimaryKey(Integer id);

    List<DictionaryType> selectAll();

    int updateByPrimaryKey(DictionaryType record);
}