package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.OperationLibrary;

import java.util.List;

public interface IOperationLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLibrary record);

    OperationLibrary selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(OperationLibrary record);
}
