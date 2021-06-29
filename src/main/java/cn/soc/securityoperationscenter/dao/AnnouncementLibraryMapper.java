package cn.soc.securityoperationscenter.dao;


import cn.soc.securityoperationscenter.entity.AnnouncementLibrary;
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