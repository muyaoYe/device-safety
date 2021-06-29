package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.dao.ResponseLibraryMapper;
import cn.soc.securityoperationscenter.entity.ResponseLibrary;
import cn.soc.securityoperationscenter.service.IResponseLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<ResponseLibrary> selectAll() {
        List<ResponseLibrary> list = responseLibraryMapper.selectAll();
        return list;
    }

    @Override
    public int updateByPrimaryKey(ResponseLibrary record) {
        int count = responseLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
