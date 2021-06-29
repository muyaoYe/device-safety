package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.RiskTrackMission;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface RiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskTrackMission record);

    RiskTrackMission selectByPrimaryKey(Integer id);

    List<RiskTrackMission> selectAll();

    int updateByPrimaryKey(RiskTrackMission record);
}