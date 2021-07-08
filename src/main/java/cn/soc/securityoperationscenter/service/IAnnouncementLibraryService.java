package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.AnnouncementLibrary;
import com.github.pagehelper.Page;


import java.util.List;


public interface IAnnouncementLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(AnnouncementLibrary record);

    AnnouncementLibrary selectByPrimaryKey(Integer id);

    PageResult selectAll(Integer pageNum , Integer pageSize);

    int updateByPrimaryKey(AnnouncementLibrary record);
}
