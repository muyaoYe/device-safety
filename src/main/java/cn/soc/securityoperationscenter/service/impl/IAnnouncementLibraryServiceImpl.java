package cn.soc.securityoperationscenter.service.impl;


import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.AnnouncementLibraryMapper;
import cn.soc.securityoperationscenter.entity.AnnouncementLibrary;
import cn.soc.securityoperationscenter.service.IAnnouncementLibraryService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAnnouncementLibraryServiceImpl implements IAnnouncementLibraryService {

    @Autowired
    private AnnouncementLibraryMapper announcementLibraryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int count = announcementLibraryMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public int insert(AnnouncementLibrary record) {
        int count = announcementLibraryMapper.insert(record);
        return count;
    }

    @Override
    public AnnouncementLibrary selectByPrimaryKey(Integer id) {
        AnnouncementLibrary announcementLibrary = announcementLibraryMapper.selectByPrimaryKey(id);
        return announcementLibrary;
    }

    @Override
    public PageResult selectAll(Integer pageNum , Integer pageSize) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        announcementLibraryMapper.selectAll();
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
    }

    @Override
    public int updateByPrimaryKey(AnnouncementLibrary record) {
        int count = announcementLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
