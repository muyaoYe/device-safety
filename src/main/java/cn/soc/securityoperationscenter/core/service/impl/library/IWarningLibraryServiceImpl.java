package cn.soc.securityoperationscenter.core.service.impl.library;

import cn.soc.securityoperationscenter.core.service.library.IWarningLibraryService;
import cn.soc.securityoperationscenter.server.dao.library.WarningLibraryMapper;
import cn.soc.securityoperationscenter.server.pojo.library.WarningLibrary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
