package cn.soc.securityoperationscenter.server.dao.user;

import cn.soc.securityoperationscenter.server.pojo.user.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}