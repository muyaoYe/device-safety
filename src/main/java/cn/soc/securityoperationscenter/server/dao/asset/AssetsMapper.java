package cn.soc.securityoperationscenter.server.dao.asset;

import cn.soc.securityoperationscenter.server.pojo.asset.Assets;
import java.util.List;

public interface AssetsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer id);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}