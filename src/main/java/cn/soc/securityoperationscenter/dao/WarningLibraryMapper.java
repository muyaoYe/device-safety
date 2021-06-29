package cn.soc.securityoperationscenter.dao;


import cn.soc.securityoperationscenter.entity.WarningLibrary;
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