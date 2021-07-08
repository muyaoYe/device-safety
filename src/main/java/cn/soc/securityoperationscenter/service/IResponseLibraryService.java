package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.ResponseLibrary;

import java.util.List;

public interface IResponseLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(ResponseLibrary record);

    ResponseLibrary selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(ResponseLibrary record);
}
