package cn.soc.securityoperationscenter.core.service.library;

import cn.soc.securityoperationscenter.server.pojo.library.WarningLibrary;

import java.util.List;

public interface IWarningLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(WarningLibrary record);

    WarningLibrary selectByPrimaryKey(Integer id);

    List<WarningLibrary> selectAll();

    int updateByPrimaryKey(WarningLibrary record);
}
