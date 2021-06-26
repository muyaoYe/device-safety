package cn.soc.securityoperationscenter.core.service.asset;

import cn.soc.securityoperationscenter.server.pojo.asset.Assets;

import java.util.List;

public interface IAssetService {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer id);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}
