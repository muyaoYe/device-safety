package cn.soc.securityoperationscenter.core.service.impl.appsecurity;

import cn.soc.securityoperationscenter.core.service.appsecurity.IAppRiskTrackMissionService;
import cn.soc.securityoperationscenter.server.dao.appsecurity.AppRiskTrackMissionMapper;
import cn.soc.securityoperationscenter.server.pojo.appsecurity.AppRiskTrackMission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IAppRiskTrackMissionServiceImpl implements IAppRiskTrackMissionService {

    @Autowired
    AppRiskTrackMissionMapper appRiskTrackMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = appRiskTrackMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(AppRiskTrackMission record) {
        int i = appRiskTrackMissionMapper.insert(record);
        return i;
    }

    @Override
    public AppRiskTrackMission selectByPrimaryKey(Integer id) {
        AppRiskTrackMission appRiskTrackMission = appRiskTrackMissionMapper.selectByPrimaryKey(id);
        return appRiskTrackMission;
    }

    @Override
    public List<AppRiskTrackMission> selectAll() {
        List<AppRiskTrackMission> appRiskTrackMissionList = appRiskTrackMissionMapper.selectAll();
        return appRiskTrackMissionList;
    }

    @Override
    public int updateByPrimaryKey(AppRiskTrackMission record) {
        int i = appRiskTrackMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
