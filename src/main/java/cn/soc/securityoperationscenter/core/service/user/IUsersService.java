package cn.soc.securityoperationscenter.core.service.user;

import cn.soc.securityoperationscenter.server.pojo.user.Users;

import java.util.List;

public interface IUsersService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}
