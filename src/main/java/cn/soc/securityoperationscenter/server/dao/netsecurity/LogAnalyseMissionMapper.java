package cn.soc.securityoperationscenter.server.dao.netsecurity;

import cn.soc.securityoperationscenter.server.pojo.netsecurity.LogAnalyseMission;
import java.util.List;

public interface LogAnalyseMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogAnalyseMission record);

    LogAnalyseMission selectByPrimaryKey(Integer id);

    List<LogAnalyseMission> selectAll();

    int updateByPrimaryKey(LogAnalyseMission record);
}