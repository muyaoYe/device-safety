package cn.soc.securityoperationscenter.core.service.impl.warning;

import cn.soc.securityoperationscenter.core.service.warning.IWarningManagerService;
import cn.soc.securityoperationscenter.server.dao.warning.WarningManagerMapper;
import cn.soc.securityoperationscenter.server.pojo.warning.WarningManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public List<WarningManager> selectAll() {
        List<WarningManager> list = warningManagerMapper.selectAll();
        return list;
    }

    @Override
    public int updateByPrimaryKey(WarningManager record) {
        int count = warningManagerMapper.updateByPrimaryKey(record);
        return count;
    }
}
