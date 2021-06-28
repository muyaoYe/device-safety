package cn.soc.securityoperationscenter.server.dao.integration;

import cn.soc.securityoperationscenter.server.pojo.integration.RiskTrackMission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskTrackMission record);

    RiskTrackMission selectByPrimaryKey(Integer id);

    List<RiskTrackMission> selectAll();

    int updateByPrimaryKey(RiskTrackMission record);
}