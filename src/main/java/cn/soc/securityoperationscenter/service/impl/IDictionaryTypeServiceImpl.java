package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.DictionaryTypeMapper;
import cn.soc.securityoperationscenter.entity.DictionaryType;
import cn.soc.securityoperationscenter.service.IDictionaryTypeService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDictionaryTypeServiceImpl implements IDictionaryTypeService {

    @Autowired
    DictionaryTypeMapper dictionaryTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = dictionaryTypeMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(DictionaryType record) {
        int i = dictionaryTypeMapper.insert(record);
        return i;
    }

    @Override
    public DictionaryType selectByPrimaryKey(Integer id) {
        DictionaryType dictionaryType = dictionaryTypeMapper.selectByPrimaryKey(id);
        return dictionaryType;
    }

    @Override
    public PageResult selectAll(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        dictionaryTypeMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

//    @Override
//    public List<DictionaryType> selectAll() {
//        List<DictionaryType> dictionaryTypeList = dictionaryTypeMapper.selectAll();
//        return dictionaryTypeList;
//    }

    @Override
    public int updateByPrimaryKey(DictionaryType record) {
        int i = dictionaryTypeMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<DictionaryType> selectByName(String name) {
        List<DictionaryType> dictionaryTypeList = dictionaryTypeMapper.selectByName(name);
        return dictionaryTypeList;
    }
}
