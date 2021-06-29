package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.AppRiskTrackMission;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface AppRiskTrackMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskTrackMission record);

    AppRiskTrackMission selectByPrimaryKey(Integer id);

    List<AppRiskTrackMission> selectAll();

    int updateByPrimaryKey(AppRiskTrackMission record);
}