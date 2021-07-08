package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.AppRiskTrackMissionMapper;
import cn.soc.securityoperationscenter.entity.AppRiskTrackMission;
import cn.soc.securityoperationscenter.service.IAppRiskTrackMissionService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAppRiskTrackMissionServiceImpl implements IAppRiskTrackMissionService {

    @Autowired
    AppRiskTrackMissionMapper appRiskTrackMissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = appRiskTrackMissionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(AppRiskTrackMission record) {
        int i = appRiskTrackMissionMapper.insert(record);
        return i;
    }

    @Override
    public AppRiskTrackMission selectByPrimaryKey(Integer id) {
        AppRiskTrackMission appRiskTrackMission = appRiskTrackMissionMapper.selectByPrimaryKey(id);
        return appRiskTrackMission;
    }

    @Override
    public PageResult selectAll(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        appRiskTrackMissionMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

//    @Override
//    public List<AppRiskTrackMission> selectAll() {
//        List<AppRiskTrackMission> appRiskTrackMissionList = appRiskTrackMissionMapper.selectAll();
//        return appRiskTrackMissionList;
//    }

    @Override
    public int updateByPrimaryKey(AppRiskTrackMission record) {
        int i = appRiskTrackMissionMapper.updateByPrimaryKey(record);
        return i;
    }
}
