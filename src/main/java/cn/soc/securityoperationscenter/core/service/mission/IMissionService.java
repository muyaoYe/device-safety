package cn.soc.securityoperationscenter.core.service.mission;

import cn.soc.securityoperationscenter.server.pojo.mission.Mission;

import java.util.List;

public interface IMissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(Mission record);

    Mission selectByPrimaryKey(Integer id);

    List<Mission> selectAll();

    int updateByPrimaryKey(Mission record);
}
