package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.WarningManager;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface WarningManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarningManager record);

    WarningManager selectByPrimaryKey(Integer id);

    List<WarningManager> selectAll();

    int updateByPrimaryKey(WarningManager record);
}