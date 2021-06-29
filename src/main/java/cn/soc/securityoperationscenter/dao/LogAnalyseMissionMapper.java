package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.LogAnalyseMission;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface LogAnalyseMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogAnalyseMission record);

    LogAnalyseMission selectByPrimaryKey(Integer id);

    List<LogAnalyseMission> selectAll();

    int updateByPrimaryKey(LogAnalyseMission record);
}