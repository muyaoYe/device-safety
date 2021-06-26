package cn.soc.securityoperationscenter.core.service.impl.mission;

import cn.soc.securityoperationscenter.core.service.mission.IMissionService;
import cn.soc.securityoperationscenter.server.dao.mission.MissionMapper;
import cn.soc.securityoperationscenter.server.pojo.mission.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMissionServiceImpl implements IMissionService {

    @Autowired
    MissionMapper missionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = missionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(Mission record) {
        int i = missionMapper.insert(record);
        return i;
    }

    @Override
    public Mission selectByPrimaryKey(Integer id) {
        Mission mission = missionMapper.selectByPrimaryKey(id);
        return mission;
    }

    @Override
    public List<Mission> selectAll() {
        List<Mission> missionList = missionMapper.selectAll();
        return missionList;
    }

    @Override
    public int updateByPrimaryKey(Mission record) {
        int i = missionMapper.updateByPrimaryKey(record);
        return i;
    }
}
