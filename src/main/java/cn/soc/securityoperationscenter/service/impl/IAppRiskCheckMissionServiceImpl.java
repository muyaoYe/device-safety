package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.AppRiskCheckMissionMapper;
import cn.soc.securityoperationscenter.entity.AppRiskCheckMission;
import cn.soc.securityoperationscenter.service.IAppRiskCheckMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class IAppRiskCheckMissionServiceImpl implements IAppRiskCheckMissionService {

    @Autowired
    AppRiskCheckMissionMapper appRiskCheckMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = appRiskCheckMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(AppRiskCheckMission record) {
        int i = appRiskCheckMissionMapper.insert(record);
        return i;
    }

    @Override
    public AppRiskCheckMission selectByPrimaryKey(Integer id) {
        AppRiskCheckMission appRiskCheckMission = appRiskCheckMissionMapper.selectByPrimaryKey(id);
        return appRiskCheckMission;
    }

    @Override
    public List<AppRiskCheckMission> selectAll() {
        List<AppRiskCheckMission> appRiskCheckMissionList = appRiskCheckMissionMapper.selectAll();
        return appRiskCheckMissionList;
    }

    @Override
    public int updateByPrimaryKey(AppRiskCheckMission record) {
        int i = appRiskCheckMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
