package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.Assets;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface AssetsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer id);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}