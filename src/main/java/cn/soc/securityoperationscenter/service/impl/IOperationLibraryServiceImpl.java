package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.OperationLibraryMapper;
import cn.soc.securityoperationscenter.entity.OperationLibrary;
import cn.soc.securityoperationscenter.service.IOperationLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
