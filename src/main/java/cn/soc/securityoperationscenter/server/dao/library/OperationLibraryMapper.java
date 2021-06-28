package cn.soc.securityoperationscenter.server.dao.library;

import cn.soc.securityoperationscenter.server.pojo.library.OperationLibrary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationLibrary record);

    OperationLibrary selectByPrimaryKey(Integer id);

    List<OperationLibrary> selectAll();

    int updateByPrimaryKey(OperationLibrary record);
}