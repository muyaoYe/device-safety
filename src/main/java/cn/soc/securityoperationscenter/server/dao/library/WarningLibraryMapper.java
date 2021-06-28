package cn.soc.securityoperationscenter.server.dao.library;

import cn.soc.securityoperationscenter.server.pojo.library.WarningLibrary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarningLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarningLibrary record);

    WarningLibrary selectByPrimaryKey(Integer id);

    List<WarningLibrary> selectAll();

    int updateByPrimaryKey(WarningLibrary record);
}