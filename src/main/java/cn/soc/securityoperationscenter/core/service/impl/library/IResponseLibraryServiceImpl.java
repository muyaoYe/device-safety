package cn.soc.securityoperationscenter.core.service.impl.library;

import cn.soc.securityoperationscenter.core.service.library.IResponseLibraryService;
import cn.soc.securityoperationscenter.server.dao.library.ResponseLibraryMapper;
import cn.soc.securityoperationscenter.server.pojo.library.ResponseLibrary;
import org.springframework.beans.factory.annotation.Autowired;

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
