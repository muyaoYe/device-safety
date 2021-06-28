package cn.soc.securityoperationscenter.server.dao.appsecurity;

import cn.soc.securityoperationscenter.server.pojo.appsecurity.AppRiskTrackMission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskTrackMission record);

    AppRiskTrackMission selectByPrimaryKey(Integer id);

    List<AppRiskTrackMission> selectAll();

    int updateByPrimaryKey(AppRiskTrackMission record);
}