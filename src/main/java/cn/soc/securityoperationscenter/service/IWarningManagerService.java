package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.WarningManager;

import java.util.List;

public interface IWarningManagerService {

    int deleteByPrimaryKey(Integer id);

    int insert(WarningManager record);

    WarningManager selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(WarningManager record);
}
