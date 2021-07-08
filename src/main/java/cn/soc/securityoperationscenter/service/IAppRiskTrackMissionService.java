package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.AppRiskTrackMission;

import java.util.List;


public interface IAppRiskTrackMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskTrackMission record);

    AppRiskTrackMission selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(AppRiskTrackMission record);
}
