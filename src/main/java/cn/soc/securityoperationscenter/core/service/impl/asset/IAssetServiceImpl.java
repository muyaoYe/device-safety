package cn.soc.securityoperationscenter.core.service.impl.asset;

import cn.soc.securityoperationscenter.core.service.asset.IAssetService;
import cn.soc.securityoperationscenter.server.dao.asset.AssetsMapper;
import cn.soc.securityoperationscenter.server.pojo.asset.Assets;
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
    public List<Assets> selectAll() {
        List<Assets> assetsList = assetsMapper.selectAll();
        return assetsList;
    }

    @Override
    public int updateByPrimaryKey(Assets record) {
        int i = assetsMapper.updateByPrimaryKey(record);
        return i;
    }
}
