package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.RiskTrackMission;

import java.util.List;

public interface IRiskTrackMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskTrackMission record);

    RiskTrackMission selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(RiskTrackMission record);
}
