package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.Assets;

import java.util.List;


public interface IAssetService {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer id);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}
