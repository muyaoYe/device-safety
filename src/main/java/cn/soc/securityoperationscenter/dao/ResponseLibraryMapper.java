package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.ResponseLibrary;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface ResponseLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResponseLibrary record);

    ResponseLibrary selectByPrimaryKey(Integer id);

    List<ResponseLibrary> selectAll();

    int updateByPrimaryKey(ResponseLibrary record);
}