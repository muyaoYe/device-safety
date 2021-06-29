package cn.soc.securityoperationscenter.service.impl;



import cn.soc.securityoperationscenter.dao.RiskTrackMissionMapper;
import cn.soc.securityoperationscenter.entity.RiskTrackMission;
import cn.soc.securityoperationscenter.service.IRiskTrackMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class IRiskTrackMissionServiceImpl implements IRiskTrackMissionService {

    @Autowired
    RiskTrackMissionMapper riskTrackMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = riskTrackMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(RiskTrackMission record) {
        int i = riskTrackMissionMapper.insert(record);
        return i;
    }

    @Override
    public RiskTrackMission selectByPrimaryKey(Integer id) {
        RiskTrackMission riskTrackMission = riskTrackMissionMapper.selectByPrimaryKey(id);
        return riskTrackMission;
    }

    @Override
    public List<RiskTrackMission> selectAll() {
        List<RiskTrackMission> riskTrackMissionList = riskTrackMissionMapper.selectAll();
        return riskTrackMissionList;
    }

    @Override
    public int updateByPrimaryKey(RiskTrackMission record) {
        int i = riskTrackMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
