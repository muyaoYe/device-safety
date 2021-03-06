package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.RiskCheckMissionMapper;
import cn.soc.securityoperationscenter.entity.RiskCheckMission;
import cn.soc.securityoperationscenter.service.IRiskCheckMissionService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRiskCheckMissionServiceImpl implements IRiskCheckMissionService {

    @Autowired
    RiskCheckMissionMapper riskCheckMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = riskCheckMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(RiskCheckMission record) {
        int i = riskCheckMissionMapper.insert(record);
        return i;
    }

    @Override
    public RiskCheckMission selectByPrimaryKey(Integer id) {
        RiskCheckMission riskCheckMission = riskCheckMissionMapper.selectByPrimaryKey(id);
        return riskCheckMission;
    }

    @Override
    public PageResult selectAll(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        riskCheckMissionMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

//    @Override
//    public List<RiskCheckMission> selectAll() {
//        List<RiskCheckMission> riskCheckMissionList = riskCheckMissionMapper.selectAll();
//        return riskCheckMissionList;
//    }

    @Override
    public int updateByPrimaryKey(RiskCheckMission record) {
        int i = riskCheckMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
