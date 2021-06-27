package cn.soc.securityoperationscenter.server.dao.integration;

import cn.soc.securityoperationscenter.server.pojo.integration.RiskCheckMission;
import java.util.List;

public interface RiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskCheckMission record);

    RiskCheckMission selectByPrimaryKey(Integer id);

    List<RiskCheckMission> selectAll();

    int updateByPrimaryKey(RiskCheckMission record);
}