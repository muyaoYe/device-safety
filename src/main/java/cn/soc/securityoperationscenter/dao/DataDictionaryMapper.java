package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.DataDictionary;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface DataDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer id);

    List<DataDictionary> selectAll();

    int updateByPrimaryKey(DataDictionary record);
}