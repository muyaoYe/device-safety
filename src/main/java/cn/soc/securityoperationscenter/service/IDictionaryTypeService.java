package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.DictionaryType;

import java.util.List;

public interface IDictionaryTypeService {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryType record);

    DictionaryType selectByPrimaryKey(Integer id);

    List<DictionaryType> selectAll();

    int updateByPrimaryKey(DictionaryType record);
}
