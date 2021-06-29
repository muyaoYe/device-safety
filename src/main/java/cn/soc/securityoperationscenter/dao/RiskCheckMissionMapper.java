package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.RiskCheckMission;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface RiskCheckMissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskCheckMission record);

    RiskCheckMission selectByPrimaryKey(Integer id);

    List<RiskCheckMission> selectAll();

    int updateByPrimaryKey(RiskCheckMission record);
}