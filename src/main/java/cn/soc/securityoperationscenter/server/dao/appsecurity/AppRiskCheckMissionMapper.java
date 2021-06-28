package cn.soc.securityoperationscenter.server.dao.appsecurity;

import cn.soc.securityoperationscenter.server.pojo.appsecurity.AppRiskCheckMission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskCheckMission record);

    AppRiskCheckMission selectByPrimaryKey(Integer id);

    List<AppRiskCheckMission> selectAll();

    int updateByPrimaryKey(AppRiskCheckMission record);
}