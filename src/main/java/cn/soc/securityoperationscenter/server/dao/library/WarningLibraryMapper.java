package cn.soc.securityoperationscenter.server.dao.library;

import cn.soc.securityoperationscenter.server.pojo.library.WarningLibrary;
import java.util.List;

public interface WarningLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarningLibrary record);

    WarningLibrary selectByPrimaryKey(Integer id);

    List<WarningLibrary> selectAll();

    int updateByPrimaryKey(WarningLibrary record);
}