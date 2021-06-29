package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.LogAnalyseMission;

import java.util.List;

public interface ILogAnalyseMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(LogAnalyseMission record);

    LogAnalyseMission selectByPrimaryKey(Integer id);

    List<LogAnalyseMission> selectAll();

    int updateByPrimaryKey(LogAnalyseMission record);
}
