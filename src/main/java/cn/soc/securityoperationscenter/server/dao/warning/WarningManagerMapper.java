package cn.soc.securityoperationscenter.server.dao.warning;

import cn.soc.securityoperationscenter.server.pojo.warning.WarningManager;
import java.util.List;

public interface WarningManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarningManager record);

    WarningManager selectByPrimaryKey(Integer id);

    List<WarningManager> selectAll();

    int updateByPrimaryKey(WarningManager record);
}