package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.RiskCheckMission;

import java.util.List;

public interface IRiskCheckMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskCheckMission record);

    RiskCheckMission selectByPrimaryKey(Integer id);

    List<RiskCheckMission> selectAll();

    int updateByPrimaryKey(RiskCheckMission record);
}
