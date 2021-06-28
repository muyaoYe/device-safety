package cn.soc.securityoperationscenter.server.dao.library;

import cn.soc.securityoperationscenter.server.pojo.library.AnnouncementLibrary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnnouncementLibrary record);

    AnnouncementLibrary selectByPrimaryKey(Integer id);

    List<AnnouncementLibrary> selectAll();

    int updateByPrimaryKey(AnnouncementLibrary record);
}