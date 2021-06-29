package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.LogAnalyseMissionMapper;
import cn.soc.securityoperationscenter.entity.LogAnalyseMission;
import cn.soc.securityoperationscenter.service.ILogAnalyseMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class ILogAnalyseMissionServiceImpl implements ILogAnalyseMissionService {

    @Autowired
    LogAnalyseMissionMapper logAnalyseMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = logAnalyseMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(LogAnalyseMission record) {
        int i = logAnalyseMissionMapper.insert(record);
        return i;
    }

    @Override
    public LogAnalyseMission selectByPrimaryKey(Integer id) {
        LogAnalyseMission logAnalyseMission = logAnalyseMissionMapper.selectByPrimaryKey(id);
        return logAnalyseMission;
    }

    @Override
    public List<LogAnalyseMission> selectAll() {
        List<LogAnalyseMission> logAnalyseMissionList = logAnalyseMissionMapper.selectAll();
        return logAnalyseMissionList;
    }

    @Override
    public int updateByPrimaryKey(LogAnalyseMission record) {
        int i = logAnalyseMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
