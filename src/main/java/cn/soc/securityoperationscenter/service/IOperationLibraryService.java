package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.OperationLibrary;

import java.util.List;

public interface IOperationLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLibrary record);

    OperationLibrary selectByPrimaryKey(Integer id);

    List<OperationLibrary> selectAll();

    int updateByPrimaryKey(OperationLibrary record);
}
