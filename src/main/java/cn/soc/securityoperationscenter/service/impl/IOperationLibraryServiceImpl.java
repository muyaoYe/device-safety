package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.OperationLibraryMapper;
import cn.soc.securityoperationscenter.entity.OperationLibrary;
import cn.soc.securityoperationscenter.service.IOperationLibraryService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public PageResult selectAll(Integer pageNum , Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        List<OperationLibrary> list = operationLibraryMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

    @Override
    public int updateByPrimaryKey(OperationLibrary record) {
        int count = operationLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
