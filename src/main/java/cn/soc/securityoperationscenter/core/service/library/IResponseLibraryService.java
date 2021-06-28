package cn.soc.securityoperationscenter.core.service.library;

import cn.soc.securityoperationscenter.server.pojo.library.ResponseLibrary;

import java.util.List;

public interface IResponseLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(ResponseLibrary record);

    ResponseLibrary selectByPrimaryKey(Integer id);

    List<ResponseLibrary> selectAll();

    int updateByPrimaryKey(ResponseLibrary record);
}
