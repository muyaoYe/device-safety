package cn.soc.securityoperationscenter.server.dao.asset;

import cn.soc.securityoperationscenter.server.pojo.asset.Assets;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer id);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}