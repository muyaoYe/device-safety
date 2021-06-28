package cn.soc.securityoperationscenter.server.dao.warning;

import cn.soc.securityoperationscenter.server.pojo.warning.WarningManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarningManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarningManager record);

    WarningManager selectByPrimaryKey(Integer id);

    List<WarningManager> selectAll();

    int updateByPrimaryKey(WarningManager record);
}