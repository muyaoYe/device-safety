package cn.soc.securityoperationscenter.server.dao.appsecurity;

import cn.soc.securityoperationscenter.server.pojo.appsecurity.AppRiskCheckMission;
import java.util.List;

public interface AppRiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskCheckMission record);

    AppRiskCheckMission selectByPrimaryKey(Integer id);

    List<AppRiskCheckMission> selectAll();

    int updateByPrimaryKey(AppRiskCheckMission record);
}