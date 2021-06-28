package cn.soc.securityoperationscenter.core.service.library;

import cn.soc.securityoperationscenter.server.pojo.library.OperationLibrary;

import java.util.List;

public interface IOperationLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLibrary record);

    OperationLibrary selectByPrimaryKey(Integer id);

    List<OperationLibrary> selectAll();

    int updateByPrimaryKey(OperationLibrary record);
}
