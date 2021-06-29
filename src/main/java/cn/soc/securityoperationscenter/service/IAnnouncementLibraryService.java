package cn.soc.securityoperationscenter.service;



import cn.soc.securityoperationscenter.entity.AnnouncementLibrary;


import java.util.List;


public interface IAnnouncementLibraryService {

    int deleteByPrimaryKey(Integer id);

    int insert(AnnouncementLibrary record);

    AnnouncementLibrary selectByPrimaryKey(Integer id);

    List<AnnouncementLibrary> selectAll();

    int updateByPrimaryKey(AnnouncementLibrary record);
}
