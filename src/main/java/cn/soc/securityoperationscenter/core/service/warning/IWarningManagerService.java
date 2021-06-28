package cn.soc.securityoperationscenter.core.service.warning;

import cn.soc.securityoperationscenter.server.pojo.warning.WarningManager;

import java.util.List;

public interface IWarningManagerService {

    int deleteByPrimaryKey(Integer id);

    int insert(WarningManager record);

    WarningManager selectByPrimaryKey(Integer id);

    List<WarningManager> selectAll();

    int updateByPrimaryKey(WarningManager record);
}
