package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.WarningLibrary;

import java.util.List;

public interface IWarningLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(WarningLibrary record);

    WarningLibrary selectByPrimaryKey(Integer id);

    List<WarningLibrary> selectAll();

    int updateByPrimaryKey(WarningLibrary record);
}
