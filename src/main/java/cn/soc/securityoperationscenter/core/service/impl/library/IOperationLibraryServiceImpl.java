package cn.soc.securityoperationscenter.core.service.impl.library;

import cn.soc.securityoperationscenter.core.service.library.IOperationLibraryService;
import cn.soc.securityoperationscenter.server.dao.library.OperationLibraryMapper;
import cn.soc.securityoperationscenter.server.pojo.library.OperationLibrary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IOperationLibraryServiceImpl implements IOperationLibraryService {

    @Autowired
    private OperationLibraryMapper operationLibraryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int count = operationLibraryMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public int insert(OperationLibrary record) {
        int count = operationLibraryMapper.insert(record);
        return count;
    }

    @Override
    public OperationLibrary selectByPrimaryKey(Integer id) {
        OperationLibrary operationLibrary = operationLibraryMapper.selectByPrimaryKey(id);
        return operationLibrary;
    }

    @Override
    public List<OperationLibrary> selectAll() {
        List<OperationLibrary> list = operationLibraryMapper.selectAll();
        return list;
    }

    @Override
    public int updateByPrimaryKey(OperationLibrary record) {
        int count = operationLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
