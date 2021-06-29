package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.DictionaryType;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface DictionaryTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryType record);

    DictionaryType selectByPrimaryKey(Integer id);

    List<DictionaryType> selectAll();

    int updateByPrimaryKey(DictionaryType record);
}