package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.AssetsMapper;
import cn.soc.securityoperationscenter.entity.Assets;
import cn.soc.securityoperationscenter.service.IAssetService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAssetServiceImpl implements IAssetService {

    @Autowired
    AssetsMapper assetsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = assetsMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(Assets record) {
        int i = assetsMapper.insert(record);
        return i;
    }

    @Override
    public Assets selectByPrimaryKey(Integer id) {
        Assets assets = assetsMapper.selectByPrimaryKey(id);
        return assets;
    }

    @Override
    public PageResult selectAll(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        assetsMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

//    @Override
//    public List<Assets> selectAll() {
//        List<Assets> assetsList = assetsMapper.selectAll();
//        return assetsList;
//    }

    @Override
    public int updateByPrimaryKey(Assets record) {
        int i = assetsMapper.updateByPrimaryKey(record);
        return i;
    }
}
