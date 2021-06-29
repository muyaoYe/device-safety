package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.AppRiskCheckMission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Mapper
public interface AppRiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppRiskCheckMission record);

    AppRiskCheckMission selectByPrimaryKey(Integer id);

    List<AppRiskCheckMission> selectAll();

    int updateByPrimaryKey(AppRiskCheckMission record);
}