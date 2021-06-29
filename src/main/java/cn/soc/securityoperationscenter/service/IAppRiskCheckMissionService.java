package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.AppRiskCheckMission;


import java.util.List;


public interface IAppRiskCheckMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskCheckMission record);

    AppRiskCheckMission selectByPrimaryKey(Integer id);

    List<AppRiskCheckMission> selectAll();

    int updateByPrimaryKey(AppRiskCheckMission record);
}
