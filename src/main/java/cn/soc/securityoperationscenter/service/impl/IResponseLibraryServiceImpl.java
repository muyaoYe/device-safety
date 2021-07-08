package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.ResponseLibraryMapper;
import cn.soc.securityoperationscenter.entity.ResponseLibrary;
import cn.soc.securityoperationscenter.service.IResponseLibraryService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IResponseLibraryServiceImpl implements IResponseLibraryService {

    @Autowired
    private ResponseLibraryMapper responseLibraryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int count = responseLibraryMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public int insert(ResponseLibrary record) {
        int count = responseLibraryMapper.insert(record);
        return count;
    }

    @Override
    public ResponseLibrary selectByPrimaryKey(Integer id) {
        ResponseLibrary responseLibrary = responseLibraryMapper.selectByPrimaryKey(id);
        return responseLibrary;
    }

    @Override
    public PageResult selectAll(Integer pageNum , Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        responseLibraryMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

    @Override
    public int updateByPrimaryKey(ResponseLibrary record) {
        int count = responseLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
