package cn.soc.securityoperationscenter.core.service.impl.netsecurity;

import cn.soc.securityoperationscenter.core.service.netsecurity.ILogAnalyseMissionService;
import cn.soc.securityoperationscenter.server.dao.netsecurity.LogAnalyseMissionMapper;
import cn.soc.securityoperationscenter.server.pojo.netsecurity.LogAnalyseMission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
