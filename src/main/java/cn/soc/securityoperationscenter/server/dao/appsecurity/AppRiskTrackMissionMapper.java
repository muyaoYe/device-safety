package cn.soc.securityoperationscenter.server.dao.appsecurity;

import cn.soc.securityoperationscenter.server.pojo.appsecurity.AppRiskTrackMission;
import java.util.List;

public interface AppRiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskTrackMission record);

    AppRiskTrackMission selectByPrimaryKey(Integer id);

    List<AppRiskTrackMission> selectAll();

    int updateByPrimaryKey(AppRiskTrackMission record);
}