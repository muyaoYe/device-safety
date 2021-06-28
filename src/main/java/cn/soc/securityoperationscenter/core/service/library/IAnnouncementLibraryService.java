package cn.soc.securityoperationscenter.core.service.library;

import cn.soc.securityoperationscenter.server.pojo.library.AnnouncementLibrary;

import java.util.List;

public interface IAnnouncementLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(AnnouncementLibrary record);

    AnnouncementLibrary selectByPrimaryKey(Integer id);

    List<AnnouncementLibrary> selectAll();

    int updateByPrimaryKey(AnnouncementLibrary record);
}
