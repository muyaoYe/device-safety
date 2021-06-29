package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.WarningLibraryMapper;
import cn.soc.securityoperationscenter.entity.WarningLibrary;
import cn.soc.securityoperationscenter.service.IWarningLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IWarningLibraryServiceImpl implements IWarningLibraryService {

    @Autowired
    private WarningLibraryMapper warningLibraryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int count = warningLibraryMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public int insert(WarningLibrary record) {
        int count = warningLibraryMapper.insert(record);
        return count;
    }

    @Override
    public WarningLibrary selectByPrimaryKey(Integer id) {
        WarningLibrary warningLibrary = warningLibraryMapper.selectByPrimaryKey(id);
        return warningLibrary;
    }

    @Override
    public List<WarningLibrary> selectAll() {
        List<WarningLibrary> list = warningLibraryMapper.selectAll();
        return list;
    }

    @Override
    public int updateByPrimaryKey(WarningLibrary record) {
        int count = warningLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
