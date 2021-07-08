package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.WarningManagerMapper;
import cn.soc.securityoperationscenter.entity.WarningManager;
import cn.soc.securityoperationscenter.service.IWarningManagerService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IWarningManagerServiceImpl implements IWarningManagerService {

    @Autowired
    private WarningManagerMapper warningManagerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int count = warningManagerMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public int insert(WarningManager record) {
        int count = warningManagerMapper.insert(record);
        return count;
    }

    @Override
    public WarningManager selectByPrimaryKey(Integer id) {
        WarningManager warningManager = warningManagerMapper.selectByPrimaryKey(id);
        return warningManager;
    }

    @Override
    public PageResult selectAll(Integer pageNum , Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        warningManagerMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

    @Override
    public int updateByPrimaryKey(WarningManager record) {
        int count = warningManagerMapper.updateByPrimaryKey(record);
        return count;
    }
}
