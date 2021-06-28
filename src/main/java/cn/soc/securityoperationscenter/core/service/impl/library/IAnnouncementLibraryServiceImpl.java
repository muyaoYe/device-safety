package cn.soc.securityoperationscenter.core.service.impl.library;

import cn.soc.securityoperationscenter.core.service.library.IAnnouncementLibraryService;
import cn.soc.securityoperationscenter.server.dao.library.AnnouncementLibraryMapper;
import cn.soc.securityoperationscenter.server.pojo.library.AnnouncementLibrary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public List<AnnouncementLibrary> selectAll() {
        List<AnnouncementLibrary> list = announcementLibraryMapper.selectAll();
        return list;
    }

    @Override
    public int updateByPrimaryKey(AnnouncementLibrary record) {
        int count = announcementLibraryMapper.updateByPrimaryKey(record);
        return count;
    }
}
