package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.RiskCheckMission;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface RiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskCheckMission record);

    RiskCheckMission selectByPrimaryKey(Integer id);

    List<RiskCheckMission> selectAll();

    int updateByPrimaryKey(RiskCheckMission record);
}