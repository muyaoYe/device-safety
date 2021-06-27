package cn.soc.securityoperationscenter.server.dao.integration;

import cn.soc.securityoperationscenter.server.pojo.integration.RiskTrackMission;
import java.util.List;

public interface RiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskTrackMission record);

    RiskTrackMission selectByPrimaryKey(Integer id);

    List<RiskTrackMission> selectAll();

    int updateByPrimaryKey(RiskTrackMission record);
}