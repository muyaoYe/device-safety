package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.ResponseLibrary;

import java.util.List;

public interface IResponseLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(ResponseLibrary record);

    ResponseLibrary selectByPrimaryKey(Integer id);

    List<ResponseLibrary> selectAll();

    int updateByPrimaryKey(ResponseLibrary record);
}
