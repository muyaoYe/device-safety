package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.OperationLibrary;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface OperationLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationLibrary record);

    OperationLibrary selectByPrimaryKey(Integer id);

    List<OperationLibrary> selectAll();

    int updateByPrimaryKey(OperationLibrary record);
}